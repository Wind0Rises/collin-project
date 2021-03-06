package com.liu.collin.basis.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class CoreException extends Exception implements IMessageable{
	
	 private static final long serialVersionUID = 2586257457401731483L;
	 
	  private static final String DEFAULT_MESSAGEKEY = "com.liu.core.exception";
	  
	  private static final String DEFAULT_SUBCODE = "";
	  
	  private String messageKey;
	  
	  private String subCode = "";
	  
	  private Object[] args;
	  
	  private Throwable cause;

	  public CoreException()
	  {
	    super("esbuilder.core.excepiton");
	  }

	  public CoreException(String message)
	  {
	    super(message);
	    this.messageKey = message;
	  }

	  public CoreException(String message, String subCode)
	  {
	    super(message);
	    this.messageKey = message;
	    this.subCode = subCode;
	  }

	  public CoreException(Throwable cause)
	  {
	    super("esbuilder.core.excepiton", cause);
	    this.cause = cause;
	  }

	  public CoreException(String message, Throwable cause)
	  {
	    super(message, cause);
	    this.cause = cause;
	    this.messageKey = message;
	  }

	  public CoreException(String message, String subCode, Throwable cause)
	  {
	    super(message, cause);
	    this.cause = cause;
	    this.messageKey = message;
	    this.subCode = subCode;
	  }

	  public CoreException(String message, Object[] args) {
	    super(message);
	    this.messageKey = message;
	    this.args = args;
	  }

	  public CoreException(String message, String subCode, Object[] args)
	  {
	    super(message);
	    this.messageKey = message;
	    this.subCode = subCode;
	    this.args = args;
	  }

	  public CoreException(String message, Throwable cause, Object[] args)
	  {
	    super(message, cause);
	    this.cause = cause;
	    this.messageKey = message;
	    this.args = args;
	  }

	  public CoreException(String message, String subCode, Throwable cause, Object[] args)
	  {
	    super(message, cause);
	    this.cause = cause;
	    this.messageKey = message;
	    this.subCode = subCode;
	    this.args = args;
	  }

	  public Throwable getCause()
	  {
	    return this.cause == this ? null : this.cause;
	  }

	  public String getMessage()
	  {
	    if ((this.cause == null) || (this.cause == this))
	    {
	      if (this.args == null) {
	        return super.getMessage();
	      }
	      StringBuffer sb = new StringBuffer(super.getMessage());
	      sb.append(" Args: ");
	      for (int i = 0; i < this.args.length; i++) {
	        sb.append(this.args[i]).append(" ");
	      }
	      sb.append(" SubCode: ");
	      sb.append(this.subCode);

	      return sb.toString();
	    }

	    if (this.args == null) {
	      return super.getMessage() + "; nested exception is " + this.cause.getClass().getName() + ": " + this.cause.getMessage();
	    }

	    StringBuffer sb = new StringBuffer(super.getMessage());
	    sb.append(" Args: ");
	    for (int i = 0; i < this.args.length; i++) {
	      sb.append(this.args[i]).append(" ");
	    }

	    sb.append(" SubCode: ");
	    sb.append(this.subCode);

	    sb.append("; nested exception is ").append(this.cause.getClass().getName()).append(": ").append(this.cause.getMessage());

	    return sb.toString();
	  }

	  public void printStackTrace(PrintStream ps)
	  {
	    if ((this.cause == null) || (this.cause == this)) {
	      super.printStackTrace(ps);
	    } else {
	      ps.println(this);
	      this.cause.printStackTrace(ps);
	    }
	  }

	  public void printStackTrace(PrintWriter pw)
	  {
	    if ((this.cause == null) || (this.cause == this)) {
	      super.printStackTrace(pw);
	    } else {
	      pw.println(this);
	      this.cause.printStackTrace(pw);
	    }
	  }

	  public String toString() {
	    StringBuffer sb = new StringBuffer(super.toString());
	    if (this.args != null) {
	      sb.append(" Args:");

	      for (int i = 0; i < this.args.length; i++) {
	        sb.append(this.args[i]).append(" ");
	      }
	    }
	    return sb.toString();
	  }

	  public String getMessageKey()
	  {
	    return this.messageKey;
	  }

	  public String getSubCode() {
	    return this.subCode;
	  }

	  public String getDetailMessageKey()
	  {
	    if ((this.subCode == null) || (this.subCode.trim().length() == 0)) {
	      return getMessageKey();
	    }

	    return getMessageKey() + "_" + getSubCode();
	  }

	  public Object[] getArgs()
	  {
	    return this.args;
	  }

	  public boolean contains(Class<?> exClass)
	  {
	    if (exClass == null) {
	      return false;
	    }
	    Throwable ex = this;
	    while (ex != null) {
	      if (exClass.isInstance(ex)) {
	        return true;
	      }
	      if ((ex instanceof CoreException))
	      {
	        ex = ((CoreException)ex).getCause(); continue;
	      }
	      ex = null;
	    }

	    return false;
	  }

	  public String getDefaultMessage() {
	    return getMessage();
	  }
}
