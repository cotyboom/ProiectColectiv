package ro.ProiectColectiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectColectiv.model.Programare;
import ro.ProiectColectiv.repository.ProgramareRepository;
import java.util.List;

@Service
public class ProgramareService
{
    private ProgramareRepository programareRepository;

    @Autowired
    public ProgramareService(ProgramareRepository programareRepository)
          {
              this.programareRepository = programareRepository;
          }

          public List<Programare> getAllProgramari()
            {
                List<Programare> listofAllProgramari = programareRepository.findAll();

                return listofAllProgramari;
            }
}
