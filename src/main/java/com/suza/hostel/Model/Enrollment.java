package com.suza.hostel.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "enrollment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String department;
    public int numberOfEnrollment;
    public Boolean is_available;

    @ManyToOne
    @JoinColumn(name="student_id")
    public Student student;
}
