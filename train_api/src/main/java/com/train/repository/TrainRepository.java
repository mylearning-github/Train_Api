package com.train.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.train.models.TrainDetails;

import jakarta.transaction.Transactional;

@Repository
public interface TrainRepository extends JpaRepository<TrainDetails, Long> {

//	@Modifying
//	@Transactional
//	@Query("insert into TrainDetails td")
//	public void saveTrain(TrainDetails trainDetails);
	
	
	
}
