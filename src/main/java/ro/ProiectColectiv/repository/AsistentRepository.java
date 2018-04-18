package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectColectiv.model.Asistent;
import ro.ProiectColectiv.enumerable.Rol;


public interface AsistentRepository extends JpaRepository<Asistent, Long>
{
    Asistent findById(Long id);
    Asistent findByUsername(String username);
}