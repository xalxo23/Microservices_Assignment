package com.deloitte.PlayerDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.PlayerDetails.dao.PlayerDetailsRepository;
import com.deloitte.PlayerDetails.entity.PlayerDetails;
import com.deloitte.PlayerDetails.service.IPlayerDetailsService;

@RestController
@RequestMapping("/PlayerDetails")
public class PlayerDetailsController {

	@Autowired
	private IPlayerDetailsService playerDetailsService;

	@GetMapping("/getAll")
	public ResponseEntity<List<PlayerDetails>> getAllPlayerDetails() {
		List<PlayerDetails> playerDetails = playerDetailsService.getAllPlayerDetails();
		return new ResponseEntity<List<PlayerDetails>>(playerDetails, HttpStatus.OK);
	}

	@GetMapping("getPlayer/{pid}")
	public ResponseEntity<PlayerDetails> getPlayerById(@PathVariable("pid") Integer pid) {
		PlayerDetails pList = playerDetailsService.getPlayerById(pid);
		return new ResponseEntity<PlayerDetails>(pList, HttpStatus.OK);
	}
}
