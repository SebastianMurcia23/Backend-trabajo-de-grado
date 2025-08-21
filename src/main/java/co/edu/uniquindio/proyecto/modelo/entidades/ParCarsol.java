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
@Table(name = "par_carsol")
public class ParCarsol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_carsol;

    @ManyToOne
    @JoinColumn(name = "id_tipsol", nullable = false)
    private ParTipsol id_tipsol;

    @Column(name="ds_carsol", nullable = false, length = 300)
    private String ds_carsol;

    @Column(name="sg_carsol", nullable = false, length = 5)
    private String sg_carsol;

    @Column(name="est_carsol", nullable = false)
    private Boolean est_carsol;

}
