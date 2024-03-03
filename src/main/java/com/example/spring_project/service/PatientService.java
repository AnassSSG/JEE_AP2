package com.example.spring_project.service;

import com.example.spring_project.entities.Patient;

import java.util.List;

public interface PatientService {
    public Patient ajouterPatient(Patient patient);
    public List<Patient> ConsulterTousPatients();
    public Patient ConsulterPatient(Long id);
    public List<Patient> rechercherPatients(String nom);
    public void supprimerPatient(Long id);
    public void modifierPatient(long id ,Patient patient);
}
