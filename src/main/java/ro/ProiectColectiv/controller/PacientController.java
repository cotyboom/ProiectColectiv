package ro.ProiectColectiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ProiectColectiv.model.Pacient;
import ro.ProiectColectiv.service.PacientService;
import java.util.List;

@RestController
@RequestMapping(value = "/pacient")
public class PacientController {

    private PacientService pacientService;

    @Autowired
    public PacientController(PacientService pacientService)
    {
        this.pacientService = pacientService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Pacient> getAll()
    {
        List<Pacient> pacientList = pacientService.getAllPacienti();

        return pacientList;
    }
}
