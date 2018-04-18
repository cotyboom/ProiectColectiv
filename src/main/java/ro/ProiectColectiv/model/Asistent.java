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

    @OneToMany(targetEntity = Programare.class, cascade = CascadeType.ALL)
    private List<Programare> listProgramare;

    public Asistent(String nume, String prenume, String CNP, String telefon, String adresa, String email, Rol rol, String username, String password, List<Programare> listProgramare) {
        super(nume, prenume, CNP, telefon, adresa, email);
        this.rol = Rol.ASISTENT;
        this.username = username;
        this.password = password;
        this.listProgramare = listProgramare;
    }
}




