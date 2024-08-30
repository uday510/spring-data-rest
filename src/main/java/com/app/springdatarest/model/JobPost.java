package com.app.springdatarest.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {

	@Id
	private int postId;
	private String postProfile;
	private String postDesc;
	private Integer reqExperience;

	@ElementCollection
	private List<String> postTechStack;
}