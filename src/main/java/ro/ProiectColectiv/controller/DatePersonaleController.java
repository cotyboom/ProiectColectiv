package ro.ProiectColectiv.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ProiectColectiv.model.DatePersonale;
import ro.ProiectColectiv.service.DatePersonaleService;

import java.util.List;

@RestController
@RequestMapping(value = "/datePersonale")
public class DatePersonaleController {

    private DatePersonaleService datePersonaleService;

    @Autowired
    public DatePersonaleController(DatePersonaleService datePersonaleService)
    {
        this.datePersonaleService = datePersonaleService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<DatePersonale> getAll()
    {
        List<DatePersonale> datePersonaleList = datePersonaleService.getAllDatePersonale();

        return datePersonaleList;
    }
}
