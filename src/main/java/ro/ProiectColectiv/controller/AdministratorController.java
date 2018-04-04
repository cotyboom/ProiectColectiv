package ro.ProiectColectiv.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ProiectColectiv.model.Administrator;
import ro.ProiectColectiv.service.AdministratorService;


import java.util.List;
@RestController
@RequestMapping(value = "/administrator")
public class AdministratorController {

    private AdministratorService administratorService;

    @Autowired
    public AdministratorController(AdministratorService administratorService)
    {
        this.administratorService = administratorService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Administrator> getAll()
    {
        List<Administrator> administratorList = administratorService.getAllAdministratori();

        return administratorList;
    }
}
