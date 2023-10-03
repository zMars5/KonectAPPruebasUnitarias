package org.example.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {
    public ValidacionAfiliado() {
    }
    public Boolean validarId(Integer id) throws Exception{
        if(id<0){
            throw new Exception("El id no puede ser negativo");
        }
        //PASE TODAS LAS VALIDACIONES
        return true;
    }
    public Boolean validarNombres(String nombre)throws Exception{
        //longitud sea menor 3 o mayor que 40
        if(nombre.length()<3 || nombre.length()>40){
            throw new Exception("el nombre debe tener entre 3 y 40 caracteres");
        }
        //el formato del nombre tiene numeros o caracteres especiales
        String expresionRegular="^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+$";

        //busco la coincidencia entre la expresionregular
        //y mi string
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(nombre);
        if(coincidencia.matches()){
            System.out.println("tenemos coincidencia, cumple");
            return true;

        }else{
            System.out.println("No tenemos coincidencia");
            return false;
        }
        //return true;
    }
    public Boolean validarApellidos(String apellido)throws Exception{
        if (apellido.length()<10 || apellido.length()>50){
            throw new Exception("el apellido debe tener entre 10 y 50 caracteres");
        }
        String expresionRegular="^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ\\s]+$";
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(apellido);
        if (coincidencia.matches()){
            System.out.println("tenemos coincidencia, cumple");
            return true;
        } else {
            System.out.println("no tenemos coincidencia");
            return false;
        }
    }
    public Boolean validadDocumentos(String documento)throws Exception{
        if (documento.length()< 7 || documento.length() > 10) {
            throw new Exception("el documento debe tener entre 7 y 10 caracteres numericos");
        }
        String expresionRegular = "^[a-zA-Z0-9]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(documento);
        if (coincidencia.matches()){
            System.out.println("tenemos coincidencia, cumple");
            return true;
        }else {
            System.out.println("no tenemos coincidencia");
            return false;
        }
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

    public Boolean validarCorreos(String correo)throws Exception{
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(correo);
        if (coincidencia.matches()){
            System.out.println("tenemos coincidencia, cumple");
            return true;
        }else {
            System.out.println("no tenemos coincidencia");
            return false;
        }
    }

    public Boolean validarTelefono(String telefono)throws Exception{
        String expresionRegular = "^[0-9]{10}$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(telefono);
        if (coincidencia.matches()){
            System.out.println("tenemos coincidencia, cumple");
            return true;
        }else {
            System.out.println("no tenemos coincidencia");
            return false;
        }
    }
}


