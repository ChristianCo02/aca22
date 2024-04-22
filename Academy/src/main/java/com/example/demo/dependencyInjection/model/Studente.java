package com.example.demo.dependencyInjection.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;

@Entity
public class Studente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome,cognome,email,titoloDiStudio;
	private Long numeroTelefonico;
	private Date dataDiNascita;
	private Date dataInizioCorso;
	private Date dataFineCorso;
	private String progetto;
	private String note;
	
	
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[]Cv;

	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[]immagineProfilo;
	
	@OneToMany(mappedBy = "studente")
	private List<StudenteSkill> skill;
	
	
	public Studente() {
		super();
	}
	
	public byte[] getImmagineProfilo() {
		return immagineProfilo;
	}




	public void setImmagineProfilo(byte[] immagineProfilo) {
		this.immagineProfilo = immagineProfilo;
	}




	public String getTitoloDiStudio() {
		return titoloDiStudio;
	}



	public void setTitoloDiStudio(String titoloDiStudio) {
		this.titoloDiStudio = titoloDiStudio;
	}



	public List<StudenteSkill> getSkill() {
		return skill;
	}


	public void setSkill(List<StudenteSkill> skill) {
		this.skill = skill;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getNumeroTelefonico() {
		return numeroTelefonico;
	}


	public void setNumeroTelefonico(Long numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}


	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}


	public Date getDataInizioCorso() {
		return dataInizioCorso;
	}


	public void setDataInizioCorso(Date dataInizioCorso) {
		this.dataInizioCorso = dataInizioCorso;
	}


	public Date getDataFineCorso() {
		return dataFineCorso;
	}


	public void setDataFineCorso(Date dataFineCorso) {
		this.dataFineCorso = dataFineCorso;
	}


	public String getProgetto() {
		return progetto;
	}


	public void setProgetto(String progetto) {
		this.progetto = progetto;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public byte[] getCv() {
		return Cv;
	}


	public void setCv(byte[] cv) {
		Cv = cv;
	}
	
	
}
