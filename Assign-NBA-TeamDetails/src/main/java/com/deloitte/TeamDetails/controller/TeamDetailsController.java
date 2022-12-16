package com.deloitte.TeamDetails.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.TeamDetails.entity.TeamDetails;
import com.deloitte.TeamDetails.model.PlayerDetails;
import com.deloitte.TeamDetails.model.TeamDetailsResponse;
import com.deloitte.TeamDetails.service.ITeamDetailsService;

@RestController
@RequestMapping("/TeamDetails")
public class TeamDetailsController {

	@Autowired
	private ITeamDetailsService iTeamDetailsService;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getTeamDetails")
	public ResponseEntity<List<TeamDetails>> getTeams() {
		List<TeamDetails> teamList = iTeamDetailsService.getTeams();
		return new ResponseEntity<List<TeamDetails>>(teamList, HttpStatus.OK);
	}

	@GetMapping("/getTeamDetails/{tid}")
	public ResponseEntity<TeamDetailsResponse> getTeamByTeamId(@PathVariable("tid") Integer tid) {
		TeamDetails teamDetails = iTeamDetailsService.getTeamByTeamId(tid);
		List<PlayerDetails> playerDetails = restTemplate.getForObject("http://localhost:8083/PlayerDetails/getPlayer/"+tid, List.class);
		TeamDetailsResponse response = new TeamDetailsResponse(teamDetails,playerDetails);
		return new ResponseEntity<TeamDetailsResponse>(response, HttpStatus.OK);
	}

}
