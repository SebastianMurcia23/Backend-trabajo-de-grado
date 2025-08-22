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
@Table(name = "par_nivcar")
public class ParNivcar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_nivcar;

    @Column(name="ds_nivcar", nullable = false, length = 50)
    private String ds_nivcar;

    @Column(name="est_nivcar", nullable = false)
    private Boolean est_nivcar;

}
