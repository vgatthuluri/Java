package org.avg.ds.common;

public class POJO {

	private String name;
	private String value;
	
	public POJO(String name, String value){
		this.name = name;
		this.value = value;
	}
	
	public POJO deepCopy(){
		POJO retObj = new POJO(this.name, this.value);
		return retObj;
	}
	
	public String toString(){
		return "[" + name  + ":" + value + "]";
	}
	
}
