package com.xworkz.jpaexamples.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="metro")
	
public class MetroEntity{
		
		@Id
		@Column(name = "id")
		private int id;
		@Column(name = "metroLine")
		private String metroLine;
		@Column(name = "metroName")
		private String metroName;
		@Column(name = "started")
		private int started;
		@Column(name = "price")
		private double price;
		@Column(name = "owner")
		private String owner;
		@Column(name = "noOfLines")
		private int noOfLines;
		@Column(name = "trainLength")
		private double trainLength;
		@Column(name = "noOfStations")
		private int noOfStations;
		@Column(name = "maxSpeed")
		private double maxSpeed;
		@Column(name = "webSite")
		private String webSite;
				
	}


