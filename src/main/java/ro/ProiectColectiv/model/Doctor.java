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
    private String username;

    @Column
    private String password;


    public Doctor(String nume, String prenume, String CNP, String telefon, String adresa, String email, String username, String password) {
        super(nume, prenume, CNP, telefon, adresa, email);
        this.username = username;
        this.password = password;
    }
}

