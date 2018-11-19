package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private String studentId;
    private String schoolYear;
    private String campus;
    //change it later to some date format
    private String entryDate;
    private String gradeLevel;
    private String name;

    public Student() {
    }

    public Student(String schoolYear, String campus, String studentId, String entryDate, String gradeLevel,
                   String name) {
        this.schoolYear = schoolYear;
        this.campus = campus;
        this.studentId = studentId;
        this.entryDate = entryDate;
        this.gradeLevel = gradeLevel;
        this.name = name;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolYear='" + schoolYear + '\'' +
                ", campus='" + campus + '\'' +
                ", studentId='" + studentId + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
