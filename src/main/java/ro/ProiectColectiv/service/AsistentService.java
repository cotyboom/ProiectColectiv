package ro.ProiectColectiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectColectiv.model.Asistent;
import ro.ProiectColectiv.repository.AsistentRepository;

import java.util.List;


@Service
public class AsistentService {

    private AsistentRepository asistentRepository;

    @Autowired
    public AsistentService(AsistentRepository asistentRepository) {this.asistentRepository = asistentRepository;}

    public List<Asistent> getAllAsistenti() {
        List<Asistent> listOfAllAsistenti = asistentRepository.findAll();

        return listOfAllAsistenti;
    }
}