package com.deloitte.NBA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.deloitte.NBA.dao.NBARepository;
import com.deloitte.NBA.entity.NBA;

@Service
public class NBAServiceImpl implements INBAService {

	@Autowired
	private NBARepository nbaRepository;

	@Override
	public NBA getTeamById(Integer team_id) {
		return nbaRepository.findById(team_id).get();
	}

	@Override
	public List<NBA> getTeams() {
		return nbaRepository.findAll();
	}

//	@Override
//	public NBA getTeamByCity(String team_city) {
//		return nbaRepository.findByTeam_city(team_city);
//	}

}
