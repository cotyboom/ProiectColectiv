package ro.ProiectColectiv.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectColectiv.model.FisaMedicala;
import ro.ProiectColectiv.service.FisaMedicalaService;

import java.util.List;

@RestController
@RequestMapping(value = "/fisaMedicala")
public class FisaMedicalaController {

    private FisaMedicalaService fisaMedicalaService;

    @Autowired
    public FisaMedicalaController(FisaMedicalaService fisaMedicalaService)
    {
        this.fisaMedicalaService = fisaMedicalaService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<FisaMedicala> getAll()
    {
        List<FisaMedicala> fisaMedicalaList = fisaMedicalaService.getAllFiseMedicale();

        return fisaMedicalaList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody FisaMedicala fisaMedicala)
    {
        fisaMedicalaService.createFisaMedicala(fisaMedicala);
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public FisaMedicala getById(@PathVariable Long id)
    {
        FisaMedicala fisaMedicala = fisaMedicalaService.getById(id);

        return fisaMedicala;
    }

    @RequestMapping(value = "/getByIdPacient/{id}", method = RequestMethod.GET)
    public List<FisaMedicala> getByIdPacient(@PathVariable String id)
    {
        List<FisaMedicala> fiseMedicale = fisaMedicalaService.getByIdPacient(id);

        return fiseMedicale;
    }
}
