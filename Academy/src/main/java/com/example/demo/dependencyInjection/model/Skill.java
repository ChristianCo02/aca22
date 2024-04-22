package com.example.demo.dependencyInjection.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeSkill;

	@OneToMany(mappedBy = "skill")
	private List<StudenteSkill> studenti;

	
	public Skill() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeSkill() {
		return nomeSkill;
	}

	public void setNomeSkill(String nomeSkill) {
		this.nomeSkill = nomeSkill;
	}

	public List<StudenteSkill> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<StudenteSkill> studenti) {
		this.studenti = studenti;
	}
	
	
	
}
