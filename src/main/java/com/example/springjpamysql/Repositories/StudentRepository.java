package com.example.springjpamysql.Repositories;

import com.example.springjpamysql.Classes.Campus;
import com.example.springjpamysql.Classes.Student;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long>{
    List<Student> findByCampus(Campus campus, Sort sort);
}
