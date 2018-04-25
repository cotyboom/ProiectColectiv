package ro.ProiectColectiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectColectiv.model.Programare;
import ro.ProiectColectiv.service.ProgramareService;
import java.util.List;

@RestController
@RequestMapping(value = "/programare")
public class ProgramareController {

    private ProgramareService programareService;

    @Autowired
    public ProgramareController(ProgramareService programareService) {
        this.programareService = programareService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Programare> getAll() {
        List < Programare > programareList = programareService.getAllProgramari();

        return programareList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Programare programare){programareService.createProgramare(programare);}

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Programare getById(@PathVariable Long id)
    {
        Programare programare = programareService.getById(id);

        return programare;
    }
}