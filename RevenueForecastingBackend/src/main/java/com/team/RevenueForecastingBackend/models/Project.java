//package com.team.RevenueForecastingBackend.models;
//
//import java.util.Date;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//
//
//
//@Entity
//public class Project {
//	
//	@Id
//	@Column(name="project_id")
//	private int id;
//	private String project_name;
//	private String project_description;
//	private String project_billability;
//	private String project_type;
//	private Date project_start_date;
//	private Date project_end_date;
//	private String project_manager_id;
//	private String project_manager_name;
//	
//	@ManyToOne
//	@JoinColumn(name="account_id")
//	private Account account;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getProject_name() {
//		return project_name;
//	}
//
//	public void setProject_name(String project_name) {
//		this.project_name = project_name;
//	}
//
//	public String getProject_description() {
//		return project_description;
//	}
//
//	public void setProject_description(String project_description) {
//		this.project_description = project_description;
//	}
//
//	public String getProject_billability() {
//		return project_billability;
//	}
//
//	public void setProject_billability(String project_billability) {
//		this.project_billability = project_billability;
//	}
//
//	public String getProject_type() {
//		return project_type;
//	}
//
//	public void setProject_type(String project_type) {
//		this.project_type = project_type;
//	}
//
//	public Date getProject_start_date() {
//		return project_start_date;
//	}
//
//	public void setProject_start_date(Date project_start_date) {
//		this.project_start_date = project_start_date;
//	}
//
//	public Date getProject_end_date() {
//		return project_end_date;
//	}
//
//	public void setProject_end_date(Date project_end_date) {
//		this.project_end_date = project_end_date;
//	}
//
//	public String getProject_manager_id() {
//		return project_manager_id;
//	}
//
//	public void setProject_manager_id(String project_manager_id) {
//		this.project_manager_id = project_manager_id;
//	}
//
//	public String getProject_manager_name() {
//		return project_manager_name;
//	}
//
//	public void setProject_manager_name(String project_manager_name) {
//		this.project_manager_name = project_manager_name;
//	}
//
//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}
//	
//	
//	
//	
//
//}
