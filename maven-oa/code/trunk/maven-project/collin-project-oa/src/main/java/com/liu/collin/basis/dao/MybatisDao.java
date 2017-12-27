package com.liu.collin.basis.dao;

import java.io.Serializable;

import com.liu.collin.basis.exception.DataAccessException;

public interface MybatisDao<entity extends Serializable, id extends Serializable> 
				extends BasisDao<entity, id>{
	
	/**
	 * @desc 查询总条数
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午10:07:02
	 * @return
	 * @throws DataAccessException
	 */
	public int getCount() throws DataAccessException;
					
}
