
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
public class PhotographerUserDao extends BaseDaoImpl<PhotographerExtra> {

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}


	public PhotographerExtra findByLoginName(String loginName,String password){
		Map map=new HashMap();
		map.put("USER_NAME", loginName);
		map.put("PASSWORD", password);
		List<PhotographerExtra> list = executeRawSql(UserTypeEnum.PHOTOGRAPHER.getLoginSql(), map);
		if (list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}



}
