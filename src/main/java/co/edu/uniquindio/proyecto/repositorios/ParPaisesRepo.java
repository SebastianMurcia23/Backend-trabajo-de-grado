package co.edu.uniquindio.proyecto.repositorios;
import co.edu.uniquindio.proyecto.modelo.entidades.ParPaises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParPaisesRepo extends JpaRepository<ParPaises, Integer> {
}