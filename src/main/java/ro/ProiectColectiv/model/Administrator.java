package ro.ProiectColectiv.model;

import lombok.*;
import ro.ProiectColectiv.abstractElement.Human;
import ro.ProiectColectiv.enumerable.Rol;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "administrator")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Administrator extends Human {
    @Column
    private Rol rol;

    @Column
    private String username;

    @Column
    private String password;

    public Administrator(String nume, String prenume, String CNP, String telefon, String adresa, String email, Rol rol, String username, String password) {
        super(nume, prenume, CNP, telefon, adresa, email);
        this.rol = Rol.ADMINISTRATOR;
        this.username = username;
        this.password = password;
    }


}




