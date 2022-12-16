package com.deloitte.PlayerDetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.PlayerDetails.entity.PlayerDetails;

@Repository
public interface PlayerDetailsRepository extends JpaRepository<PlayerDetails, Integer>{

}
