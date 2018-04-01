package ro.ProiectColectiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectColectiv.model.Doctor;
import ro.ProiectColectiv.repository.DoctorRepository;

import java.util.List;


@Service
public class DoctorService {

    private DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {this.doctorRepository = doctorRepository;}

    public List<Doctor> getAllDoctori() {
        List<Doctor> listOfAllDoctori = doctorRepository.findAll();

        return listOfAllDoctori;
    }
}
