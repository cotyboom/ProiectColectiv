package ro.ProiectColectiv.model;
import lombok.*;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.List;

import ro.ProiectColectiv.abstractElement.Human;
import ro.ProiectColectiv.enumerable.Rol;

@Entity
@Table(name = "pacient")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Pacient extends Human {

    @Column
    private Rol rol;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Integer inaltime;

    @Column
    private Integer greutate;

    @Column
    private String idDoctor;

    public Pacient(String nume, String prenume, String CNP, String telefon, String adresa, String email, Rol rol,Integer greutate, Integer inaltime, String username, String password, String idDoctor) {
        super(nume, prenume, CNP, telefon, adresa, email);
        this.rol = Rol.PACIENT;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.username = username;
        this.password = password;
        this.idDoctor = idDoctor;
    }

}
