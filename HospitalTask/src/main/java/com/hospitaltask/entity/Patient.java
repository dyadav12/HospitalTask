package com.hospitaltask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table ( name = "tbl_Patient" )
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient{


    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private long
            id;

    @Column ( name = "patientEmail" )
    private String email;


    private String password, name, age, bloodGroup, illness;

    @Column(name="patient_admitted_Date")
    private final Date createdDate = Calendar.getInstance().getTime();


    @ManyToOne(cascade=CascadeType.MERGE)
    @JoinColumn( name="doctor_id" )
    private  Doctor doctor;


}
