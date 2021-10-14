package com.example.springjpamysql.Repositories;
import com.example.springjpamysql.Classes.Campus;
import com.example.springjpamysql.Classes.Student;
import com.example.springjpamysql.Classes.AcademicProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface AcademicProfileRepository extends CrudRepository<AcademicProfile, Long> {
    List<AcademicProfile> findByStudent(Student student, Sort sort);

}
