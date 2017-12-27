package com.liu.collin.project.ucif.model;

import java.util.Date;

import com.liu.collin.basis.model.BasisModel;

/**
 * @desc 公司实体
 * @author Liuweian
 * @createTime 2017年12月27日 下午1:29:07
 * @version 1.0
 */
public class Company extends BasisModel<Long>{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 公司名称
	 */
	private String companyName;
	
	/**
	 * 公司地址
	 */
	private String companyAddress;
	
	/**
	 * 公司图片
	 */
	private String publicityImage;
	
	/**
	 * 人员数目
	 */
	private int peopleNumber;
	
	/**
	 * 创立时间
	 */
	private Date establishDate;
	
	/**
	 * 公司电话
	 */
	private String companyPhone;
	
	/**
	 * 状态：0：停止使用，1：使用中
	 */
	private int status;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPublicityImage() {
		return publicityImage;
	}

	public void setPublicityImage(String publicityImage) {
		this.publicityImage = publicityImage;
	}

	public int getPeopleNumber() {
		return peopleNumber;
	}

	public void setPeopleNumber(int peopleNumber) {
		this.peopleNumber = peopleNumber;
	}

	public Date getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
