package ro.ProiectColectiv.model;

import lombok.*;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.List;


@Entity
@Table(name = "datePersonale")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DatePersonale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String telefon;

    @Column
    private String email;

    @Column
    private Integer varsta;

    @Column
    private DecimalFormat inaltime;

    @Column
    private DecimalFormat greutate;

    @Column
    private String adresa;

    @Column
    private String telefonContact;

    @OneToOne(targetEntity = Pacient.class, cascade = CascadeType.ALL)
    private List<Pacient> listPacient;

    public DatePersonale(String telefon, String email, Integer varsta, DecimalFormat inaltime, DecimalFormat greutate, String adresa, String telefonContact, List<Pacient> listPacient) {
        this.telefon = telefon;
        this.email = email;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.adresa = adresa;
        this.telefonContact = telefonContact;
        this.listPacient = listPacient;
    }

}


