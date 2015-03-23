
/**
 * Created on 2012-8-16 下午4:51:04 
 * <p>描述:    [所属模块及功能描述]</p>
 * <p>版权所有： 有限责任公司</p>
 * @author liuzhaochun
 * @version 0.1
 */

package com.idyl.site.dao.account;

import com.idyl.site.dao.BaseDaoImpl;
import com.idyl.site.dao.BaseSpringJdbcDaoImpl;
import com.idyl.site.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 作成日期： 2012-8-16 
 * <p>功能描述:  用户对象的Dao interface.</p>
 * @author  liuzhaocun
 * @version 0.1
 */
@Component
public class UserDao extends BaseDaoImpl<CustomerExtra> {

    private static String USER_BY_LOGINNAME = "SELECT USER_TYPE userType, USER_NAME as userName, EMAIL email, PASSWORD password, FAMILY_NAME familyName, LAST_NAME lastName, MOBILE mobile, TELEPHONE telephone, LOCATION location, BIRTHDAY birthday, HEAD_THUMB headThumb, " +
		    "ADD_TIME addTime, BEGIN_TIME beginTime,ID id FROM user_general_info g, " +
		    "WHERE user_name = :USER_NAME and password = :PASSWORD";
	protected static Map<Integer,String>  selectExtraSqlMap = new HashMap<Integer, String>();
	static {
		//		1会员
//		2摄影师
//		3造型师
//		4摄影机构管理员
		selectExtraSqlMap.put(UserTypeEnum.CUSTOMER.getCode(),"SELECT USER_TYPE, USER_NAME, EMAIL email, PASSWORD password," +
				" FAMILY_NAME , LAST_NAME , MOBILE mobile, TELEPHONE telephone, LOCATION location, BIRTHDAY birthday, " +
				"HEAD_THUMB , " +
				"ADD_TIME , BEGIN_TIME ,ID id," +
				"user_general_info_id ,signature,destination,remark" +
				" FROM user_general_info g, customer_extra c " +
				"WHERE g.user_type = 1 and g.id = c.user_general_info_id and  user_name = :USER_NAME and password = :PASSWORD");
		selectExtraSqlMap.put(UserTypeEnum.PHOTOGRAPHER.getCode(),"SELECT USER_TYPE userType, USER_NAME as userName, EMAIL email, PASSWORD password, FAMILY_NAME familyName, LAST_NAME lastName, MOBILE mobile, TELEPHONE telephone, LOCATION location, BIRTHDAY birthday, HEAD_THUMB headThumb, " +
				"ADD_TIME addTime, BEGIN_TIME beginTime,ID id," +
				"user_general_info_id userGeneralInfoId," +
				"introduction,\n" +
				"authentication,\n" +
				"certificate_type certificateType,\n" +
				"certificate_num certificateNum,\n" +
				"idcard_front idcardFront,\n" +
				"idcard_back idcardBack,\n" +
				"deposit,\n" +
				"remark,\n" +
				"register_check_state registerCheckState" +
				" FROM user_general_info g, photographer_extra c " +
				"WHERE g.user_type = 2 and g.id = c.user_general_info_id and user_name = :USER_NAME and password = :PASSWORD");
		selectExtraSqlMap.put(UserTypeEnum.STYLIST.getCode(),"SELECT USER_TYPE userType, USER_NAME as userName, EMAIL email, PASSWORD password, FAMILY_NAME familyName, LAST_NAME lastName, MOBILE mobile, TELEPHONE telephone, LOCATION location, BIRTHDAY birthday, HEAD_THUMB headThumb, " +
				"ADD_TIME addTime, BEGIN_TIME beginTime,ID id," +
				"user_general_info_id userGeneralInfoId,introduction,\n" +
				"authentication,\n" +
				"certificate_type certificateType,\n" +
				"certificate_num certificateNum,\n" +
				"idcard_front idcardFront,\n" +
				"idcard_back idcardBack,\n" +
				"deposit,\n" +
				"remark,\n" +
				"register_check_state registerCheckState" +
				" FROM user_general_info g, stylist_extra c " +
				"WHERE g.user_type = 3 and g.id = c.user_general_info_id and user_name = :USER_NAME and password = :PASSWORD");
		selectExtraSqlMap.put(UserTypeEnum.AGENCY.getCode(),"SELECT USER_TYPE userType, USER_NAME as userName, EMAIL email, PASSWORD password, FAMILY_NAME familyName, LAST_NAME lastName, MOBILE mobile, TELEPHONE telephone, LOCATION location, BIRTHDAY birthday, HEAD_THUMB headThumb, " +
				"ADD_TIME addTime, BEGIN_TIME beginTime,ID id," +
				"user_general_info_id userGeneralInfoId,authentication,\n" +
				"certificate_type certificateType,\n" +
				"certificate_num certificateNum,\n" +
				"idcard_front idcardFront,\n" +
				"idcard_back idcardBack,\n" +
				"remark,\n" +
				"deposit,\n" +
				"introduction,\n" +
				"photographer_desc photographerDesc,\n" +
				"stylist_desc stylistDesc,\n" +
				"dress_desc dressDesc,\n" +
				"address,\n" +
				"register_check_state registerCheckState" +
				" FROM user_general_info g, agency_extra c " +
				"WHERE g.user_type = 4 and  g.id = c.user_general_info_id and user_name = :USER_NAME and password = :PASSWORD");
	}


	UserDao() {
		super();
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

    public AgencyExtra findAgencyExtraByLoginName(String loginName,String password){
	    Map map=new HashMap();
	    map.put("USER_NAME", loginName);
	    map.put("PASSWORD", password);
	    List<AgencyExtra> list = namedParameterJdbcTemplate.queryForList(selectExtraSqlMap.get(UserTypeEnum.AGENCY.getCode()), map,AgencyExtra.class);
        if(list != null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }


	public StylistExtra findStylistExtraExtraByLoginName(String loginName,String password){
		Map map=new HashMap();
		map.put("USER_NAME", loginName);
		map.put("PASSWORD", password);
		List<StylistExtra> list = namedParameterJdbcTemplate.queryForList(selectExtraSqlMap.get(UserTypeEnum.STYLIST.getCode()),
				map,StylistExtra.class);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	public PhotographerExtra findPhotographerExtraExtraByLoginName(String loginName,String password){
		Map map=new HashMap();
		map.put("USER_NAME", loginName);
		map.put("PASSWORD", password);
		List<PhotographerExtra> list = namedParameterJdbcTemplate.queryForList(selectExtraSqlMap.get(UserTypeEnum.PHOTOGRAPHER.getCode()),
				map,PhotographerExtra.class);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

//	public CustomerExtra findByLoginName(String loginName,String password){
//		Map map=new HashMap();
//		map.put("USER_NAME", loginName);
//		map.put("PASSWORD", password);
//		List<CustomerExtra> list = namedParameterJdbcTemplate.queryForList(selectExtraSqlMap.get(UserTypeEnum.CUSTOMER.getCode()), map, CustomerExtra.class);
//		if(list != null && list.size() > 0){
//			return list.get(0);
//		}
//		return null;
//	}

	public CustomerExtra findByLoginName(String loginName,String password){
		Map map=new HashMap();
		map.put("USER_NAME", loginName);
		map.put("PASSWORD", password);
		List<CustomerExtra> list = executeRawSql(selectExtraSqlMap.get(UserTypeEnum.CUSTOMER.getCode()),map);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}


}
