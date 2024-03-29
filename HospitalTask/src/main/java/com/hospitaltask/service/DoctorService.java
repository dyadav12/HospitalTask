package com.hospitaltask.service;

import com.hospitaltask.entity.Doctor;

import java.util.List;

public interface DoctorService {



    //Add & Update Operation

    Doctor addDoctor(Doctor doctor);
     Doctor updateDoctorById(Doctor createDoctor,Long id);
    Doctor updateDoctorByEmail(Doctor createDoctor,String email);
    Doctor updateDoctorByName(Doctor createDoctor,String name);



    //fetch & filter Operation

     List< Doctor > getAllDoctor() ;
     Doctor getDoctorById(Long id);
     Doctor findByEmail(String email);
     Doctor findByDoctorName(String doctorName);


     //Delete Operation

     void deleteAllDoctor();
     void deleteDoctorById(Long id);


     //External methods


    String getPasswordByEmail( String email);
}
