package ro.ProiectColectiv.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ProiectColectiv.model.Doctor;
import ro.ProiectColectiv.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    private DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService)
    {
        this.doctorService = doctorService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Doctor> getAll()
    {
        List<Doctor> doctorList = doctorService.getAllDoctori();

        return doctorList;
    }
}
