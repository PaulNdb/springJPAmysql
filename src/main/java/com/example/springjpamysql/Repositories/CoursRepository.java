package com.example.springjpamysql.Repositories;
import com.example.springjpamysql.Classes.Cours;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CoursRepository extends CrudRepository<Cours, Long>{
    List<Cours> findCoursByName(String name);
}
