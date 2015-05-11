package com.idyl.site.rowmapper;

import com.idyl.site.data.PhotoOrder;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lk on 2015/5/10.
 */
public class OrderRowmapper implements RowMapper {

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        PhotoOrder order = new PhotoOrder();
        order.setId(rs.getInt("id"));
        order.setCstmrId(rs.getInt("cstmr_id"));
        order.setPhotoGoodsId(rs.getInt("photo_goods_id"));
        order.setServiceProviderType(rs.getInt("service_provider_type"));
        order.setServiceProviderId(rs.getInt("service_provider_id"));
        order.setGoodsName(rs.getString("goods_name"));
        order.setGoodsDesc(rs.getString("goods_desc"));
        order.setPhotoBeginDate(rs.getTimestamp("photo_begin_date"));
        order.setPhotoEndDate(rs.getTimestamp("photo_end_date"));
        order.setPlace(rs.getString("place"));
        order.setPhotoType(rs.getInt("photo_type"));
        order.setService(rs.getInt("service"));
        order.setTotalPrice(rs.getBigDecimal("total_price"));
        order.setAdvancePrice(rs.getBigDecimal("advance_payment"));
        order.setOriginalNum(rs.getInt("original_num"));
        order.setProcessingNum(rs.getInt("processing_num"));
        order.setOrderStat(rs.getInt("order_stat"));
        order.setOrderDate(rs.getTimestamp("order_date"));
        order.setCstmrRemarks(rs.getString("cstmr_remarks"));

        order.setLoginName(rs.getString("user_name"));
        order.setName(rs.getString("family_name")+rs.getString("last_namefrom"));
        return order;
    }
}
