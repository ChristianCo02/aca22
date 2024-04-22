package com.example.demo.dependencyInjection.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dependencyInjection.model.Studente;
import com.example.demo.dependencyInjection.repository.StudenteRepository;

@Service
public class StudenteService {

	@Autowired
	StudenteRepository studenteRepository;

	public Studente inserisciStudente(Studente studente) {
	
		String nomeG = studente.getNome();
		  nomeG = nomeG.substring(0, 1).toUpperCase() + nomeG.substring(1);
			String cognomeG = studente.getCognome();
			cognomeG = cognomeG.substring(0, 1).toUpperCase() + cognomeG.substring(1);
		  
		studente.setNome(nomeG);
		studente.setCognome(cognomeG);
		
		return studenteRepository.save(studente);
		
	}

	public void inserisciCv(MultipartFile cv, Long id) throws IOException {

		Studente studente= studenteRepository.getReferenceById(id);
		studente.setCv(cv.getBytes());
		studenteRepository.save(studente);
		
	}

	public Studente modificaStudente(Studente modificheStudente, Long id) {

		Studente studente= studenteRepository.getReferenceById(id);
		
		
			
		studente.setNome(modificheStudente.getNome());
		studente.setCognome(modificheStudente.getCognome());
		studente.setEmail(modificheStudente.getEmail());
		studente.setNumeroTelefonico(modificheStudente.getNumeroTelefonico());
		studente.setDataInizioCorso(modificheStudente.getDataInizioCorso());
		studente.setDataFineCorso(modificheStudente.getDataFineCorso());
		studente.setNote(modificheStudente.getNote());
		studente.setProgetto(modificheStudente.getProgetto());
		
		String nomeG = studente.getNome();
		  nomeG = nomeG.substring(0, 1).toUpperCase() + nomeG.substring(1);
			String cognomeG = studente.getCognome();
			cognomeG = cognomeG.substring(0, 1).toUpperCase() + cognomeG.substring(1);
			
		studente.setNome(nomeG);
		studente.setCognome(cognomeG);
	
		return studenteRepository.save(studente);
		
	}

	public List<Studente> visualizzaTuttiStudenti() {
	 
		return studenteRepository.findAll();
		
	}

	public Studente visualizzaStudente(Long id) {
	 
		return studenteRepository.getReferenceById(id);
		
	}

	public void eliminaStudente(Long id) {

		Studente studente = studenteRepository.getReferenceById(id);
		studenteRepository.delete(studente);
		
	}

	public void inserisciImmagineProfilo(MultipartFile imgP, Long id) throws IOException {
 
		Studente studente= studenteRepository.getReferenceById(id);
		studente.setImmagineProfilo(imgP.getBytes());
		studenteRepository.save(studente);
		
		
	}
	
}
