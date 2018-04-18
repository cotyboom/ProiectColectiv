package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectColectiv.model.Administrator;
import ro.ProiectColectiv.enumerable.Rol;

import java.text.DecimalFormat;


public interface AdministratorRepository extends JpaRepository<Administrator, Long>
{
    Administrator findById(Long id);
    Administrator findByUsername(String username);
}
