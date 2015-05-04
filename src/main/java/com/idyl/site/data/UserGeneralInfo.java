package com.idyl.site.data;


import com.idyl.site.dao.Column;
import com.idyl.site.dao.Table;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Timestamp;
import java.util.Date;

/**
 * UserGeneralInfo entity. @author MyEclipse Persistence Tools
 */
@Table(name = "user_general_info")
public class UserGeneralInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userType;
	private String userTypeName;
	@NotNull(message = "用户名不能为空")
	@Length(min=5, max=20, message="用户名长度必须在5-20之间")
	@Pattern(regexp = "^[a-zA-Z_]\\w{4,19}$", message = "用户名必须以字母下划线开头，可由字母数字下划线组成")
	private String userName;
	@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
			+"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
			+"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
			message="请输入正确的电子邮箱")
	@NotNull(message="电子邮箱不能为空")
	private String email;
	@NotNull(message="密码不能为空")
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
	private Integer gender;
	private String genderName;
	private Integer registerCheckState;
	// Constructors

	/** default constructor */
	public UserGeneralInfo() {
	}

	/** minimal constructor */
	public UserGeneralInfo(String userName, String email, String password) {
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	/** full constructor */
	public UserGeneralInfo(Integer userType, String userName, String email,
						   String password, String familyName, String lastName, String mobile,
						   String telephone, Integer location, Date birthday,
						   String headThumb, Timestamp addTime, Timestamp beginTime) {
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

	// Property accessors
	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "user_type")
	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	@Column(name = "user_name")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "family_name")
	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	@Column(name = "last_name")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "mobile")
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "telephone")
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "location")
	public Integer getLocation() {
		return this.location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	@Column(name = "birthday")
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "head_thumb")
	public String getHeadThumb() {
		return this.headThumb;
	}

	public void setHeadThumb(String headThumb) {
		this.headThumb = headThumb;
	}

	@Column(name = "add_time")
	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	@Column(name = "begin_time")
	public Timestamp getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}

	@Column(name = "userTypeName")
	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	@Column(name = "gender")
	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "genderName")
	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	@Column(name = "register_check_state")
	public Integer getRegisterCheckState() {
		return registerCheckState;
	}

	public void setRegisterCheckState(Integer registerCheckState) {
		this.registerCheckState = registerCheckState;
	}
}