package com.train.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.train.models.TrainStops;

@Repository
public interface TrainStopsReposistry extends JpaRepository<TrainStops, Long> {

}
