package models;

import javax.print.Doc;
import java.util.List;

public class Hospital {
    int id;
    String name;
    String address;
    String emailId;
    int capacity;
    List<Patient> patients;
    List<Doctor> doctors;
}
