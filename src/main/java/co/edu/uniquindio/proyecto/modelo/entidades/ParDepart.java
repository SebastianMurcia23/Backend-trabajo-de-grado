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
@Table(name = "par_depart")
public class ParDepart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_depart;

    @Column(name="nm_depart", nullable = false, length = 25)
    private String nm_depart;

    @ManyToOne
    @JoinColumn(name = "id_paises", nullable = false)
    private ParPaises id_paises;

}
