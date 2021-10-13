package com.example.springjpamysql.Repositories;
import com.example.springjpamysql.Classes.Campus;
import org.springframework.data.repository.CrudRepository;

public interface CampusRepository extends CrudRepository<Campus, Long>{
    Campus findCampusByName(String name);
}
