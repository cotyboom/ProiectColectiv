package ro.ProiectColectiv.model;

import lombok.*;
import ro.ProiectColectiv.abstractElement.Human;
import ro.ProiectColectiv.enumerable.Rol;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "asistent")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Asistent extends Human {
    @Column
    private Rol rol;

    @Column
    private String username;

    @Column
    private String password;


    public Asistent(String nume, String prenume, String CNP, String telefon, String adresa, String email, Rol rol, String username, String password) {
        super(nume, prenume, CNP, telefon, adresa, email);
        this.rol = Rol.ASISTENT;
        this.username = username;
        this.password = password;
    }
}




