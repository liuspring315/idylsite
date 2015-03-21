package com.idyl.site.data;

import javax.validation.constraints.Pattern;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by spring on 15-3-17.
 */
public class UserGeneralInfo {
	private int id;
	private Integer userType;
	@Pattern(regexp="w{4,30}",
			message="请输入正确的电子邮箱")
	private String userName;
	@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
			+"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
			+"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
			message="请输入正确的电子邮箱")
	private String email;
	@Pattern(regexp="S{6,30}")
	private String password;
	private String familyName;
	private String lastName;
	private String mobile;
	private String telephone;
	private Integer location;
	private Date birthday;
	private String headThumb;
	private Timestamp addTime;
	private Timestamp beginTime;

	public UserGeneralInfo() {
	}

	public UserGeneralInfo(int id, Integer userType, String userName, String email, String password, String familyName, String lastName, String mobile, String telephone, Integer location, Date birthday, String headThumb, Timestamp addTime, Timestamp beginTime) {
		this.id = id;
		this.userType = userType;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.familyName = familyName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.telephone = telephone;
		this.location = location;
		this.birthday = birthday;
		this.headThumb = headThumb;
		this.addTime = addTime;
		this.beginTime = beginTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getHeadThumb() {
		return headThumb;
	}

	public void setHeadThumb(String headThumb) {
		this.headThumb = headThumb;
	}

	public Timestamp getAddTime() {
		return addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UserGeneralInfo that = (UserGeneralInfo) o;

		if (id != that.id) return false;
		if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
		if (beginTime != null ? !beginTime.equals(that.beginTime) : that.beginTime != null) return false;
		if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
		if (email != null ? !email.equals(that.email) : that.email != null) return false;
		if (familyName != null ? !familyName.equals(that.familyName) : that.familyName != null) return false;
		if (headThumb != null ? !headThumb.equals(that.headThumb) : that.headThumb != null) return false;
		if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
		if (location != null ? !location.equals(that.location) : that.location != null) return false;
		if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
		if (password != null ? !password.equals(that.password) : that.password != null) return false;
		if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
		if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
		if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (userType != null ? userType.hashCode() : 0);
		result = 31 * result + (userName != null ? userName.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
		result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
		result = 31 * result + (location != null ? location.hashCode() : 0);
		result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
		result = 31 * result + (headThumb != null ? headThumb.hashCode() : 0);
		result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
		result = 31 * result + (beginTime != null ? beginTime.hashCode() : 0);
		return result;
	}
}
