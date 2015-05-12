package com.idyl.site.web.manager.photographer;

import com.google.code.kaptcha.Constants;
import com.idyl.site.data.PhotographerExtra;
import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.service.manager.photographer.PhotographerAuthenticateService;
import com.idyl.site.web.BaseController;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by spring on 15-4-27.
 */
@Controller
@RequestMapping("manager/photographer/")
public class PhotographerAuthenticateController extends BaseController {

	@Value("#{applicationProps['imgages.photographer.idcard']}")
	private String imgagesPhotographerIdcard;

    @Autowired
    private PhotographerAuthenticateService photographerAuthenticateService;

	@RequestMapping("authenticate")
	public String index(HttpServletRequest request){

		return "manager/photographer/photographer_authenticate";

	}

    /**
     * 申请初级认证
     * @param request
     * @param certificateType
     * @param certificateNum
     * @return
     */
	@RequestMapping("authenticateUpdate")
	public String authenticateUpdate(MultipartFile idcard_back,MultipartFile idcard_front, HttpServletRequest request,Integer certificateType,String certificateNum){
		PhotographerExtra userGeneralInfo = (PhotographerExtra)super.getCurrUser(request);
        userGeneralInfo.setCertificateNum(certificateNum);
        userGeneralInfo.setCertificateType(certificateType);
		try {

			String picName = ((CommonsMultipartFile)idcard_back).getFileItem().getName();
			String subFix = picName.substring(picName.lastIndexOf(".")+1).toUpperCase();
			if(null != subFix && (subFix.equals("JPG") || subFix.equals("JPEG"))) {
				String suffix = picName.substring(picName.lastIndexOf(".")).toLowerCase();
				if (suffix.contains("%")) {
					suffix = suffix.replaceAll("%", "C9");
				} else if (suffix.contains("jsp")) {
					suffix = suffix.replaceAll("jsp", "C9");
				}
				String newfilename = ((CommonsMultipartFile) idcard_back).getFileItem().getFieldName() + "_"
                        + new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS").format(new Date()) + suffix;
//						BufferedImage image = ImageIO.read(item.getInputStream());
				String str1 = new StringBuilder().append(File.separator).append(userGeneralInfo.getUserName())
                        .append(File.separator).append("idcard").append(File.separator)
						.append(newfilename).toString();
				File file1 = new File(imgagesPhotographerIdcard + str1);
				//创建文件夹
				if (!(file1.getParentFile().exists())) {
					file1.getParentFile().mkdirs();
				}

				//通过CommonsMultipartFile的方法直接写文件（注意这个时候）
				idcard_back.transferTo(file1);
				userGeneralInfo.setIdcardBack(str1);
			}


			picName = ((CommonsMultipartFile)idcard_front).getFileItem().getName();
			subFix = picName.substring(picName.lastIndexOf(".")+1).toUpperCase();
			if(null != subFix && (subFix.equals("JPG") || subFix.equals("JPEG"))) {
				String suffix = picName.substring(picName.lastIndexOf(".")).toLowerCase();
				if (suffix.contains("%")) {
					suffix = suffix.replaceAll("%", "C9");
				} else if (suffix.contains("jsp")) {
					suffix = suffix.replaceAll("jsp", "C9");
				}
				String newfilename = ((CommonsMultipartFile) idcard_front).getFileItem().getFieldName() + "_" + new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS").format(new Date()) + suffix;
//						BufferedImage image = ImageIO.read(item.getInputStream());
                String str1 = new StringBuilder().append(File.separator).append(userGeneralInfo.getUserName()).append(File.separator).append("idcard").append(File.separator)
                        .append(newfilename).toString();
				File file1 = new File(imgagesPhotographerIdcard + str1);
				//创建文件夹
				if (!(file1.getParentFile().exists())) {
					file1.getParentFile().mkdirs();
				}

				//通过CommonsMultipartFile的方法直接写文件（注意这个时候）
                idcard_front.transferTo(file1);
				userGeneralInfo.setIdcardFront(str1);
			}


            if(userGeneralInfo.getIdcardBack() != null && userGeneralInfo.getIdcardFront() != null){
                photographerAuthenticateService.authenticateUpdate(userGeneralInfo);
            }
		}catch (Exception e){
            e.printStackTrace();
		}
        return "redirect:/manager/photographer/authenticate";
	}

    @RequestMapping("/idcard")
    public ModelAndView handleRequest(String path, HttpServletResponse response) throws Exception {

        response.setDateHeader("Expires", 0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");
        // return a jpeg
        response.setContentType("image/jpeg");
        File file1 = new File(imgagesPhotographerIdcard + path);

        ServletOutputStream out = response.getOutputStream();
        // write the data out
        ImageIO.write(ImageIO.read(file1), "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
        return null;
    }
}