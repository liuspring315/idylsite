package com.idyl.site.web.manager.photographer;

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

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
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
	public String authenticateUpdate(HttpServletRequest request,Integer certificateType,String certificateNum){
		PhotographerExtra userGeneralInfo = (PhotographerExtra)super.getCurrUser(request);
        userGeneralInfo.setCertificateNum(certificateNum);
        userGeneralInfo.setCertificateType(certificateType);
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			File temp = new File(imgagesPhotographerIdcard);
			if (!temp.exists()) {
				temp.mkdirs();
			}
			factory.setRepository(new File(imgagesPhotographerIdcard));
			factory.setSizeThreshold(1048576);
			ServletFileUpload upload = new ServletFileUpload(factory);
            @SuppressWarnings("unchecked")
			List<FileItem> fileItems = upload.parseRequest(request);
			for (FileItem item : fileItems) {
				if ((!(item.isFormField())) && item.getFieldName().indexOf("idcard")>=0) {
					String picName = item.getName();
					String subFix = picName.substring(picName.lastIndexOf(".")+1).toUpperCase();
					if(null != subFix && (subFix.equals("JPG") || subFix.equals("JPEG"))) {
						String suffix = item.getName().substring(item.getName().lastIndexOf(".")).toLowerCase();
						if (suffix.contains("%")) {
							suffix = suffix.replaceAll("%", "C9");
						} else if (suffix.contains("jsp")) {
							suffix = suffix.replaceAll("jsp", "C9");
						}
						String newfilename = item.getFieldName() + "_" + new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS").format(new Date()) + suffix;
//						BufferedImage image = ImageIO.read(item.getInputStream());
						String str1 = new StringBuilder().append(File.separator).append(userGeneralInfo.getUserName()).append(File.separator)
								.append(newfilename).toString();
						File file1 = new File(imgagesPhotographerIdcard+str1);
						//创建文件夹
						if (!(file1.getParentFile().exists())) {
							file1.getParentFile().mkdirs();
						}
						if (!(file1.exists())) {
							file1.createNewFile();
						}
						item.write(file1);
						if(item.getFieldName().equals("idcard_front")){
							userGeneralInfo.setIdcardFront(str1);
						}else if(item.getFieldName().equals("idcard_back")){
                            userGeneralInfo.setIdcardBack(str1);
						}

					}
				}
			}
            if(userGeneralInfo.getIdcardBack() != null && userGeneralInfo.getIdcardFront() != null){
                photographerAuthenticateService.authenticateUpdate(userGeneralInfo);
            }
		}catch (Exception e){

		}
        return "redirect:/manager/photographer/authenticate";
	}
}