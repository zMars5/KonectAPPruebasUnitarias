package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {

    public Boolean buscarCoincidencia(String expesionRegular, String cadenaTexto){
        Pattern patron = Pattern.compile((expesionRegular));
        Matcher coincidencia = patron.matcher(cadenaTexto);
        if (coincidencia.matches()){
            return true;
        } else {
            return false;
        }
    }
}
