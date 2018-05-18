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
    private String idDoctor;

    @Column
    private String status;

    @Column
    private String idPacient;

    public Programare(String ora, String date,  String idDoctor, String idPacient, String status)
    {
        this.ora = ora;
        this.date=date;
        this.status="0";
        this.idDoctor = idDoctor;
        this.idPacient =idPacient;
    }
}
