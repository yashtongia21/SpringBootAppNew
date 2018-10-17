package com.verizon.bsa.model;

public class Emp {
	private int empid;
	private String name;
	private double basic;
	private double hra;
	private String dept;

	public Emp() {
		
	}
	public Emp(int empid, String name, double basic, double hra, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
