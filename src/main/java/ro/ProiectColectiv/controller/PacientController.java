package ro.ProiectColectiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Pacient pacient) {pacientService.createPacient(pacient);}

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Pacient getById(@PathVariable Long id)
    {
        Pacient pacient = pacientService.getById(id);

        return pacient;
    }
}
