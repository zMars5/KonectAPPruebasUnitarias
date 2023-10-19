package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionAfiliadoTest {

    //Para ejecutar una prueba
    //debo instanciar un objeto de la clase que voy a probar
     private ValidacionAfiliado validacionAfiliado;
    @BeforeEach //establecer condiciones iniciales de c/u
    public void prepararPruebas(){
        this.validacionAfiliado = new ValidacionAfiliado();
    }

    @Test
    public void validarIdCorrecto(){
        Integer idPrueba = 50;
        Boolean resultado = Assertions.assertDoesNotThrow(()-> this.validacionAfiliado.validarId(idPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarIdIncorrecto(){
        Integer idPrueba = -50;
        Exception resultado = Assertions.assertThrows(Exception.class,()-> this.validacionAfiliado.validarId(idPrueba));
        Assertions.assertEquals("El id no puede ser negativo", resultado.getMessage());
    }
}