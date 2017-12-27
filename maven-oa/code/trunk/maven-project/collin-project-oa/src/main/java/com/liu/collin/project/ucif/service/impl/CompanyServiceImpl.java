package com.liu.collin.project.ucif.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.collin.basis.exception.DataAccessException;
import com.liu.collin.basis.service.impl.BasisServiceImpl;
import com.liu.collin.basis.util.UniqueUtil;
import com.liu.collin.project.ucif.dao.CompanyDao;
import com.liu.collin.project.ucif.model.Company;
import com.liu.collin.project.ucif.service.CompanyService;

/**
 * @desc 公司业务实现
 * @author Liuweian
 * @createTime 2017年12月27日 下午1:53:18
 * @version 1.0
 */
@Service("companyService")
public class CompanyServiceImpl extends BasisServiceImpl<Company, CompanyDao, Long> implements CompanyService{
	
	@Autowired
	private CompanyDao companyDao;
	
	@Override
	protected CompanyDao getDao() {
		return this.companyDao;
	}
	
	/**
	 * 
	 */
	@Override
	public void test() {
		/*Company company = null;
		try {
			company = companyDao.getById(1514356325503L);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		if (company == null) {
			System.out.println("没有该数据");
		}
		System.out.println(company.getCompanyName());*/
		
		Company company = new Company(); 
		company.setId(UniqueUtil.getLongPrimaryKey());
		company.setCompanyName("中科智翔");
		company.setCompanyAddress("安徽、合肥");
		company.setCompanyPhone("0564-6481642");
		company.setEstablishDate(new Date());
		company.setPeopleNumber(20);
		company.setStatus(1);
		
		try {
			int result = companyDao.insert(company);
			System.out.println(result);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
