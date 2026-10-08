package com.suza.hostel.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String address;
    public String gender;
    public int age;
    public Boolean is_married;

    @OneToMany(mappedBy = "student")
    public List<Enrollment> enrollment;

}
