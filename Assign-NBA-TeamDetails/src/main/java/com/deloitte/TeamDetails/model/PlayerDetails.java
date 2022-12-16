package com.deloitte.TeamDetails.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PlayerDetails {

	@Id
	private Integer player_id;
	private Integer jersey_no;
	private Integer player_score;
	private Integer team_id;

	public PlayerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerDetails(Integer player_id, Integer jersey_no, String player_name, Integer player_score,
			Integer team_id) {
		super();
		this.player_id = player_id;
		this.jersey_no = jersey_no;
		this.player_score = player_score;
		this.team_id = team_id;
	}

	public Integer getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(Integer player_id) {
		this.player_id = player_id;
	}

	public Integer getJersey_no() {
		return jersey_no;
	}

	public void setJersey_no(Integer jersey_no) {
		this.jersey_no = jersey_no;
	}

	public Integer getPlayer_score() {
		return player_score;
	}

	public void setPlayer_score(Integer player_score) {
		this.player_score = player_score;
	}

	public Integer getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}

}
