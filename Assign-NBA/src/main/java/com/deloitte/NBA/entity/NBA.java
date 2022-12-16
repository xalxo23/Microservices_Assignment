package com.deloitte.NBA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class NBA {

	@Id
	@GeneratedValue
	private Integer team_id;
	private String team_name;
	private String team_city;

	public NBA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NBA(Integer team_id, String team_name, String team_city) {
		super();
		this.team_id = team_id;
		this.team_name = team_name;
		this.team_city = team_city;
	}

	public Integer getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getTeam_city() {
		return team_city;
	}

	public void setTeam_city(String team_city) {
		this.team_city = team_city;
	}

}
