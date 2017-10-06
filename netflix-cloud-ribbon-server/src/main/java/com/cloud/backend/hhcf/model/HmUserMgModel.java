package com.cloud.backend.hhcf.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @ClassName: HmUserMgModel
 * @Description:
 * @author: zhaotf
 * @date: 2017年10月6日 下午4:07:30
 */
public class HmUserMgModel implements Serializable {

	/**
	 * @Fields serialVersionUID : 远程数据传输用
	 */
	private static final long serialVersionUID = 7051784696331724779L;

	private String id;
	private String userName;
	private String pwd;
	private Integer age;
	private Date regisTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getRegisTime() {
		return regisTime;
	}

	public void setRegisTime(Date regisTime) {
		this.regisTime = regisTime;
	}

}
