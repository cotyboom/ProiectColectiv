package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectColectiv.model.FisaMedicala;

import java.util.List;

public interface FisaMedicalaRepository extends JpaRepository<FisaMedicala, Long> {

    FisaMedicala findById(Long id);
    List<FisaMedicala> findByTratament(String tratament);
    List<FisaMedicala> findByDiagnostic(String diagnostic);
}
