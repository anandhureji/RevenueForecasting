//package com.team.RevenueForecastingBackend.models;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Associate {
//	
//	@Id
//	@Column(name = "a_id")
//	private int associate_id;
//	private String associate_name;
//	private String sid;
//	private String grade_description;
//	private String on_off;
//	private String billability_status;
//	private String Country;
//	private String State;
//	private String city;
//	private String role;
//	private Date assignment_start_date;
//	private Date assignment_end_date;
//	@ManyToOne
//	@JoinColumn(name="project_id")
//	private Project project;
//	public int getAssociate_id() {
//		return associate_id;
//	}
//	public void setAssociate_id(int associate_id) {
//		this.associate_id = associate_id;
//	}
//	public String getAssociate_name() {
//		return associate_name;
//	}
//	public void setAssociate_name(String associate_name) {
//		this.associate_name = associate_name;
//	}
//	public String getSid() {
//		return sid;
//	}
//	public void setSid(String sid) {
//		this.sid = sid;
//	}
//	public String getGrade_description() {
//		return grade_description;
//	}
//	public void setGrade_description(String grade_description) {
//		this.grade_description = grade_description;
//	}
//	public String getOn_off() {
//		return on_off;
//	}
//	public void setOn_off(String on_off) {
//		this.on_off = on_off;
//	}
//	public String getBillability_status() {
//		return billability_status;
//	}
//	public void setBillability_status(String billability_status) {
//		this.billability_status = billability_status;
//	}
//	public String getCountry() {
//		return Country;
//	}
//	public void setCountry(String country) {
//		Country = country;
//	}
//	public String getState() {
//		return State;
//	}
//	public void setState(String state) {
//		State = state;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getRole() {
//		return role;
//	}
//	public void setRole(String role) {
//		this.role = role;
//	}
//	public Date getAssignment_start_date() {
//		return assignment_start_date;
//	}
//	public void setAssignment_start_date(Date assignment_start_date) {
//		this.assignment_start_date = assignment_start_date;
//	}
//	public Date getAssignment_end_date() {
//		return assignment_end_date;
//	}
//	public void setAssignment_end_date(Date assignment_end_date) {
//		this.assignment_end_date = assignment_end_date;
//	}
//	public Project getProject() {
//		return project;
//	}
//	public void setProject(Project project) {
//		this.project = project;
//	}
//	
//	
//	
//	
//
//}
