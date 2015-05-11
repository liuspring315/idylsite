package com.idyl.site.dao.manager.photographer;

import com.idyl.site.dao.BaseDaoImpl;
import com.idyl.site.data.PhotographerExtra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @类功能说明：摄影师后台维护DAO
 * @类包：com.idyl.site.dao.manager.photographer
 * @修改日期：
 * @修改说明：
 * @公司名称：首都信息发展股份有限公司
 * @作者：zhaochun
 * @创建时间：2015-05-11
 */
@Component
public class PhotographerAuthenticateDAO extends BaseDaoImpl<PhotographerExtra> {

    final static String PHOTOGRAPHER_AUTHENTICATE_UPDATE = "UPDATE photographer_extra SET certificate_type = ?,certificate_num = ?,idcard_front = ?,idcard_back = ?,authentication_stat = 1 WHERE user_general_info_id = ?";
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public void authenticateUpdate(PhotographerExtra photographerExtra){
        this.jdbcTemplate.update(PHOTOGRAPHER_AUTHENTICATE_UPDATE,
                photographerExtra.getCertificateType(),
                photographerExtra.getCertificateNum(),
                photographerExtra.getIdcardFront(),
                photographerExtra.getIdcardBack(),
                photographerExtra.getId());
    }
}
