package com.markany.mysite.vo;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class UserVo {
	private Long id;
	
	@NotEmpty
	@Length(min=2, max=8)
	private String idString;
	private String gender;
	private String firstName;
	private String lastName;
	private String team;
	private String rank;
	private String role;
	private String password;
	private String ptzLevel;
	private String autoChangeTime;
	private String autoHandlingTime;
	private String blockUntil;
	private String joinDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPtzLevel() {
		return ptzLevel;
	}
	public void setPtzLevel(String ptzLevel) {
		this.ptzLevel = ptzLevel;
	}
	public String getAutoChangeTime() {
		return autoChangeTime;
	}
	public void setAutoChangeTime(String autoChangeTime) {
		this.autoChangeTime = autoChangeTime;
	}
	public String getAutoHandlingTime() {
		return autoHandlingTime;
	}
	public void setAutoHandlingTime(String autoHandlingTime) {
		this.autoHandlingTime = autoHandlingTime;
	}
	public String getBlockUntil() {
		return blockUntil;
	}
	public void setBlockUntil(String blockUntil) {
		this.blockUntil = blockUntil;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", idString=" + idString + ", gender=" + gender + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", team=" + team + ", rank=" + rank + ", role=" + role + ", password="
				+ password + ", ptzLevel=" + ptzLevel + ", autoChangeTime=" + autoChangeTime + ", autoHandlingTime="
				+ autoHandlingTime + ", blockUntil=" + blockUntil + ", joinDate=" + joinDate + "]";
	}
}
