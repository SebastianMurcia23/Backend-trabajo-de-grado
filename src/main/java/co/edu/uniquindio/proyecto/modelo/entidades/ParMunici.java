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
@Table(name = "par_munici")
public class ParMunici implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_munici;

    @Column(name="nm_munici", nullable = false, length = 100)
    private String nm_munici;

    @ManyToOne
    @JoinColumn(name = "id_depart", nullable = false)
    private ParDepart id_depart;
}
