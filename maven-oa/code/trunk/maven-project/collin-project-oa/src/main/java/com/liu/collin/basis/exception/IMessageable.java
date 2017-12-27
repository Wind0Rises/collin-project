package com.liu.collin.basis.exception;

/**
 * @desc 异常信息操作接口
 * @author Liuweian
 * @createTime 2017年12月27日 下午4:19:52
 * @version 1.0
 */
public interface IMessageable {
	/**
	 * @desc 获取信息值
	 * @author Liuweian
	 * @createTime 2017年12月27日 下午4:20:19
	 * @return
	 */
	public abstract String getMessageKey();
	
	/**
	 * @desc 
	 * @author Liuweian
	 * @createTime 2017年12月27日 下午4:20:41
	 * @return
	 */
	public abstract String getDetailMessageKey();
	
	public abstract String getSubCode();
	
	public abstract Object[] getArgs();
	
	public abstract String getDefaultMessage();
}
