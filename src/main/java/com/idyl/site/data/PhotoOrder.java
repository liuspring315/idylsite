package com.idyl.site.data;

import com.idyl.site.dao.Column;
import com.idyl.site.dao.Table;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by lk on 2015/5/4.
 */
@Table(name = "photo_order")
public class PhotoOrder implements java.io.Serializable{

    private Integer id;
    private Integer cstmrId;
    private Integer photoGoodsId;
    private Integer serviceProviderType;
    private Integer serviceProviderId;
    private String goodsName;
    private String goodsDesc;
    private Timestamp photoBeginDate;
    private Timestamp photoEndDate;
    private String place;
    private Integer photoType;
    private Integer service;
    private BigDecimal totalPrice;
    private BigDecimal advancePrice;
    private Integer originalNum;
    private Integer processingNum;
    private Integer orderStat;
    private Timestamp orderDate;
    private String cstmrRemarks;

    public PhotoOrder(){};

    public PhotoOrder(Integer id, Integer cstmrId, Integer photoGoodsId, Integer serviceProviderType, Integer serviceProviderId, String goodsName, String goodsDesc, Timestamp photoBeginDate, Timestamp photoEndDate, String place, Integer photoType, Integer service, BigDecimal totalPrice, BigDecimal advancePrice, Integer originalNum, Integer processingNum, Integer orderStat, Timestamp orderDate, String cstmrRemarks) {
        this.id = id;
        this.cstmrId = cstmrId;
        this.photoGoodsId = photoGoodsId;
        this.serviceProviderType = serviceProviderType;
        this.serviceProviderId = serviceProviderId;
        this.goodsName = goodsName;
        this.goodsDesc = goodsDesc;
        this.photoBeginDate = photoBeginDate;
        this.photoEndDate = photoEndDate;
        this.place = place;
        this.photoType = photoType;
        this.service = service;
        this.totalPrice = totalPrice;
        this.advancePrice = advancePrice;
        this.originalNum = originalNum;
        this.processingNum = processingNum;
        this.orderStat = orderStat;
        this.orderDate = orderDate;
        this.cstmrRemarks = cstmrRemarks;
    }

    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "cstmr_id")
    public Integer getCstmrId() {
        return cstmrId;
    }

    public void setCstmrId(Integer cstmrId) {
        this.cstmrId = cstmrId;
    }

    @Column(name = "photo_goods_id")
    public Integer getPhotoGoodsId() {
        return photoGoodsId;
    }

    public void setPhotoGoodsId(Integer photoGoodsId) {
        this.photoGoodsId = photoGoodsId;
    }

    @Column(name = "service_provider_type")
    public Integer getServiceProviderType() {
        return serviceProviderType;
    }

    public void setServiceProviderType(Integer serviceProviderType) {
        this.serviceProviderType = serviceProviderType;
    }

    @Column(name = "service_provider_id")
    public Integer getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(Integer serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    @Column(name = "goods_name")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Column(name = "goods_desc")
    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    @Column(name = "photo_begin_date")
    public Timestamp getPhotoBeginDate() {
        return photoBeginDate;
    }

    public void setPhotoBeginDate(Timestamp photoBeginDate) {
        this.photoBeginDate = photoBeginDate;
    }

    @Column(name = "photo_end_date")
    public Timestamp getPhotoEndDate() {
        return photoEndDate;
    }

    public void setPhotoEndDate(Timestamp photoEndDate) {
        this.photoEndDate = photoEndDate;
    }

    @Column(name = "place")
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Column(name = "photo_type")
    public Integer getPhotoType() {
        return photoType;
    }

    public void setPhotoType(Integer photoType) {
        this.photoType = photoType;
    }

    @Column(name = "service")
    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    @Column(name = "total_price")
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Column(name = "advance_payment")
    public BigDecimal getAdvancePrice() {
        return advancePrice;
    }

    public void setAdvancePrice(BigDecimal advancePrice) {
        this.advancePrice = advancePrice;
    }

    @Column(name = "original_num")
    public Integer getOriginalNum() {
        return originalNum;
    }

    public void setOriginalNum(Integer originalNum) {
        this.originalNum = originalNum;
    }

    @Column(name = "processing_num")
    public Integer getProcessingNum() {
        return processingNum;
    }

    public void setProcessingNum(Integer processingNum) {
        this.processingNum = processingNum;
    }

    @Column(name = "order_stat")
    public Integer getOrderStat() {
        return orderStat;
    }

    public void setOrderStat(Integer orderStat) {
        this.orderStat = orderStat;
    }

    @Column(name = "order_date")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    @Column(name = "cstmr_remarks")
    public String getCstmrRemarks() {
        return cstmrRemarks;
    }

    public void setCstmrRemarks(String cstmrRemarks) {
        this.cstmrRemarks = cstmrRemarks;
    }


    private String loginName;
    private String name;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
