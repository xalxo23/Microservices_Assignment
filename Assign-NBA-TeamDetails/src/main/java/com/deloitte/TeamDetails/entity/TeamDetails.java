package com.deloitte.TeamDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TeamDetails {

	@Id
	private Integer team_id;
	private String player1;
	private String player2;
	private String player3;
	private String player4;
	private String player5;

	public TeamDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeamDetails(Integer team_id, String player1, String player2, String player3, String player4,
			String player5) {
		super();
		this.team_id = team_id;
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.player4 = player4;
		this.player5 = player5;
	}

	public Integer getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}

	public String getPlayer3() {
		return player3;
	}

	public void setPlayer3(String player3) {
		this.player3 = player3;
	}

	public String getPlayer4() {
		return player4;
	}

	public void setPlayer4(String player4) {
		this.player4 = player4;
	}

	public String getPlayer5() {
		return player5;
	}

	public void setPlayer5(String player5) {
		this.player5 = player5;
	}

}
