package com.train.models;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
public class TrainDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trainId;
	private String trainName;
	@Column(unique = true)
	@Min(value = 5, message = "Train number must be 5 numbers")
	private long tarinNumber;
	private String source;
	private String destination;
	
	@OneToMany(mappedBy = "trainDetails", targetEntity =  TrainStops.class,cascade = CascadeType.ALL)
	private List<TrainStops> trainStops;
	
	
	
	

}
