package ro.ProiectColectiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import ro.ProiectColectiv.enumerable.Rol;
import ro.ProiectColectiv.model.Doctor;

import javax.transaction.Transactional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Doctor findById(Long id);
    Doctor findByUsername(String username);
    @Modifying
    @Transactional
    void deleteFirstById (Long id);
}
