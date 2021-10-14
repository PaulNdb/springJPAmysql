package com.example.springjpamysql.Classes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="AcademicProfile")
public class AcademicProfile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Long studentId;
    private String level;
    private String major;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="studentId",insertable=false, updatable=false)
    private Student student;

    public AcademicProfile() {
    }

    public AcademicProfile(Long id, Long studentId, String level, String major) {
        this.id = id;
        this.studentId = studentId;
        this.level = level;
        this.major = major;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "AcademicProfile{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", level='" + level + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
