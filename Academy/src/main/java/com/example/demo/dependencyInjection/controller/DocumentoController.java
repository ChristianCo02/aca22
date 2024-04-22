package com.example.demo.dependencyInjection.controller;

import java.io.IOException;
import java.util.Dictionary;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dependencyInjection.model.Documento;
import com.example.demo.dependencyInjection.service.DocumentoService;

@RestController
@RequestMapping("/api/documento")
@CrossOrigin
public class DocumentoController {

	@Autowired
	DocumentoService documentoService;
	
	@GetMapping("/getAllDocuments")
	public List<Documento>getAllDocuments(){
		
		return documentoService.getAllDocuments();
		
	}
	
	@PostMapping("/addDocument")
	public void addDocument(@RequestParam String nomeDocumento,@RequestParam("immagineDocumento")MultipartFile immagineDocumento) throws IOException {
		
		documentoService.addDocument(nomeDocumento,immagineDocumento);
		
	}
	
	
}
