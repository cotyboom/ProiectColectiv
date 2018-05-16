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
    private String password;

    @Column
    private String varsta;

    @Column
    private String inaltime;

    @Column
    private String greutate;

    @Column
    private String boli;

    @Column
    private String idDoctor;

    public Pacient(String nume, String prenume, String CNP, String telefon, String adresa, String email, Rol rol,String greutate, String inaltime, String password, String idDoctor, String varsta, String boli) {
        super(nume, prenume, CNP, telefon, adresa, email);
        this.rol = Rol.PACIENT;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.password = password;
        this.idDoctor = idDoctor;
        this.varsta = varsta;
        this.boli = boli;
    }

}
