package com.example.springjpamysql.Repositories;
import com.example.springjpamysql.Classes.Cours;
import org.springframework.data.repository.CrudRepository;

public interface CoursRepository extends CrudRepository<Cours, Long>{
    Cours findCoursByName(String name);
}
