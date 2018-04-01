package ro.ProiectColectiv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
}