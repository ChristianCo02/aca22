package com.example.demo.dependencyInjection.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class StudenteSkill {

	@EmbeddedId
	private StudenteSkillId id;
	
	@ManyToOne
	@MapsId("studenteId")
	private Studente studente;
	
	@ManyToOne
	@MapsId("skillId")
	private Skill skill;

	
	public StudenteSkill() {
		super();
	}

	public StudenteSkillId getId() {
		return id;
	}

	public void setId(StudenteSkillId id) {
		this.id = id;
	}

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	
}
