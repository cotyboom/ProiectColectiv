package ro.ProiectColectiv.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "programare")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode


public class Programare {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String ora;

    @Column
    private String date;

    @Column
    private String cabinet;

    @Column
    private String idDoctor;

    @Column
    private String idPacient;

    public Programare(String ora, String date, String cabinet, String idDoctor, String idPacient)
    {
        this.ora = ora;
        this.date=date;
        this.cabinet=cabinet;
        this.idDoctor = idDoctor;
        this.idPacient =idPacient;
    }
}
