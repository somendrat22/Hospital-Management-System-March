package models;

import java.util.List;

public class Doctor {
    String id;
    String name;
    int age;
    String degree;
    List<Patient> patients;

    public Doctor(String id, String name, int age, String degree, List<Patient> patients) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.patients = patients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
