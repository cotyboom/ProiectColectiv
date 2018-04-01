package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectColectiv.model.DatePersonale;

import java.text.DecimalFormat;


public interface DatePersonaleRepository extends JpaRepository<DatePersonale, Long> {

    DatePersonale findById(Long id);
    DatePersonale findByTelefon(String telefon);
    DatePersonale findByEmail(String email);
    DatePersonale findByVarsta(Integer varsta);
    DatePersonale findByInaltime(DecimalFormat inaltime);
    DatePersonale findByGreutate(DecimalFormat greutate);
    DatePersonale findByAdresa(String adresa);
    DatePersonale findByTelefonContact(String telefonContact);
}
