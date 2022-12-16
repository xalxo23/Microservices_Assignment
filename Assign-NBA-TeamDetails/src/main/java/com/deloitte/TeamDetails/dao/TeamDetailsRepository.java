package com.deloitte.TeamDetails.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.TeamDetails.entity.TeamDetails;

@Repository
public interface TeamDetailsRepository extends JpaRepository<TeamDetails, Integer> {

//	List<TeamDetails> findByTeamId(Integer team_id);
}
