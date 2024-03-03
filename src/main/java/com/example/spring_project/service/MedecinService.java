package com.example.spring_project.service;

import com.example.spring_project.entities.Medecin;

import java.util.List;

public interface MedecinService {
     public Medecin ajouterMedecin(Medecin Medecin);
     public List<Medecin> ConsulterTousMedecins();
     public Medecin ConsulterMedecin(Long id);
     public List<Medecin> rechercherMedecins(String nom);
     public void supprimerMedecin(Long id);
     public void modifierMedecin(long id ,Medecin Medecin);
}
