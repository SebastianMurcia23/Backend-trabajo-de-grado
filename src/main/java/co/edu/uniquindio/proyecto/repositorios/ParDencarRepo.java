package co.edu.uniquindio.proyecto.repositorios;
import co.edu.uniquindio.proyecto.modelo.entidades.ParDencar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParDencarRepo extends JpaRepository<ParDencar, Integer> {
}