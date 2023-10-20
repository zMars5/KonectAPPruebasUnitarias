package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {
    Utilidad utilidad = new Utilidad();
    public ValidacionAfiliado() {
    }
    public Boolean validarId(Integer id) throws Exception{
        if(id<0){
            throw new Exception("El id no puede ser negativo");
        }
        //PASE TODAS LAS VALIDACIONES
        return true;
    }
    public Boolean validarNombres(String nombre) throws Exception {
        if (nombre.length() < 3 || nombre.length() > 40) {
            throw new Exception("El nombre debe tener entre 3 y 40 caracteres");
        }

        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombre);

        if (!coincidencia.matches()) {
            throw new Exception("El nombre no cumple con el formato requerido");
        }

        return true;
    }
    public Boolean validarApellidos(String apellido) throws Exception {
        if (apellido.length() < 10 || apellido.length() > 50) {
            throw new Exception("El apellido debe tener entre 10 y 50 caracteres");
        }

        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(apellido);

        if (!coincidencia.matches()) {
            throw new Exception("El apellido no cumple con el formato requerido");
        }

        return true;
    }
    public Boolean validarDocumentos(String documento) throws Exception {
        if (documento.length() < 7 || documento.length() > 10) {
            throw new Exception("El documento debe tener entre 7 y 10 caracteres numéricos");
        }

        String expresionRegular = "^[0-9]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(documento);

        if (!coincidencia.matches()) {
            throw new Exception("El documento no cumple con el formato requerido");
        }

        return true;
    }
    public Boolean validarCiudades(Integer ciudad) throws Exception {
        if (ciudad < 1123 && ciudad != 1123) {
            return true;
        } else {
            throw new Exception("la ciudad no es valida");
        }
    }

    public Boolean validarDepartamentos(Integer departamento) throws Exception {
        if (departamento < 32) {
            return true;
        } else {
            throw new Exception("el departamento no es valido");
        }
    }

    public Boolean validarCorreos(String correo) throws Exception {
        String expresiónRegular = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern patron = Pattern.compile(expresiónRegular);
        Matcher coincidencia = patron.matcher(correo);

        if (!coincidencia.matches()) {
            throw new Exception("El correo no cumple con el formato requerido");
        }

        return true;
    }

    public Boolean validarTelefono(String telefono) throws Exception {
        String expresionRegular = "^[0-9]{10}$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(telefono);

        if (!coincidencia.matches()) {
            throw new Exception("El teléfono no cumple con el formato requerido");
        }

        return true;
    }
}


