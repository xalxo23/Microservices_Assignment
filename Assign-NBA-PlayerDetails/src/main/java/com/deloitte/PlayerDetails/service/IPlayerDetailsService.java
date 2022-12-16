package com.deloitte.PlayerDetails.service;

import java.util.List;

import com.deloitte.PlayerDetails.entity.PlayerDetails;

public interface IPlayerDetailsService {
	
	public PlayerDetails getPlayerById(Integer player_id);
	
	public List<PlayerDetails> getAllPlayerDetails();

}
