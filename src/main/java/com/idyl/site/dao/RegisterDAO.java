package com.idyl.site.dao;

import com.idyl.site.data.UserGeneralInfo;
import com.idyl.site.data.UserTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by spring on 15-3-17.
 */
@Component
public class RegisterDAO extends BaseSpringJdbcDaoImpl {

	private static String USER_BY_LOGINNAME_OR_EMAIL = "SELECT ID,USER_TYPE,USER_NAME,EMAIL FROM user_general_info WHERE USER_NAME = ? OR EMAIL = ?";

	private static String INSERT_USER_GENERAL_INFO = "INSERT INTO user_general_info (user_type, user_name, email, password, family_name, last_name, mobile, telephone, location, birthday, head_thumb, add_time, begin_time) VALUES (:userType, :userName, :email, :password, :familyName, :lastName, :mobile, :telephone, :location, :birthday, :headThumb,now(), now())";

	protected static Map<Integer,String> insertExtraSqlMap = new HashMap<Integer, String>();
	static {
		//		1会员
//		2摄影师
//		3造型师
//		4摄影机构管理员
		insertExtraSqlMap.put(UserTypeEnum.CUSTOMER.getCode(),"INSERT INTO customer_extra (user_general_info_id) VALUES (:userGeneralInfoId)");
		insertExtraSqlMap.put(UserTypeEnum.PHOTOGRAPHER.getCode(),"INSERT INTO photographer_extra (user_general_info_id,authentication,register_check_state) VALUES (:userGeneralInfoId,0,1)");
		insertExtraSqlMap.put(UserTypeEnum.STYLIST.getCode(),"INSERT INTO stylist_extra (user_general_info_id,authentication,register_check_state) VALUES (:userGeneralInfoId,0,1)");
		insertExtraSqlMap.put(UserTypeEnum.AGENCY.getCode(),"INSERT INTO agency_extra (user_general_info_id,authentication,register_check_state) VALUES (:userGeneralInfoId,0,1)");
	}
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	public Map<String,Object> findByLoginName(String userName,String email){
		List<Map<String,Object>> list = jdbcTemplate.queryForList(USER_BY_LOGINNAME_OR_EMAIL, new Object[]{userName,email});
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	public int insertGeneralInfo(UserGeneralInfo userGeneralInfo){
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource ps=new BeanPropertySqlParameterSource(userGeneralInfo);
		namedParameterJdbcTemplate.update(INSERT_USER_GENERAL_INFO, ps, keyHolder);
		int id = keyHolder.getKey().intValue();
//		1会员
//		2摄影师
//		3造型师
//		4摄影机构管理员
		Map namedParameters = Collections.singletonMap("userGeneralInfoId", id);
		namedParameterJdbcTemplate.update(
				insertExtraSqlMap.get(userGeneralInfo.getUserType()),
				namedParameters);

		return id;
	}
}
