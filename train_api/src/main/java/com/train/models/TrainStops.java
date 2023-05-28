package com.train.models;

import java.sql.Time;
import java.util.List;

import org.hibernate.annotations.LazyCollectionOption;

import com.train.repository.TrainRepository;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data

public class TrainStops {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long trainStopsId;
	
	
	private String stationName;
	private String stationCode;
	private String arrivalTime;
	private String depatureTime;
	
	
	@ManyToOne(targetEntity = TrainDetails.class, fetch  = FetchType.LAZY)
	@JoinColumn(name = "trainId_fk",referencedColumnName = "trainId", nullable = true)
	private TrainDetails trainDetails;
	

	
}
