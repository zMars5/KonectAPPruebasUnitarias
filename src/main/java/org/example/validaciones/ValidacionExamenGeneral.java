package org.example.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionExamenGeneral {
    public ValidacionExamenGeneral() {
    }
    public Boolean validarId(Integer id) throws Exception {
        if (id <= 0) {
            throw new Exception("El ID debe ser un número positivo");
        }
        return true;
    }

    public Boolean validarNombres(String nombre) throws Exception {
        if (nombre.length() < 10 || nombre.length() >= 150) {
            throw new Exception("El nombre debe tener entre 10 y 149 caracteres");
        }
        String expresionRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombre);
        if (coincidencia.matches()) {
            System.out.println("Tenemos coincidencia, cumple");
            return true;
        } else {
            System.out.println("No tenemos coincidencia");
            return false;
        }
    }

    public Boolean validarImagenExamen(String imagenExamen) throws Exception {
        if (imagenExamen.length() > 200) {
            throw new Exception("La longitud máxima de la imagen del examen es de 200 caracteres");
        }
        return true;
    }
}

