package com.train.services;

import java.util.List;

import com.train.models.TrainDetails;

public interface TrainServices {

	public void saveTrain(TrainDetails trainDetails);
	public void saveTrains(List<TrainDetails> listTrains);
	public List<TrainDetails> getAllTrains();
	public TrainDetails getTrainById(long trainId);
	
}
