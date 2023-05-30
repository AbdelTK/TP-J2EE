package ma.emsi.patientsmvc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ma.emsi.patientsmvc.entities.Patient;
import ma.emsi.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Houssam",new Date(),false,122));
            patientRepository.save(new Patient(null,"Zouhair",new Date(),true,321));
            patientRepository.save(new Patient(null,"Ibtissame",new Date(),true,165));
            patientRepository.save(new Patient(null,"Sara",new Date(),false,321));
            patientRepository.save(new Patient(null,"Jalal",new Date(),false,163));
            patientRepository.save(new Patient(null,"Abdellah",new Date(),true,132));
            patientRepository.save(new Patient(null,"Yacine",new Date(),true,236));
            patientRepository.save(new Patient(null,"Amine",new Date(),false,300));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }

}
