package ro.ProiectColectiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectColectiv.model.Administrator;
import ro.ProiectColectiv.repository.AdministratorRepository;

import java.util.List;


@Service
public class AdministratorService {

    private AdministratorRepository administratorRepository;

    @Autowired
    public AdministratorService(AdministratorRepository administratorRepository) {this.administratorRepository = administratorRepository;}

    public List<Administrator> getAllAdministratori() {
        List<Administrator> listOfAllAdministratori = administratorRepository.findAll();

        return listOfAllAdministratori;
    }

    public void createAdministrator(Administrator administrator) {administratorRepository.save(administrator);}

    public Administrator getById(Long id) {return administratorRepository.findById(id);}
}