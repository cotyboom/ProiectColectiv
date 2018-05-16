package ro.ProiectColectiv.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectColectiv.model.Administrator;
import ro.ProiectColectiv.service.AdministratorService;
import ro.ProiectColectiv.service.DoctorService;


import java.util.List;
@RestController
@RequestMapping(value = "/administrator")
public class AdministratorController {

    private AdministratorService administratorService;
    private DoctorService doctorService;

    @Autowired
    public AdministratorController(AdministratorService administratorService, DoctorService doctorService)
    {
        this.administratorService = administratorService;
        this. doctorService = doctorService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Administrator> getAll()
    {
        List<Administrator> administratorList = administratorService.getAllAdministratori();

        return administratorList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Administrator administrator) { administratorService.createAdministrator(administrator);}

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public Administrator getById(@PathVariable Long id)
    {
        Administrator administrator = administratorService.getById(id);

        return administrator;
    }
}
