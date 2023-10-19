package org.example;

import org.example.validaciones.ValidacionAfiliado;
import org.example.validaciones.ValidacionExamenGeneral;
import org.example.validaciones.ValidacionSignoVital;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        //Validando afiliados
        ValidacionAfiliado validadorA = new ValidacionAfiliado();
        Boolean idValido = validadorA.validarId(1234);
        System.out.println("Id valido: " + idValido);
        Boolean nombreValido = validadorA.validarNombres("Miguel Angel");
        System.out.println("Nombre valido: " + nombreValido);
        Boolean apellidoValido = validadorA.validarApellidos("Rodriguez Soto");
        System.out.println("Apellido valido: " + apellidoValido);
        Boolean documentoValido = validadorA.validarDocumentos("1023803871");
        System.out.println("Documento valido: " + documentoValido);
        Boolean correoValido = validadorA.validarCorreos("rmiguelucho@gmail.com");
        System.out.println("Correo valido: " + correoValido);
        Boolean telefonoValido = validadorA.validarTelefono("3104236712");
        System.out.println("Telefono valido: " + telefonoValido);
        Boolean departamentoValido = validadorA.validarDepartamentos(28);
        System.out.println("Departamento valido: " + departamentoValido);

        //Validando examenes
        ValidacionExamenGeneral validadorE = new ValidacionExamenGeneral();
        Boolean idValidoE = validadorE.validarId(1234);
        System.out.println("Id valido: " + idValidoE);
        Boolean nombreValidoE = validadorE.validarNombres("Examen Prostata");
        System.out.println("Nombre valido: " + nombreValidoE);
        Boolean imagenValidaE = validadorE.validarImagenExamen("https://imgs.search.brave.com/-65SugwV4RB");
        System.out.println("Imagen valida: " + imagenValidaE);

        //Validando signos vitales
        ValidacionSignoVital validadorS = new ValidacionSignoVital();
        Boolean idValidoS = validadorS.validarId(12345);
        System.out.println("Id valido: " + idValidoS);
        Boolean nombreValidoS = validadorS.validarNombres("Presion arterial");
        System.out.println("Nombre valido: " + nombreValidoS);
        Boolean unidadMedidaValidoS = validadorS.validarUnidadMedida(25);
        System.out.println("Unidad medida valida: " + unidadMedidaValidoS);

        ValidacionAfiliado validacionAfiliado = new ValidacionAfiliado();
        validacionAfiliado.trabajarFechas();

        LocalDate fechaSistema = LocalDate.now();
        System.out.println(fechaSistema);

        LocalDate fechaNacimiento = LocalDate.of(2005,5,9);
    }
}