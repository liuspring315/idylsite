package com.idyl.site.data;

import com.idyl.site.dao.Column;
import com.idyl.site.dao.Table;

/**
 * StylistExtra entity. @author MyEclipse Persistence Tools
 */
@Table(name = "stylist_extra")
public class StylistExtra extends  UserGeneralInfo implements java.io.Serializable {

	// Fields

	private Integer userGeneralInfoId;
	private String introduction;
	private Integer authentication;
	private Integer certificateType;
	private String certificateNum;
	private String idcardFront;
	private String idcardBack;
	private Double deposit;
	private String remark;


	// Constructors

	/** default constructor */
	public StylistExtra() {
	}

	/** minimal constructor */
	public StylistExtra(Integer userGeneralInfoId) {
		this.userGeneralInfoId = userGeneralInfoId;
	}

	/** full constructor */
	public StylistExtra(Integer userGeneralInfoId, String introduction,
			Integer authentication, Integer certificateType,
			String certificateNum, String idcardFront, String idcardBack,
			Double deposit, String remark) {
		this.userGeneralInfoId = userGeneralInfoId;
		this.introduction = introduction;
		this.authentication = authentication;
		this.certificateType = certificateType;
		this.certificateNum = certificateNum;
		this.idcardFront = idcardFront;
		this.idcardBack = idcardBack;
		this.deposit = deposit;
		this.remark = remark;
	}

	// Property accessors

	@Column(name = "user_general_info_id")
	public Integer getUserGeneralInfoId() {
		return this.userGeneralInfoId;
	}

	public void setUserGeneralInfoId(Integer userGeneralInfoId) {
		this.userGeneralInfoId = userGeneralInfoId;
	}

	@Column(name = "introduction")
	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Column(name = "authentication")
	public Integer getAuthentication() {
		return this.authentication;
	}

	public void setAuthentication(Integer authentication) {
		this.authentication = authentication;
	}

	@Column(name = "certificate_type")
	public Integer getCertificateType() {
		return this.certificateType;
	}

	public void setCertificateType(Integer certificateType) {
		this.certificateType = certificateType;
	}

	@Column(name = "certificate_num")
	public String getCertificateNum() {
		return this.certificateNum;
	}

	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}

	@Column(name = "idcard_front")
	public String getIdcardFront() {
		return this.idcardFront;
	}

	public void setIdcardFront(String idcardFront) {
		this.idcardFront = idcardFront;
	}

	@Column(name = "idcard_back")
	public String getIdcardBack() {
		return this.idcardBack;
	}

	public void setIdcardBack(String idcardBack) {
		this.idcardBack = idcardBack;
	}

	@Column(name = "deposit")
	public Double getDeposit() {
		return this.deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


}