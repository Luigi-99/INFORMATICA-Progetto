package com.esame.demo.model;

public class Metadata {
	 private String alias;
	 private String tipo;
	 private String sourcefield;
	public Metadata(String alias, String tipo, String sourcefield) {
		super();
		this.alias = alias;
		this.tipo = tipo;
		this.sourcefield = sourcefield;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSourcefield() {
		return sourcefield;
	}
	public void setSourcefield(String sourcefield) {
		this.sourcefield = sourcefield;
	}
	 


}
