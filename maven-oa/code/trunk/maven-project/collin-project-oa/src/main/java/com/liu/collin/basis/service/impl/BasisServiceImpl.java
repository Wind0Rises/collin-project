package com.liu.collin.basis.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.liu.collin.basis.dao.BasisDao;
import com.liu.collin.basis.exception.DataAccessException;
import com.liu.collin.basis.service.BasisService;


public abstract class BasisServiceImpl<Entity extends Serializable,D extends BasisDao<Entity, ID>, ID extends Serializable> 
				implements BasisService<Entity, ID> {

	protected abstract D getDao();
	
	@Override
	public int insert(Entity en) throws DataAccessException {
		return this.getDao().insert(en);
	}

	@Override
	public int insertList(List<? extends Entity> list) throws DataAccessException {
		return this.getDao().insertList(list);
	}

	@Override
	public int delete(ID id) throws DataAccessException {
		return this.getDao().delete(id);
	}

	@Override
	public int deleteList(List<? extends ID> list) throws DataAccessException {
		return this.getDao().deleteList(list);
	}

	@Override
	public int deleteAll() throws DataAccessException {
		return this.getDao().deleteAll();
	}

	@Override
	public int deleteByParam(Map<String, Object> map) throws DataAccessException {
		return this.getDao().deleteByParam(map);
	}

	@Override
	public int update(Entity en) throws DataAccessException {
		return this.getDao().update(en);
	}

	@Override
	public int updateList(List<? extends Entity> list) throws DataAccessException {
		return this.getDao().updateList(list);
	}

	@Override
	public Entity getById(ID id) throws DataAccessException {
		return this.getDao().getById(id);
	}

	@Override
	public List<Entity> getListByParam(Map<String, Object> map) throws DataAccessException {
		return this.getDao().getListByParam(map);
	}

	@Override
	public List<Entity> getListPage() throws DataAccessException {
		System.out.println("分页操作");
		return null;
	}
}
