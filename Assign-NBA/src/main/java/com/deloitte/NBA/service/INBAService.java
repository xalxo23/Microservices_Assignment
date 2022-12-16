package com.deloitte.NBA.service;

import java.util.List;

import com.deloitte.NBA.entity.NBA;

public interface INBAService {

	public NBA getTeamById(Integer team_id);

	public List<NBA> getTeams();
	
//    public NBA getTeamByCity(String team_city);

}
