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

    @Test
    public void validarNombresCorrecto() throws Exception {
        String nombrePrueba = "Juan Perez";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarNombres(nombrePrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarNombresIncorrectoLongitud() {
        String nombrePrueba = "Jo"; // Nombre con longitud incorrecta
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarNombres(nombrePrueba));
        Assertions.assertEquals("El nombre debe tener entre 3 y 40 caracteres", resultado.getMessage());
    }

    @Test
    public void validarNombresIncorrectoFormato() {
        String nombrePrueba = "Nombre123"; // Nombre con caracteres no permitidos
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarNombres(nombrePrueba));
        Assertions.assertEquals("El nombre no cumple con el formato requerido", resultado.getMessage());
    }

    @Test
    public void validarApellidosCorrecto() throws Exception {
        String apellidoPrueba = "Gomez Gutierrez";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarApellidos(apellidoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarApellidosIncorrectoLongitud() {
        String apellidoPrueba = "Apellido"; // Apellido con longitud incorrecta
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarApellidos(apellidoPrueba));
        Assertions.assertEquals("El apellido debe tener entre 10 y 50 caracteres", resultado.getMessage());
    }

    @Test
    public void validarApellidosIncorrectoFormato() {
        String apellidoPrueba = "Apellido123"; // Apellido con caracteres no permitidos
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarApellidos(apellidoPrueba));
        Assertions.assertEquals("El apellido no cumple con el formato requerido", resultado.getMessage());
    }

    @Test
    public void validarDocumentosCorrecto() throws Exception {
        String documentoPrueba = "1234567";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarDocumentos(documentoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarDocumentosIncorrectoLongitud() {
        String documentoPrueba = "123"; // Documento con longitud incorrecta
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDocumentos(documentoPrueba));
        Assertions.assertEquals("El documento debe tener entre 7 y 10 caracteres numéricos", resultado.getMessage());
    }

    @Test
    public void validarDocumentosIncorrectoFormato() {
        String documentoPrueba = "Documento#"; // Documento con caracteres no permitidos
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDocumentos(documentoPrueba));
        Assertions.assertEquals("El documento no cumple con el formato requerido", resultado.getMessage());
    }

    @Test
    public void validarCiudadesCorrecto() throws Exception {
        Integer ciudadPrueba = 1122;
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarCiudades(ciudadPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarCiudadesIncorrecto() {
        Integer ciudadPrueba = 1123; // Ciudad no válida
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarCiudades(ciudadPrueba));
        Assertions.assertEquals("la ciudad no es valida", resultado.getMessage());
    }

    @Test
    public void validarDepartamentosCorrecto() throws Exception {
        Integer departamentoPrueba = 31;
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarDepartamentos(departamentoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarDepartamentosIncorrecto() {
        Integer departamentoPrueba = 32; // Departamento no válido
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDepartamentos(departamentoPrueba));
        Assertions.assertEquals("el departamento no es valido", resultado.getMessage());
    }

    @Test
    public void validarCorreosCorrecto() throws Exception {
        String correoPrueba = "correo@example.com";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarCorreos(correoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarCorreosIncorrecto() {
        String correoPrueba = "correo.com"; // Correo con formato incorrecto
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarCorreos(correoPrueba));
        Assertions.assertEquals("El correo no cumple con el formato requerido", resultado.getMessage());
    }

    @Test
    public void validarTelefonoCorrecto() throws Exception {
        String telefonoPrueba = "1234567890";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarTelefono(telefonoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarTelefonoIncorrecto() {
        String telefonoPrueba = "123456789"; // Teléfono con formato incorrecto
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarTelefono(telefonoPrueba));
        Assertions.assertEquals("El teléfono no cumple con el formato requerido", resultado.getMessage());
    }
}
