package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "par_Descar")
public class ParDescar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_descar;

    @Column(name="cd_descar", nullable = false, length = 6)
    private Integer cd_descar;

    @Column(name="gr_descar", nullable = false, length = 2)
    private Integer gr_descar;

    @Column(name="ds_descar", nullable = false, length = 50)
    private Integer ds_descar;

    @ManyToOne
    @JoinColumn(name = "id_nivcar", nullable = false)
    private ParNivcar id_nivcar;

    @ManyToOne
    @JoinColumn(name = "id_dencar", nullable = false)
    private ParDencar id_dencar;

    @Column(name = "est_descar", nullable = false)
    private Boolean est_descar;
}
