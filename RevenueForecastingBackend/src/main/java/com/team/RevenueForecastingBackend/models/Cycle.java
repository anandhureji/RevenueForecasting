//package com.team.RevenueForecastingBackend.models;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Cycle {
//	
//	@Id 
//	private String c_id;
//	
//	@OneToOne
//	@JoinColumn(name="project_id")
//	private Project project;
//	
//	@OneToOne
//	@JoinColumn(name="a_id")
//	private Associate associate;
//	
//
//	@OneToOne
//	@JoinColumn(name="account_id")
//	private Account account;
//	
//	private Date m1;
//	private Date m2;
//	private Date m3;
//	private Date m4;
//	private Date m5;
//	private Date m6;
//	private Date m7;
//	private Date m8;
//	private Date m9;
//	private Date m10;
//	private Date m11;
//	private Date m12;
//	public String getC_id() {
//		return c_id;
//	}
//	public void setC_id(String c_id) {
//		this.c_id = c_id;
//	}
//	public Project getProject() {
//		return project;
//	}
//	public void setProject(Project project) {
//		this.project = project;
//	}
//	public Associate getAssociate() {
//		return associate;
//	}
//	public void setAssociate(Associate associate) {
//		this.associate = associate;
//	}
//	public Account getAccount() {
//		return account;
//	}
//	public void setAccount(Account account) {
//		this.account = account;
//	}
//	public Date getM1() {
//		return m1;
//	}
//	public void setM1(Date m1) {
//		this.m1 = m1;
//	}
//	public Date getM2() {
//		return m2;
//	}
//	public void setM2(Date m2) {
//		this.m2 = m2;
//	}
//	public Date getM3() {
//		return m3;
//	}
//	public void setM3(Date m3) {
//		this.m3 = m3;
//	}
//	public Date getM4() {
//		return m4;
//	}
//	public void setM4(Date m4) {
//		this.m4 = m4;
//	}
//	public Date getM5() {
//		return m5;
//	}
//	public void setM5(Date m5) {
//		this.m5 = m5;
//	}
//	public Date getM6() {
//		return m6;
//	}
//	public void setM6(Date m6) {
//		this.m6 = m6;
//	}
//	public Date getM7() {
//		return m7;
//	}
//	public void setM7(Date m7) {
//		this.m7 = m7;
//	}
//	public Date getM8() {
//		return m8;
//	}
//	public void setM8(Date m8) {
//		this.m8 = m8;
//	}
//	public Date getM9() {
//		return m9;
//	}
//	public void setM9(Date m9) {
//		this.m9 = m9;
//	}
//	public Date getM10() {
//		return m10;
//	}
//	public void setM10(Date m10) {
//		this.m10 = m10;
//	}
//	public Date getM11() {
//		return m11;
//	}
//	public void setM11(Date m11) {
//		this.m11 = m11;
//	}
//	public Date getM12() {
//		return m12;
//	}
//	public void setM12(Date m12) {
//		this.m12 = m12;
//	}
//	
//	
//	
//	
//
//}
