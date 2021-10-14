package com.example.springjpamysql;

import com.example.springjpamysql.Classes.AcademicProfile;
import com.example.springjpamysql.Classes.Campus;
import com.example.springjpamysql.Classes.Cours;
import com.example.springjpamysql.Classes.Student;

import com.example.springjpamysql.Repositories.AcademicProfileRepository;
import com.example.springjpamysql.Repositories.CampusRepository;
import com.example.springjpamysql.Repositories.CoursRepository;
import com.example.springjpamysql.Repositories.StudentRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpAmysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpAmysqlApplication.class, args);
    }
    @Bean
    public CommandLineRunner mappingDemo(CampusRepository campusRepository,
                                         StudentRepository studentRepository,
                                         AcademicProfileRepository academicProfileRepository,
                                         CoursRepository coursRepository) {
        return args -> {

            // create new campus
            Campus campus1 = new Campus(1L,"Greenwich","London");
            Campus campus2 = new Campus(2L,"Vancouver","Canada");


            // save campus
            campusRepository.save(campus1);
            campusRepository.save(campus2);
            // create and save new students
            Student paul = new Student(1L,"Paul","Ladmirault","0783953059","paul@ndbtechnology",1L);
            Student nima = new Student(2L,"Nima","Golshafiri","0784567452","nima@ndn.technology",2L);
            Student giorgi = new Student(3L,"Nima","Gogokhia","0711462738","giorgi@ndn.technology",2L);
            studentRepository.save(paul);
            studentRepository.save(nima);
            studentRepository.save(giorgi);

            AcademicProfile paulaca = new AcademicProfile(1L,1L,"A","computer science");
            AcademicProfile nimaca = new AcademicProfile(2L,2L,"B","computer engineering");
            AcademicProfile gioaca = new AcademicProfile(3L,3L,"C","marketing");
            academicProfileRepository.save(paulaca);
            academicProfileRepository.save(nimaca);
            academicProfileRepository.save(gioaca);

            Cours pcour = new Cours(1L,"programming","fall 2021");
            Cours pou = new Cours(2L,"db","summer 2022");
            Cours nimcour = new Cours(1L,"programming","fall 2021");
            Cours nimcou = new Cours(2L,"db","summer 2022");
            Cours giocour = new Cours(1L,"programming","fall 2021");
            coursRepository.save(pcour);
            coursRepository.save(pou);
            coursRepository.save(nimcour);
            coursRepository.save(nimcou);
            coursRepository.save(giocour);
        };
    }


}
