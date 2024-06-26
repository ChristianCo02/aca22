package com.example.demo.dependencyInjection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dependencyInjection.model.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long>{

}
