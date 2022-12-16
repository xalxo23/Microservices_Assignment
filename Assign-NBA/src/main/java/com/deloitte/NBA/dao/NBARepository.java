package com.deloitte.NBA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.NBA.entity.NBA;

//import feign.Param;

@Repository
public interface NBARepository extends JpaRepository<NBA, Integer> {
	
//  NBA findByTeam_city(String team_city);

}
