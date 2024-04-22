package com.example.demo.dependencyInjection.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dependencyInjection.model.Documento;
import com.example.demo.dependencyInjection.repository.DocumentoRepository;

@Service
public class DocumentoService {

	@Autowired
	DocumentoRepository documentoRepository;

	public List<Documento> getAllDocuments() {
 
		return documentoRepository.findAll();
		
	}

	public void addDocument(String nomeDocumento, MultipartFile immagineDocumento) throws IOException {

		Documento documento = new Documento();
		documento.setNomeDocumento(nomeDocumento);
		documento.setImgDocumento(immagineDocumento.getBytes());
		documentoRepository.save(documento);
		
		
	}
	
}
