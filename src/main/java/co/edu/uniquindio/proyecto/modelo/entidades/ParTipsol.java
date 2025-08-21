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
@Table(name = "par_tipsol")
public class ParTipsol implements Serializable {

    @Id
    @Column(name="id_tipsol", nullable = false, length = 3)
    private String id_tipsol;

    @Column(name="ds_tipsol", nullable = false, length = 250)
    private String ds_tipsol;

    @Column(name="sg_tipsol", nullable = false, length = 3)
    private String sg_tipsol;

    @Column(name="est_tipsol", nullable = false)
    private Boolean est_tipsol;
}
