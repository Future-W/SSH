package com.woniu.pojo;
// Generated 2019-11-23 15:57:19 by Hibernate Tools 5.4.2.Final

/**
 * Dept generated by hbm2java
 */
public class Dept implements java.io.Serializable {

	private Integer did;
	private String dname;
	private String info;

	public Dept() {
	}

	public Dept(String dname, String info) {
		this.dname = dname;
		this.info = info;
	}

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", info=" + info + "]";
	}

}
