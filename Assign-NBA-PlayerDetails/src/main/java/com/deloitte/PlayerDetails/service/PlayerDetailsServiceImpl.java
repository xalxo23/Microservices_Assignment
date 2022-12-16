package com.deloitte.PlayerDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.PlayerDetails.dao.PlayerDetailsRepository;
import com.deloitte.PlayerDetails.entity.PlayerDetails;

@Service
public class PlayerDetailsServiceImpl implements IPlayerDetailsService{
	
	@Autowired
	private PlayerDetailsRepository playerDetailsRepository;

	@Override
	public PlayerDetails getPlayerById(Integer player_id) {
		return playerDetailsRepository.findById(player_id).get();
	}

	@Override
	public List<PlayerDetails> getAllPlayerDetails() {
		return playerDetailsRepository.findAll();
	}

}
