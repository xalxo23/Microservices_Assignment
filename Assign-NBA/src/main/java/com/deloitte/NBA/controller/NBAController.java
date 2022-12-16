package com.deloitte.NBA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.NBA.entity.NBA;
//import com.deloitte.NBA.model.Response;
import com.deloitte.NBA.service.INBAService;

@RestController
@RequestMapping("/NBA")
public class NBAController {

	@Autowired
	private INBAService nbaService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getTeams")
	public ResponseEntity<List<NBA>> getTeams() {
		List<NBA> teamList = nbaService.getTeams();
		return new ResponseEntity<List<NBA>>(teamList, HttpStatus.OK);
	}

	@GetMapping("/getTeams/{tid}")
	public ResponseEntity<NBA> getTeamById(@PathVariable("tid") Integer tid) {
		NBA nba = nbaService.getTeamById(tid);
		return new ResponseEntity<NBA>(nba, HttpStatus.OK);
	}
	
//	@GetMapping("/getTeams/{cid}")
//	public ResponseEntity<NBA> getTeamByCity(@PathVariable("cid") String cid) {
//		NBA cnba = nbaService.getTeamByCity(cid);
//		return new ResponseEntity<NBA>(cnba, HttpStatus.OK);
//	}

}
