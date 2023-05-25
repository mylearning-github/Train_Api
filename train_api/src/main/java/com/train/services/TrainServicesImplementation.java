package com.train.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.models.TrainDetails;
import com.train.repository.TrainRepository;

@Service
public class TrainServicesImplementation implements TrainServices {

	TrainRepository trainRepository;
	
	@Autowired
	public TrainServicesImplementation(TrainRepository repository) {
		this.trainRepository=repository;
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
