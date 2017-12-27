package com.liu.collin.basis.model;

import java.io.Serializable;

public interface BasisPrimary<PK extends Serializable> extends Serializable{

	public void setId(PK id);
	
	public PK getId();
	
}
