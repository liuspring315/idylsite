package com.idyl.site.data;

/**
 * Created by spring on 15-3-17.
 */
public class CustomerExtra  extends UserGeneralInfo{
	private int userGeneralInfoId;
	private String signature;
	private String destination;
	private String remark;

	public int getUserGeneralInfoId() {
		return userGeneralInfoId;
	}

	public void setUserGeneralInfoId(int userGeneralInfoId) {
		this.userGeneralInfoId = userGeneralInfoId;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CustomerExtra that = (CustomerExtra) o;

		if (userGeneralInfoId != that.userGeneralInfoId) return false;
		if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
		if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
		if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = userGeneralInfoId;
		result = 31 * result + (signature != null ? signature.hashCode() : 0);
		result = 31 * result + (destination != null ? destination.hashCode() : 0);
		result = 31 * result + (remark != null ? remark.hashCode() : 0);
		return result;
	}
}
