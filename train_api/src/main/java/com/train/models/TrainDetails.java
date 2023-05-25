package com.train.models;

import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class TrainDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trainId;
	
	private String trainName;
	@Min(value = 5, message = "Train number must be 5 numbers")
	private long tarinNumber;
	private String source;
	private String destination;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = TrainStops.class)
	@JoinColumn(name = "stops",referencedColumnName = "trainStopsId" ,nullable = true)
	private List<TrainStops> stops;
	
	

}
