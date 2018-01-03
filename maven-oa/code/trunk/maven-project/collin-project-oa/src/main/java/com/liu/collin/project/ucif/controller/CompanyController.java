package com.liu.collin.project.ucif.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.collin.basis.exception.DataAccessException;
import com.liu.collin.basis.util.UniqueUtil;
import com.liu.collin.project.ucif.model.Company;
import com.liu.collin.project.ucif.service.CompanyService;

/**
 * @desc 公司controller
 * @author Liuweian
 * @createTime 2018年1月3日 下午2:47:30
 * @version 1.0
 */
@Controller
@RequestMapping("/ucif/company/")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("list")
	public String list() throws DataAccessException {
		
		Company company = companyService.getById(1514371369237L);
		company.setPeopleNumber(100);
		companyService.update(company);
		
		System.out.println("this is cli");
		return "/ucif/company/list";
	}
	
	@RequestMapping("add")
	public String add() {
		Company company = new Company(); 
		company.setId(UniqueUtil.getLongPrimaryKey());
		company.setCompanyName("中科智翔");
		company.setCompanyAddress("安徽、合肥");
		company.setCompanyPhone("0564-6481642");
		company.setEstablishDate(new Date());
		company.setPeopleNumber(20);
		company.setStatus(1);
		
		try {
			companyService.insert(company);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("新增成功");
		
		return "/ucif/company/add";
	}
	
}
