package ro.ProiectColectiv.model;

import lombok.*;
import ro.ProiectColectiv.abstractElement.Human;
import ro.ProiectColectiv.enumerable.Rol;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "doctor")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Doctor extends Human {
    @Column
    private Rol rol;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String specializare;

    @OneToMany(targetEntity = Pacient.class, cascade = CascadeType.ALL)
    private List<Pacient> listPacient;

    public Doctor(String nume, String prenume, String CNP, String telefon, String adresa, String email, Rol rol, String username, String password, String specializare, List<Pacient> listPacient) {
        super(nume, prenume, CNP, telefon, adresa, email);
        this.rol = Rol.DOCTOR;
        this.username = username;
        this.password = password;
        this.specializare = specializare;
        this.listPacient = listPacient;
    }
}

