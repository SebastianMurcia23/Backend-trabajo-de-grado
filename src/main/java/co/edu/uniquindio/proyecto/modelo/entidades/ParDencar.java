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
@Table(name = "par_Dencar")
public class ParDencar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_dencar;

    @Column(name="ds_dencar", nullable = false, length = 50)
    private String ds_dencar;

    @Column(name="est_dencar", nullable = false)
    private Boolean est_dencar;

}
