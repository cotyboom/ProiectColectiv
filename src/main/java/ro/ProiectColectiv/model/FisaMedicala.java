package ro.ProiectColectiv.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "fisamedicala")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class FisaMedicala {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String tratament;

    @Column
    private String diagnostic;

    @Column
    private String observatii;

    @Column
    private String data;

    @Column
    private String idPacient;

    public FisaMedicala(String tratament, String diagnostic, String observatii, String idPacient, String data) {
        this.tratament = tratament;
        this.diagnostic = diagnostic;
        this.observatii = observatii;
        this.idPacient = idPacient;
        this.data = data;
    }

}

