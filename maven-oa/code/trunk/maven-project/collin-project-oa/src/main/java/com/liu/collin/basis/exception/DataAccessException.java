package com.liu.collin.basis.exception;

/**
 * @desc 数据操作异常类
 * @author Liuweian
 * @createTime 2017年12月27日 下午4:45:09
 * @version 1.0
 */
public class DataAccessException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public DataAccessException() {
		super();
	}
	
	public DataAccessException(String message) {
		super(message);
	}
	
	public DataAccessException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public DataAccessException(Throwable throwable) {
		super(throwable);
	}
	
	protected DataAccessException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
