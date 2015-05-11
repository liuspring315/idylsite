package com.idyl.site.dao.order;

import com.idyl.site.constant.OrderConstant;
import com.idyl.site.dao.BaseDaoImpl;
import com.idyl.site.dao.BaseSpringJdbcDaoImpl;
import com.idyl.site.data.PhotoOrder;
import com.idyl.site.rowmapper.OrderRowmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lk on 2015/5/4.
 */
@Component
public class OrderDao  extends BaseDaoImpl<PhotoOrder> {


    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<PhotoOrder> getPhotoOrderByPhotographerId(Integer pId){
        Map<String, Integer> parmMap = new HashMap<String, Integer>();
        parmMap.put("service_provider_id", pId);
        return namedParameterJdbcTemplate.query(OrderConstant.QUERY_ORDER_PROVIDER, parmMap, new OrderRowmapper());
    }

    public Integer updateOrderStat(int userId, int orderId, int stat){
        Map<String, Integer> parmMap = new HashMap<String, Integer>();
        parmMap.put("order_stat", stat);
        parmMap.put("service_provider_id", userId);
        parmMap.put("id", orderId);
        return namedParameterJdbcTemplate.update(OrderConstant.UPDATE_ORDER_STAT, parmMap);
    }

    public List<PhotoOrder> searchOrderByDesc(int userId, String desc){
        Map<String, Object> parmMap = new HashMap<String, Object>();
        parmMap.put("service_provider_id", userId);
        parmMap.put("desc", desc);
        return namedParameterJdbcTemplate.query(OrderConstant.SEARCH_ORDER_DESC, parmMap, new OrderRowmapper());
    }
}
