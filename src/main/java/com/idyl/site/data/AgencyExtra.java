package com.idyl.site.data;

import java.math.BigDecimal;

/**
 * Created by spring on 15-3-17.
 */
public class AgencyExtra {
	private int userGeneralInfoId;
	private Integer authentication;
	private Integer certificateType;
	private String certificateNum;
	private String idcardFront;
	private String idcardBack;
	private String remark;
	private BigDecimal deposit;
	private String introduction;
	private String photographerDesc;
	private String stylistDesc;
	private String dressDesc;
	private String address;
	private Integer registerCheckState;

	public int getUserGeneralInfoId() {
		return userGeneralInfoId;
	}

	public void setUserGeneralInfoId(int userGeneralInfoId) {
		this.userGeneralInfoId = userGeneralInfoId;
	}

	public Integer getAuthentication() {
		return authentication;
	}

	public void setAuthentication(Integer authentication) {
		this.authentication = authentication;
	}

	public Integer getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(Integer certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateNum() {
		return certificateNum;
	}

	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}

	public String getIdcardFront() {
		return idcardFront;
	}

	public void setIdcardFront(String idcardFront) {
		this.idcardFront = idcardFront;
	}

	public String getIdcardBack() {
		return idcardBack;
	}

	public void setIdcardBack(String idcardBack) {
		this.idcardBack = idcardBack;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getDeposit() {
		return deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getPhotographerDesc() {
		return photographerDesc;
	}

	public void setPhotographerDesc(String photographerDesc) {
		this.photographerDesc = photographerDesc;
	}

	public String getStylistDesc() {
		return stylistDesc;
	}

	public void setStylistDesc(String stylistDesc) {
		this.stylistDesc = stylistDesc;
	}

	public String getDressDesc() {
		return dressDesc;
	}

	public void setDressDesc(String dressDesc) {
		this.dressDesc = dressDesc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getRegisterCheckState() {
		return registerCheckState;
	}

	public void setRegisterCheckState(Integer registerCheckState) {
		this.registerCheckState = registerCheckState;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AgencyExtra that = (AgencyExtra) o;

		if (userGeneralInfoId != that.userGeneralInfoId) return false;
		if (address != null ? !address.equals(that.address) : that.address != null) return false;
		if (authentication != null ? !authentication.equals(that.authentication) : that.authentication != null)
			return false;
		if (certificateNum != null ? !certificateNum.equals(that.certificateNum) : that.certificateNum != null)
			return false;
		if (certificateType != null ? !certificateType.equals(that.certificateType) : that.certificateType != null)
			return false;
		if (deposit != null ? !deposit.equals(that.deposit) : that.deposit != null) return false;
		if (dressDesc != null ? !dressDesc.equals(that.dressDesc) : that.dressDesc != null) return false;
		if (idcardBack != null ? !idcardBack.equals(that.idcardBack) : that.idcardBack != null) return false;
		if (idcardFront != null ? !idcardFront.equals(that.idcardFront) : that.idcardFront != null) return false;
		if (introduction != null ? !introduction.equals(that.introduction) : that.introduction != null) return false;
		if (photographerDesc != null ? !photographerDesc.equals(that.photographerDesc) : that.photographerDesc != null)
			return false;
		if (registerCheckState != null ? !registerCheckState.equals(that.registerCheckState) : that.registerCheckState != null)
			return false;
		if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
		if (stylistDesc != null ? !stylistDesc.equals(that.stylistDesc) : that.stylistDesc != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = userGeneralInfoId;
		result = 31 * result + (authentication != null ? authentication.hashCode() : 0);
		result = 31 * result + (certificateType != null ? certificateType.hashCode() : 0);
		result = 31 * result + (certificateNum != null ? certificateNum.hashCode() : 0);
		result = 31 * result + (idcardFront != null ? idcardFront.hashCode() : 0);
		result = 31 * result + (idcardBack != null ? idcardBack.hashCode() : 0);
		result = 31 * result + (remark != null ? remark.hashCode() : 0);
		result = 31 * result + (deposit != null ? deposit.hashCode() : 0);
		result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
		result = 31 * result + (photographerDesc != null ? photographerDesc.hashCode() : 0);
		result = 31 * result + (stylistDesc != null ? stylistDesc.hashCode() : 0);
		result = 31 * result + (dressDesc != null ? dressDesc.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (registerCheckState != null ? registerCheckState.hashCode() : 0);
		return result;
	}
}
