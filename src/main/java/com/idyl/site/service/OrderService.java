package com.idyl.site.service;

import com.idyl.site.constant.OrderConstant;
import com.idyl.site.dao.order.OrderDao;
import com.idyl.site.data.PhotoOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lk on 2015/5/4.
 */
@Component
@Transactional(readOnly = true)
public class OrderService {
    @Autowired
    OrderDao orderDao;

   public List<PhotoOrder> getOrderListByPhotographerId(int id){
        return orderDao.getPhotoOrderByPhotographerId(id);
   }

    public boolean confirmOrder(int userId, int orderId){
        orderDao.updateOrderStat(userId, orderId, OrderConstant.OREDER_CONFIRMED);
        return true;
    }

    public List<PhotoOrder> searchOrder(int userId, String desc){
        return orderDao.searchOrderByDesc(userId, desc);
    }
}
