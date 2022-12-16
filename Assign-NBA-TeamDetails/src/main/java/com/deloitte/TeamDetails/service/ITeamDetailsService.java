package com.deloitte.TeamDetails.service;

import java.util.List;

import com.deloitte.TeamDetails.entity.TeamDetails;

public interface ITeamDetailsService {

	public TeamDetails getTeamByTeamId(Integer team_id);

	public List<TeamDetails> getTeams();

}
