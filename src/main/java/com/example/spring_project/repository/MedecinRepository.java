package com.example.spring_project.repository;

import com.example.spring_project.entities.Medecin;
import com.example.spring_project.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepository  extends JpaRepository<Medecin, Long>{
    List<Medecin> findByNom(String nom);
}
