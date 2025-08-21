package co.edu.uniquindio.proyecto.repositorios;
import co.edu.uniquindio.proyecto.modelo.entidades.ProFuncio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProFuncioRepo extends JpaRepository<ProFuncio, Integer> {
}