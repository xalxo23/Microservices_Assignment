package com.deloitte.TeamDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.TeamDetails.dao.TeamDetailsRepository;
import com.deloitte.TeamDetails.entity.TeamDetails;

@Service
public class TeamDetailsServiceImpl implements ITeamDetailsService {

	@Autowired
	private TeamDetailsRepository teamDetailsRepository;

	@Override
	public TeamDetails getTeamByTeamId(Integer team_id) {
		return teamDetailsRepository.findById(team_id).get();
	}

	@Override
	public List<TeamDetails> getTeams(){
		return teamDetailsRepository.findAll();
	}

}
