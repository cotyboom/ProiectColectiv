package ro.ProiectColectiv.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectColectiv.model.Asistent;
import ro.ProiectColectiv.service.AsistentService;


import java.util.List;
@RestController
@RequestMapping(value = "/asistent")
public class AsistentController {

    private AsistentService asistentService;

    @Autowired
    public AsistentController(AsistentService asistentService)
    {
        this.asistentService = asistentService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Asistent> getAll()
    {
        List<Asistent> asistentList = asistentService.getAllAsistenti();

        return asistentList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Asistent asistent) {asistentService.createAsistent(asistent);}

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public Asistent getById(@PathVariable Long id)
    {
        Asistent asistent = asistentService.getById(id);

        return asistent;
    }
}
