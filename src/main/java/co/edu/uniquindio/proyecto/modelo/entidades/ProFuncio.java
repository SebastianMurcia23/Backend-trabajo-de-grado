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
@Table(name = "pro_funcio")
public class ProFuncio implements Serializable {

    @Id
    @Column(name = "id_funcio", nullable = false)
    @EqualsAndHashCode.Include
    private Integer id_funcio;

    @ManyToOne
    @JoinColumn(name = "id_tipdoc", nullable = false)
    private ParTipdoc tipdoc;

    @ManyToOne
    @JoinColumn(name = "id_genero", nullable = false)
    private ParGenero genero;

    @Column(name="nm_funci1", nullable = false, length = 25)
    private String nm_funci1;

    @Column(name="nm_funci2", length = 25)
    private String nm_funci2;

    @Column(name="ap_funci1", nullable = false, length = 25)
    private String ap_funci1;

    @Column(name="ap_funci2", length = 25)
    private String ap_funci2;

    @ManyToOne
    @JoinColumn(name = "id_paises", nullable = false)
    private ParPaises id_paises; // Cambiado de 'pais' a 'id_paises'

    @ManyToOne
    @JoinColumn(name = "id_depart", nullable = false)
    private ParDepart id_depart; // Cambiado de 'departamento' a 'id_depart'

    @ManyToOne
    @JoinColumn(name = "id_munici", nullable = false)
    private ParMunici id_munici; // Cambiado de 'municipio' a 'id_munici'

    @Column(name="no_funcio", length = 10)
    private String no_funcio;

    @Column(name="ce_funcio", nullable = false, length = 100)
    private String ce_funcio;
}