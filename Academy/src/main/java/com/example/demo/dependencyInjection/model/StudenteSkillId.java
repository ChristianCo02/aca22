package com.example.demo.dependencyInjection.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudenteSkillId implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Long studenteId;
	private Long skillId;
	private Double voto;
	
	
	
	public StudenteSkillId() {
		super();
	}
	
	public Long getStudenteId() {
		return studenteId;
	}
	public void setStudenteId(Long studenteId) {
		this.studenteId = studenteId;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public Double getVoto() {
		return voto;
	}
	public void setVoto(Double voto) {
		this.voto = voto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
