package ro.ProiectColectiv.repository;

import ro.ProiectColectiv.model.Programare;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;


    public interface ProgramareRepository extends JpaRepository<Programare, Long>
{
           Programare findById(Long id);
           Programare findByDate(Date dataDonare);
}
