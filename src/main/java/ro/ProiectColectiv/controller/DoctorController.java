package ro.ProiectColectiv.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectColectiv.model.Doctor;
import ro.ProiectColectiv.service.DoctorService;

import javax.print.Doc;
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

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public Doctor getById(@PathVariable Long id)
    {
        Doctor doctor = doctorService.findById(id);

        return doctor;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createDoctor(@RequestBody Doctor doctor)
    {
        doctorService.createDoctor(doctor);
    }

    @RequestMapping(value = "/getByUsername/{username}", method = RequestMethod.GET)
    public Doctor getByUsername(@PathVariable String username)
    {
        Doctor doctor = doctorService.findByUsername(username);

        return doctor;
    }

}
