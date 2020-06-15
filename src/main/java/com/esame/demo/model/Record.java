package com.esame.demo.model;

public class Record {
	private String mdType;
	private String caption;
	private String iD;
	public Record(String mdType, String caption, String iD) {
		super();
		this.mdType = mdType;
		this.caption = caption;
		this.iD=iD;
	}
	public String getMdType() {
		return mdType;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public void setMdType(String mdType) {
		this.mdType = mdType;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
}
	
 