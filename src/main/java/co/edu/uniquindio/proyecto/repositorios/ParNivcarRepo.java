package co.edu.uniquindio.proyecto.repositorios;
import co.edu.uniquindio.proyecto.modelo.entidades.ParNivcar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParNivcarRepo extends JpaRepository<ParNivcar, Integer> {
}