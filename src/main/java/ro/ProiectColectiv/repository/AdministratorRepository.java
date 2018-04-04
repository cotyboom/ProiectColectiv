package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectColectiv.model.Administrator;
import ro.ProiectColectiv.enumerable.Rol;

import java.text.DecimalFormat;


public interface AdministratorRepository extends JpaRepository<Administrator, Long> {

    Administrator findByRol(Rol rol);
    Administrator findByUsername(String username);
    Administrator findByPassword(String password);
}
