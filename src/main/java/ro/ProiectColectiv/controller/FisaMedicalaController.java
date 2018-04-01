package ro.ProiectColectiv.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
}
