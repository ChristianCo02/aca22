package com.example.demo.dependencyInjection.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[]imgDocumento;
	private String nomeDocumento;
	
	
	public Documento() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public byte[] getImgDocumento() {
		return imgDocumento;
	}
	public void setImgDocumento(byte[] imgDocumento) {
		this.imgDocumento = imgDocumento;
	}
	public String getNomeDocumento() {
		return nomeDocumento;
	}
	public void setNomeDocumento(String nomeDocumento) {
		this.nomeDocumento = nomeDocumento;
	}
	
	
	
	
	
	
}
