package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionExamenGeneral {
    Utilidad utilidad = new Utilidad();

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
        String expresiónRegular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+$";
        Pattern patrón = Pattern.compile(expresiónRegular);
        Matcher coincidencia = patrón.matcher(nombre);
        if (coincidencia.matches()) {
            System.out.println("Tenemos coincidencia, cumple");
            return true;
        } else {
            System.out.println("No tenemos coincidencia");
            return false;
        }
    }


    public Boolean validarImagenExamen(String imagenExamen) {
        if (imagenExamen.length() > 200) {
            return false;
        } else {
            return true;
        }
    }
}

