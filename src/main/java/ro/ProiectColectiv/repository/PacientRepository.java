package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectColectiv.model.Pacient;

import java.util.List;


public interface PacientRepository extends JpaRepository<Pacient, Long>
        {
          Pacient findById(Long id);
          Pacient findByNume(String nume);
          List<Pacient> findByIdDoctor(String id);
        }
