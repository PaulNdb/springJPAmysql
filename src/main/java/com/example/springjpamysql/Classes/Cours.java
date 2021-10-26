package com.example.springjpamysql.Classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String semester;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "attendance",
            joinColumns = { @JoinColumn(name = "cours_id", referencedColumnName = "id",
                    nullable = false) },
            inverseJoinColumns = { @JoinColumn(name = "student_id", referencedColumnName = "id",
                    nullable = false) }
    )
    List<Student> students = new ArrayList<>();


    public Cours() {
    }

    public Cours(Long id, String name, String semester) {
        this.id = id;
        this.name = name;
        this.semester = semester;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
    public void addStudent(Student student){
        students.add(student);
    }
}
