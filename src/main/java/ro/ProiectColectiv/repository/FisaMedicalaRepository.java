package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectColectiv.model.FisaMedicala;

public interface FisaMedicalaRepository extends JpaRepository<FisaMedicala, Long> {

    FisaMedicala findById(Long id);
    FisaMedicala findByTratament(String tratament);
    FisaMedicala findByDiagnostic(String diagnostic);
    FisaMedicala findByObservatii(String observatii);
}
