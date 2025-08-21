package co.edu.uniquindio.proyecto.repositorios;
import co.edu.uniquindio.proyecto.modelo.entidades.ParDepart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParDepartRepo extends JpaRepository<ParDepart, Integer> {
}