package com.example.springjpamysql.Classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "campus")
public class Campus implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    @Column(unique = true)


    @OneToMany(mappedBy = "campus", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Student> students;

    public Campus() {
    }

    public Campus(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Campus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", students=" + students +
                '}';
    }
}
