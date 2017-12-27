package com.liu.collin.basis.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.liu.collin.basis.exception.DataAccessException;

/**
 * @desc 数据库基类
 * @author Liuweian
 * @createTime 2017年12月18日 上午9:41:29
 * @version 1.0
 */
public interface BasisService<Entity extends Serializable, PK extends Serializable>{
	
	/**
	 * @desc 添加数据
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午9:47:42
	 * @param en
	 * @return
	 * @throws DataAccessException
	 */
	public int insert(Entity en) throws DataAccessException;
	
	/**
	 * @desc 批量添加
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午9:53:24
	 * @param list
	 * @return
	 * @throws DataAccessException
	 */
	public int insertList(List<? extends Entity> list) throws DataAccessException;
	
	/**
	 * @desc 根据主键删除数据
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午9:48:39
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public int delete(PK id) throws DataAccessException;
	
	/**
	 * @desc 批量删除
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午9:54:35
	 * @param list
	 * @return
	 * @throws DataAccessException
	 */
	public int deleteList(List<? extends PK> list) throws DataAccessException;
	
	/**
	 * @desc 删除全部实体
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午9:58:17
	 * @return
	 * @throws DataAccessException
	 */
	public int deleteAll() throws DataAccessException;
	
	/**
	 * @desc 根据条件查询
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午10:00:23
	 * @param map
	 * @return
	 * @throws DataAccessException
	 */
	public int deleteByParam(Map<String, Object> map) throws DataAccessException;
	
	/**
	 * @desc 修改数据
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午9:49:39
	 * @param en
	 * @return
	 * @throws DataAccessException
	 */
	public int update(Entity en) throws DataAccessException;
	
	/**
	 * @desc 批量更新
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午9:55:42
	 * @param list
	 * @return
	 * @throws DataAccessException
	 */
	public int updateList(List<? extends Entity> list) throws DataAccessException;
	
	/**
	 * @desc 根据主键查询一条数据
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午9:50:30
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public Entity getById(PK id) throws DataAccessException;
	
	/**
	 * @desc 根据条件查询数据
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午10:03:34
	 * @param map
	 * @return
	 * @throws DataAccessException
	 */
	public List<Entity> getListByParam(Map<String, Object> map) throws DataAccessException;
	
	/**
	 * @desc 分页查询
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午10:22:10
	 * @return
	 * @throws DataAccessException
	 */
	public List<Entity> getListPage() throws DataAccessException;
}
