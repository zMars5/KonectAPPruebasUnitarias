package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacionSignoVitalTest {
    private ValidacionSignoVital validacionSignoVital;

    @BeforeEach
    public void prepararPruebas() {
        this.validacionSignoVital = new ValidacionSignoVital();
    }

    @Test
    public void validarIdCorrecto() throws Exception {
        Integer idPrueba = 1;
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarIdIncorrecto() {
        Integer idPrueba = -1; // ID negativo
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertEquals("el id no puede ser negativo", resultado.getMessage());
    }

    @Test
    public void validarNombresCorrecto() throws Exception {
        String nombrePrueba = "Juan Perez";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionSignoVital.validarNombres(nombrePrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarNombresIncorrectoLongitud() {
        String nombrePrueba = "John"; // Nombre con longitud incorrecta
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarNombres(nombrePrueba));
        Assertions.assertEquals("El nombre debe tener entre 10 y 99 caracteres", resultado.getMessage());
    }

    @Test
    public void validarNombresIncorrectoFormato() {
        String nombrePrueba = "Nombre123"; // Nombre con caracteres no permitidos
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarNombres(nombrePrueba));
        Assertions.assertEquals("El nombre debe tener entre 10 y 99 caracteres", resultado.getMessage());
    }

    @Test
    public void validarUnidadMedidaCorrecto() throws Exception {
        Integer unidadMedidaPrueba = 1;
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionSignoVital.validarUnidadMedida(unidadMedidaPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarUnidadMedidaIncorrecto() {
        Integer unidadMedidaPrueba = 0; // Unidad de medida no positiva
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarUnidadMedida(unidadMedidaPrueba));
        Assertions.assertEquals("la unidad de medida debe ser un número entero positivo", resultado.getMessage());
    }
}

