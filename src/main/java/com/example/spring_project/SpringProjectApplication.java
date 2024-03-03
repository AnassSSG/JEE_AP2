package com.example.spring_project;

import com.example.spring_project.entities.Medecin;
import com.example.spring_project.entities.Patient;
import com.example.spring_project.repository.MedecinRepository;
import com.example.spring_project.service.PatientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }
    @Bean
    CommandLineRunner start(PatientService patService , MedecinRepository medecinRepository){
        return args -> {
            Stream.of("Ahmed","Omar","Oussama","Anas").forEach(name->{
                Patient pat = new Patient();
                pat.setNom(name);
                pat.setMalade(name.equals("Ahmed"));
                pat.setDateNaissance(new Date());
                patService.ajouterPatient(pat);
            });
            Stream.of("Adil","Abdellah","Ali").forEach(name->{
                Medecin med = new Medecin();
                med.setNom(name);
                med.setEmail(name+"@gmail.com");
                med.setSpecialite(Math.random() > 0.5 ? "Dentiste" : "Cardiologue");
                medecinRepository.save(med);
            });
        };
    }

}
