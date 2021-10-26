package com.example.springjpamysql.Repositories;
import java.util.List;
import com.example.springjpamysql.Classes.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>{
    List<Student> findStudentByName(String name);
}
