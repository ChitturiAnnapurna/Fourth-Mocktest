package com.training.spring.boot.mongodb.domain;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

import org.springframework.data.annotation.*;

import lombok.Data;

@Data
@Document(collection="users")
public class Users implements Serializable{
	
	@Id
	private String id;
	private Integer num;
	private String first_name;
	private String last_name;
	
	@Indexed(unique=true)
	private String email;
	
	private String gender;
	private String ip_address;
	
	
	public Users(Integer num, String first_name, String last_name, String email, String gender, String ip_address) {
		super();
		this.num = num;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.gender = gender;
		this.ip_address = ip_address;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Integer getnum() {
		return num;
	}


	public void setnum(Integer num) {
		this.num = num;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getIp_address() {
		return ip_address;
	}


	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	
	

}
