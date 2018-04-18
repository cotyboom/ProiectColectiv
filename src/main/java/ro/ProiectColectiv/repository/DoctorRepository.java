package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectColectiv.enumerable.Rol;
import ro.ProiectColectiv.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor findById(Long id);
    Doctor findByUsername(String username);
}
