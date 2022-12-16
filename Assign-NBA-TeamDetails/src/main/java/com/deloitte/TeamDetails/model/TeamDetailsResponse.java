package com.deloitte.TeamDetails.model;

import java.util.List;

import com.deloitte.TeamDetails.entity.TeamDetails;

public class TeamDetailsResponse {

	private TeamDetails teamDetails;
	private List<PlayerDetails> playerDetails;

	public TeamDetails getTeamDetails() {
		return teamDetails;
	}

	public void setTeamDetails(TeamDetails teamDetails) {
		this.teamDetails = teamDetails;
	}

	public List<PlayerDetails> getPlayerDetails() {
		return playerDetails;
	}

	public void setPlayerDetails(List<PlayerDetails> playerDetails) {
		this.playerDetails = playerDetails;
	}

	public TeamDetailsResponse(TeamDetails teamDetails, List<PlayerDetails> playerDetails) {
		super();
		this.teamDetails = teamDetails;
		this.playerDetails = playerDetails;
	}

	public TeamDetailsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
