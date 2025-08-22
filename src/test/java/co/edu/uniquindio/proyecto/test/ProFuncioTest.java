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
        // Obtener las entidades relacionadas
        ParTipdoc tipdoc = parTipdocRepo.findById(1).orElseThrow();
        ParGenero genero = parGeneroRepo.findById(1).orElseThrow();
        ParPaises paises = parPaisesRepo.findById(1).orElseThrow();
        ParDepart depart= parDepartRepo.findById(1).orElseThrow();
        ParMunici munici = parMuniciRepo.findById(1).orElseThrow();

        // Crear el funcionario
        ProFuncio funcio = new ProFuncio();
        funcio.setId_funcio(1094902908);
        funcio.setTipdoc(tipdoc);
        funcio.setGenero(genero);
        funcio.setNm_funci1("Juan");
        funcio.setNm_funci2("Sebastian");
        funcio.setAp_funci1("Salazar");
        funcio.setAp_funci2("Osorio");
        funcio.setId_paises(paises); // Nombre corregido
        funcio.setId_depart(depart); // Nombre corregido
        funcio.setId_munici(munici); // Nombre corregido
        funcio.setNo_funcio("3174250936");
        funcio.setCe_funcio("jssalazar@uniquindio.edu.co");

        // Guardar
        ProFuncio creado = proFuncioRepo.saveAndFlush(funcio);

        // Verificar
        assertNotNull(creado.getId_funcio());
        assertEquals(1094902908, creado.getId_funcio());
        assertTrue(proFuncioRepo.existsById(1094902908));

        System.out.println("✓ Funcionario registrado exitosamente con ID: " + creado.getId_funcio());
    }

    @Test
    public void actualizarTest() {
        registrarTest();

        ProFuncio funcio = proFuncioRepo.findById(1094902908).orElseThrow();
        String nuevoEmail = "nuevo.email@email.com";
        funcio.setCe_funcio(nuevoEmail);
        proFuncioRepo.saveAndFlush(funcio);

        ProFuncio actualizado = proFuncioRepo.findById(funcio.getId_funcio()).orElseThrow();
        assertEquals(nuevoEmail, actualizado.getCe_funcio());

        System.out.println("✓ Email actualizado correctamente a: " + actualizado.getCe_funcio());
    }

    @Test
    public void listarTodosTest() {
        registrarTest();

        var lista = proFuncioRepo.findAll();

        System.out.println("=== LISTADO DE FUNCIONARIOS ===");
        lista.forEach(f -> System.out.println(
                "ID: " + f.getId_funcio() +
                        " - " + f.getNm_funci1() + " " + f.getAp_funci1() +
                        " - " + f.getCe_funcio()
        ));

        assertFalse(lista.isEmpty());
        System.out.println("✓ Se encontraron " + lista.size() + " funcionarios en la base de datos");
    }

    @Test
    public void eliminarTest() {
        registrarTest();

        assertTrue(proFuncioRepo.existsById(1094902908));

        ProFuncio funcio = proFuncioRepo.findById(1094902908).orElseThrow();
        proFuncioRepo.delete(funcio);
        proFuncioRepo.flush();

        ProFuncio eliminado = proFuncioRepo.findById(funcio.getId_funcio()).orElse(null);
        assertNull(eliminado);
        assertFalse(proFuncioRepo.existsById(1094902908));

        System.out.println("✓ Funcionario eliminado correctamente");
    }
}