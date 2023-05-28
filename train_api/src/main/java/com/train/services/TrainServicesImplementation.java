package com.train.services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.models.TrainDetails;
import com.train.models.TrainStops;
import com.train.repository.TrainRepository;
import com.train.repository.TrainStopsReposistry;

import lombok.extern.slf4j.Slf4j;

@Service
public class TrainServicesImplementation implements TrainServices {

	TrainRepository trainRepository;
	TrainStopsReposistry stopsReposistry;
	
	
	
	public TrainServicesImplementation(TrainRepository repository,TrainStopsReposistry stopsReposistry) {
		this.trainRepository=repository;
		this.stopsReposistry=stopsReposistry;
	}
	
	@Override
	public void saveTrain(TrainDetails trainDetails) {
		
		
		trainRepository.save(trainDetails);
		

		
	}

	@Override
	public void saveTrains(List<TrainDetails> listTrains) {
		trainRepository.saveAll(listTrains);
		
	}

	@Override
	public List<TrainDetails> getAllTrains() {
		return trainRepository.findAll();
	}

	@Override
	public TrainDetails getTrainById(long trainId) {
		return trainRepository.findById(trainId).get();
	}

}
