package ro.ProiectColectiv.model;
import lombok.*;

import javax.persistence.*;
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
    private DatePersonale datePersonale;

    @Column
    private String username;

    @Column
    private String password;

    @OneToMany(targetEntity = FisaMedicala.class, cascade = CascadeType.ALL)
    private List<FisaMedicala> listFisa;

    @OneToMany(targetEntity = Programare.class, cascade = CascadeType.ALL)
    private List<Programare> listProgramare;

    public Pacient(String nume, String prenume, String CNP, String telefon, String adresa, String email, Rol rol, DatePersonale datePersonale, String username, String password, List<FisaMedicala> listFisa, List<Programare> listProgramare) {
        super(nume, prenume, CNP, telefon, adresa, email);
        this.rol = rol;
        this.datePersonale = datePersonale;
        this.username = username;
        this.password = password;
        this.listFisa = listFisa;
        this.listProgramare = listProgramare;
    }

}
