package ro.ProiectColectiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectColectiv.model.DatePersonale;
import ro.ProiectColectiv.repository.DatePersonaleRepository;

import java.util.List;

@Service
public class DatePersonaleService {

    private DatePersonaleRepository datePersRepository;

    @Autowired
    public DatePersonaleService(DatePersonaleRepository datePersRepository) {this.datePersRepository = datePersRepository;}

    public List<DatePersonale> getAllDatePersonale()
    {
        List<DatePersonale> listOfAllDatePersonale = datePersRepository.findAll();

        return listOfAllDatePersonale;
    }
}
