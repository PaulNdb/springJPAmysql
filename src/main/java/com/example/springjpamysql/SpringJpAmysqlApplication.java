package com.example.springjpamysql;

import com.example.springjpamysql.Classes.Campus;
import com.example.springjpamysql.Classes.Student;
import com.example.springjpamysql.Repositories.CampusRepository;

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
                                         StudentRepository studentRepository) {
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
        };
    }


}
