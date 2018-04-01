package ro.ProiectColectiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectColectiv.model.Pacient;
import ro.ProiectColectiv.repository.PacientRepository;
import  java.util.List;


@Service
public class PacientService
{
    private PacientRepository pacientRepository;
    @Autowired

    public PacientService(PacientRepository pacientRepository)
            {
                this.pacientRepository = pacientRepository;
            }

            public List<Pacient> getAllPacienti()
            {
                List<Pacient> listOfAllPacienti = pacientRepository.findAll();

                return listOfAllPacienti;
            }
}
