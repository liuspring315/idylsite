package com.idyl.site.data;

/**
 * Created by spring on 15-3-19.
 */
public enum UserTypeEnum {

	//		1会员
//		2摄影师
//		3造型师
//		4摄影机构管理员
	CUSTOMER("会员",1,"customerAccountService"),
	PHOTOGRAPHER("摄影师",2,"photographerAccountService"),
	STYLIST("造型师",3,"stylistAccountService"),
	AGENCY("摄影机构管理员",4,"agencyAccountService")
			;
	//资源编码
	private Integer code;
	//资源名称
	private String name;

	private String daoClassName;

	private UserTypeEnum(String name, Integer code,String daoClassName) {
		this.code = code;
		this.name = name;
		this.daoClassName = daoClassName;
	}
	public static UserTypeEnum getUserTypeEnum(Integer code) {
		for (UserTypeEnum c : UserTypeEnum.values()) {
			if (c.getCode() == code) {
				return c;
			}
		}
		return CUSTOMER;
	}


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDaoClassName() {
		return daoClassName;
	}

	public void setDaoClassName(String daoClassName) {
		this.daoClassName = daoClassName;
	}
}
