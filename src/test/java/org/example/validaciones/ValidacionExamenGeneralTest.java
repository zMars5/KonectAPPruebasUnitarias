package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidacionExamenGeneralTest {

    private ValidacionExamenGeneral validacionExamenGeneral;

    @BeforeEach
    public void prepararPruebas() { this.validacionExamenGeneral = new ValidacionExamenGeneral(); }

    @Test
    public void validarIdCorrecto() throws Exception {
        Integer idPrueba = 1;
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionExamenGeneral.validarId(idPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarIdIncorrecto() {
        Integer idPrueba = -1; // ID negativo
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarId(idPrueba));
        Assertions.assertEquals("El ID debe ser un número positivo", resultado.getMessage());
    }

    @Test
    public void validarNombresCorrecto() throws Exception {
        String nombrePrueba = "Juan Perez";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionExamenGeneral.validarNombres(nombrePrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarNombresIncorrectoLongitud() {
        String nombrePrueba = "John"; // Nombre con longitud incorrecta
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarNombres(nombrePrueba));
        Assertions.assertEquals("El nombre debe tener entre 10 y 149 caracteres", resultado.getMessage());
    }

    @Test
    public void validarNombresIncorrectoFormato() {
        String nombrePrueba = "Nombre123"; // Nombre con caracteres no permitidos
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarNombres(nombrePrueba));
        Assertions.assertEquals("El nombre debe tener entre 10 y 149 caracteres", resultado.getMessage());
    }

    @Test
    public void validarNombresIncorrectoFormato2() {
        String nombrePrueba = "Nombre&"; // Nombre con caracteres no permitidos
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarNombres(nombrePrueba));
        Assertions.assertEquals("El nombre debe tener entre 10 y 149 caracteres", resultado.getMessage());
    }

    @Test
    public void validarImagenExamenCorrecto() {
        String imagenExamenPrueba = "imagen.jpg";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionExamenGeneral.validarImagenExamen(imagenExamenPrueba));
        Assertions.assertTrue(resultado);
    }
}

