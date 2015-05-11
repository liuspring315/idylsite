package com.idyl.site.constant;

/**
 * Created by lk on 2015/5/10.
 */
public class OrderConstant {

    public static String QUERY_ORDER_PROVIDER = "select t.* , p.user_name, p.family_name, p.last_name from  photo_order t,  user_general_info p where service_provider_id = :service_provider_id and t.cstmr_id = p.id order by order_date desc";

    public static String UPDATE_ORDER_STAT = "update photo_order set order_stat = :order_stat where service_provider_id = :service_provider_id and id = :id";

    public static String SEARCH_ORDER_DESC = "select t.* , p.user_name, p.family_name, p.last_name from  photo_order t,  user_general_info p where t.service_provider_id = :service_provider_id and (t.goods_name like '%:desc%' " +
            " or p.user_name like '%:desc%' or (p.family_name + p.last_name) like '%:desc%' or t.place like '%:desc%');";

    public static Integer OREDER_PRE = 0;
    public static Integer OREDER_CONFIRMED = 1;
    public static Integer OREDER_FINISH = 2;

}
