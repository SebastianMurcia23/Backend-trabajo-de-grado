package co.edu.uniquindio.proyecto.test;
import co.edu.uniquindio.proyecto.modelo.entidades.*;
import co.edu.uniquindio.proyecto.repositorios.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProFuncioTest {

    @Autowired
    private ProFuncioRepo proFuncioRepo;

    @Autowired
    private ParTipdocRepo parTipdocRepo;

    @Autowired
    private ParGeneroRepo parGeneroRepo;

    @Autowired
    private ParPaisesRepo parPaisesRepo;

    @Autowired
    private ParDepartRepo parDepartRepo;

    @Autowired
    private ParMuniciRepo parMuniciRepo;

    @Test
    public void registrarTest() {
        ParTipdoc tipdoc = parTipdocRepo.findById(1).orElseThrow();
        ParGenero genero = parGeneroRepo.findById(1).orElseThrow();
        ParPaises paises = parPaisesRepo.findById(1).orElseThrow();

        ProFuncio funcio = new ProFuncio();
        funcio.setId_funcio(1094902908);
        funcio.setTipdoc(tipdoc);
        funcio.setGenero(genero);
        funcio.setNm_funci1("Juan");
        funcio.setNm_funci2("Sebastian");
        funcio.setAp_funci1("Salazar");
        funcio.setAp_funci2("Osorio");
        funcio.setId_paises(paises);
        funcio.setId_depart(1);     // getter del ID
        funcio.setId_munici(1);
        funcio.setNo_funcio("3174250936");
        funcio.setCe_funcio("jssalazar@uniquindio.edu.co");

        ProFuncio creado = proFuncioRepo.save(funcio);

        assertNotNull(creado.getId_funcio());
    }

    @Test
    public void actualizarTest() {
        ProFuncio funcio = proFuncioRepo.findById(1).orElseThrow();
        funcio.setCe_funcio("nuevo.email@email.com");
        proFuncioRepo.save(funcio);

        ProFuncio actualizado = proFuncioRepo.findById(funcio.getId_funcio()).orElseThrow();
        assertEquals("nuevo.email@email.com", actualizado.getCe_funcio());
    }

    @Test
    public void listarTodosTest() {
        var lista = proFuncioRepo.findAll();
        lista.forEach(System.out::println);

        assertTrue(!lista.isEmpty());
    }

    @Test
    public void eliminarTest() {
        ProFuncio funcio = proFuncioRepo.findById(1).orElseThrow();
        proFuncioRepo.delete(funcio);

        ProFuncio eliminado = proFuncioRepo.findById(funcio.getId_funcio()).orElse(null);
        assertNull(eliminado);
    }
}