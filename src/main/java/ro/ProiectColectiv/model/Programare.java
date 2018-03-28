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
    private String data;

    @Column
    private String cabinet;

    public Programare(String ora, String data, String cabinet)
    {
        this.ora = ora;
        this.data=data;
        this.cabinet=cabinet;
    }
}
