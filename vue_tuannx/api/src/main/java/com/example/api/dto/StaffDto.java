package com.example.api.dto;

import com.example.api.domain.Staff;

public class StaffDto {
	private Long id;
	private String name;
	private int age;
	private String experience;
	private String role;
	public StaffDto() {
		super();
	}
	public StaffDto(Staff staff) {
		this.setId(staff.getId());
		this.name = staff.getName();
		this.age=staff.getAge();
		this.experience=staff.getExperience();
		this.role=staff.getRole();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
