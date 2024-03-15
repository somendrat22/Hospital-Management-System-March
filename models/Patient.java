package models;

public class Patient {
    String id;
    String name;
    int age;
    String disease;
    String address;
    long phoneNumber;
    Doctor doctor;

    String admissionDate;

    public Patient(String id, String name, int age, String disease, String address, long phoneNumber, Doctor doctor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.doctor = doctor;
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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
