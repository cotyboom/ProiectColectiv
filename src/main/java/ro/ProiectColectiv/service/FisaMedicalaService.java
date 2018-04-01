package ro.ProiectColectiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectColectiv.model.FisaMedicala;
import ro.ProiectColectiv.repository.FisaMedicalaRepository;

import java.util.List;


@Service
public class FisaMedicalaService {

    private FisaMedicalaRepository fisaMedicalaRepository;

    @Autowired
    public FisaMedicalaService(FisaMedicalaRepository fisaMedicalaRepository) {this.fisaMedicalaRepository = fisaMedicalaRepository;}

    public List<FisaMedicala> getAllFiseMedicale() {

        List<FisaMedicala> listOfAllFiseMedicale = fisaMedicalaRepository.findAll();

        return listOfAllFiseMedicale;
    }
}
