package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectColectiv.model.Asistent;
import ro.ProiectColectiv.enumerable.Rol;


public interface AsistentRepository extends JpaRepository<Asistent, Long>
{
    Asistent findByRol(Rol rol);
    Asistent findByUsername(String username);
    Asistent findByPassword(String password);
}