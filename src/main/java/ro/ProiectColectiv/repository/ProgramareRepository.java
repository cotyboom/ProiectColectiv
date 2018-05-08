package ro.ProiectColectiv.repository;

import ro.ProiectColectiv.model.Programare;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;


public interface ProgramareRepository extends JpaRepository<Programare, Long>
{
           Programare findById(Long id);
           List<Programare> findByDate(Date dataDonare);
           List<Programare> findByIdDoctor(String idDoctor);
           List<Programare> findByIdPacient(String idPacient);
}
