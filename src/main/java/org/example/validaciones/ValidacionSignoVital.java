package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionSignoVital {
    Utilidad utilidad = new Utilidad();
    public ValidacionSignoVital() {
    }
    public Boolean validarId(Integer id) throws Exception {
        if (id < 0) {
            throw new Exception("el id no puede ser negativo");
        }
        return true;
    }

    public Boolean validarNombres(String nombre) throws Exception {
        if (nombre.length() < 10 || nombre.length() >= 100) {
            throw new Exception("El nombre debe tener entre 10 y 99 caracteres");
        }
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombre);
        if (coincidencia.matches()) {
            System.out.println("tenemos coincidencia, cumple");
            return true;
        } else {
            System.out.println("no tenemos coincidencia");
            return false;
        }
    }

    public Boolean validarUnidadMedida(Integer unidadMedida) throws Exception {
        if (unidadMedida <= 0) {
            throw new Exception("la unidad de medida debe ser un número entero positivo");
        }
        return true;
    }
}

