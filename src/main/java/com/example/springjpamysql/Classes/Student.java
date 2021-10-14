package com.example.springjpamysql.Classes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "students")
public class Student implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String family;
    private String tel;
    private String email;
    private Long campusId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinColumn(name = "campusId",insertable=false, updatable=false)
    private Campus campus;



    public Student() {

    }

    public Student(Long id, String name, String family, String tel, String email, Long campusId) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.tel = tel;
        this.email = email;
        this.campusId = campusId;
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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCampusId() {
        return campusId;
    }

    public void setCampusId(Long campusId) {
        this.campusId = campusId;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", tel=" + tel +
                ", email='" + email + '\'' +
                ", campusId=" + campusId +
                ", campus=" + campus +
                '}';
    }
}
