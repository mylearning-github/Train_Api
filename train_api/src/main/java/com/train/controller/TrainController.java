package com.train.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.models.TrainDetails;
import com.train.services.TrainServices;

@RestController
@RequestMapping("api/v1")
public class TrainController {

	TrainServices trainServices;

	@Autowired
	public TrainController(TrainServices services) {
		this.trainServices=services;
	}
	
	@PostMapping("train")
	public ResponseEntity<String> saveTrain(@RequestBody TrainDetails details) {
		trainServices.saveTrain(details);
		return new ResponseEntity("Train Saved Successfully", HttpStatus.CREATED);
	}
	
	@PostMapping("trains")
	public ResponseEntity<String> saveTrain(@RequestBody List<TrainDetails> details) {
		trainServices.saveTrains(details);
		return new ResponseEntity("Train List Saved Successfully", HttpStatus.CREATED);
	}

	@GetMapping("train")
	public List<TrainDetails> getAllTrains() {
		return trainServices.getAllTrains();
	}
	
	@GetMapping("train/{trainId}")
	public TrainDetails getTrainById(@PathVariable(name = "trainId") long trainId) {
		return trainServices.getTrainById(trainId);
	}

}
