/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.KillJoy.operacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernanda Barrón
 */
public class Curp {

    // Creamos un método obtenerCurp con los parámetros de los datos del usuario, que devuelven un valor de tipo String.
    public String obtenerCurp(String primerNombre, String apellidoPaterno, String apellidoMaterno, String entidadFederativa, String numeroAnio, String numeroDia, String numeroMes, String genero) {
        
        // Invocamos un método en apellidoPaterno para guardar los datos y convertirlos en mayúsculas.
        String apellidoPaternoDato = apellidoPaterno.toUpperCase();
        
        // Creamos un arreglo que separa por dígitos la variable apellidoPaternoDato y toma la primera posición.
        char[] apellidoPaternoChar = apellidoPaternoDato.toCharArray();
        char apellidoPaternoDigito = apellidoPaternoChar[0];
        
        // Creamos la variable cadena que invoca un método substring, toma la primeras dos posiciones del arreglo.
        String cadena = apellidoPaternoDato.substring(0, 1);
        
        // Declaración e inicialización de una variable booleana llamada 'vocal' con el valor 'false'.
        boolean vocal = false;
        
        // Inicia un bucle 'for' que recorre cada carácter en la cadena 'apellidoPaternoDato'.
        for (int i = 0; i < apellidoPaternoDato.length() & !vocal; i++) {
        // Verifica si el carácter en la posición 'i' es una vocal.
            if ((apellidoPaternoDato.charAt(i) == 'A')
                    || (apellidoPaternoDato.charAt(i) == 'E')
                    || (apellidoPaternoDato.charAt(i) == 'I')
                    || (apellidoPaternoDato.charAt(i) == 'O')
                    || (apellidoPaternoDato.charAt(i) == 'U')) {
                // Si se encuentra una vocal, se agrega ese carácter a la variable 'cadena'.
                cadena = cadena + apellidoPaternoDato.charAt(i);
                // Establece 'vocal' en 'true' para detener la búsqueda de más vocales.
                vocal = true;
            }
        }
       // Toma un apellido materno, lo convierte a mayúsculas y lo combina con un apellido paterno. 
       // Luego, verifica cuántos apellidos hay en total. Si hay solo un apellido, asigna "X" a apellidoMaternoDigito. 
       // Si hay más de un apellido, toma el primer carácter del apellido materno y lo asigna a apellidoMaternoDigito. 
       // apellidoMaternoDigito contendrá el primer carácter del apellido materno si hay más de un apellido, o "X" si solo hay un apellido.
        String apellidoMaternoDato = apellidoMaterno.toUpperCase();

        String apellidosJuntos = apellidoPaternoDato + " " + apellidoMaternoDato;

        String[] apellidosSeparados = apellidosJuntos.split(" ");

        int numeroApellidos = apellidosSeparados.length;

        String numeroApellidosString = String.valueOf(numeroApellidos);

        String apellidoMaternoDigito;

        if (numeroApellidos <= 1) {

            apellidoMaternoDigito = "X";
        } else {

            char[] apellidoMaternoChar = apellidoMaternoDato.toCharArray();
            char apellidoMaternoDigitoChar2 = apellidoMaternoChar[0];
            apellidoMaternoDigito = String.valueOf(apellidoMaternoDigitoChar2);
        }

        // Se convierte la oración en mayúsculas.
        String nombreDato = primerNombre.toUpperCase();

        // Creamos otro arreglo que separa por dígitos el nombre de la variable y toma su primer cáracter.
        char[] nombreChar = nombreDato.toCharArray();
        char nombreDigito = nombreChar[0];
        
        // Creamos la variable nombreDatoSi que invoca un método substring, toma la primeras dos posiciones del arreglo.
        String nombreDatoSi = nombreDato.substring(0, 1);

        // Creamos un arreglo tipo char que obtiene los últimos dos dígitos.
        char[] numeroAnio1 = numeroAnio.toCharArray();
        char numeroAnioDigito2 = numeroAnio1[2];
        char numeroAnioDigito3 = numeroAnio1[3];
        
        // Juntamos los dos dígitos del año.
        String anioCompleto = numeroAnioDigito2 + "" + numeroAnioDigito3 + "";

        // Creamos un arreglo que separa por dígitos la variable generoSeleccionado y toma la primera posición.
        String generoSeleccionado = genero;

        char[] letraGenero1 = generoSeleccionado.toCharArray();
        char generoSeleccionado1 = letraGenero1[0];

        // Compara el valor de la variable entidadFederativa con la lista de estados y se asigna la clave correspondiente a la variable clave.
        String clave = "";

        if ("Aguascalientes".equals(entidadFederativa)) {
            clave = "AS";
        } else if ("Baja California".equals(entidadFederativa)) {
            clave = "BC";
        } else if ("Baja California Sur".equals(entidadFederativa)) {
            clave = "BS";
        } else if ("Campeche".equals(entidadFederativa)) {
            clave = "CC";
        } else if ("Coahuila de Zaragoza".equals(entidadFederativa)) {
            clave = "CL";
        } else if ("Colima".equals(entidadFederativa)) {
            clave = "CM";
        } else if ("Chiapas".equals(entidadFederativa)) {
            clave = "CS";
        } else if ("Chihuahua".equals(entidadFederativa)) {
            clave = "CH";
        } else if ("Distrito Federal".equals(entidadFederativa)) {
            clave = "DF";
        } else if ("Durango".equals(entidadFederativa)) {
            clave = "DG";
        } else if ("Guanajuato".equals(entidadFederativa)) {
            clave = "GT";
        } else if ("Guerrero".equals(entidadFederativa)) {
            clave = "GR";
        } else if ("Hidalgo".equals(entidadFederativa)) {
            clave = "HG";
        } else if ("Jalisco".equals(entidadFederativa)) {
            clave = "JC";
        } else if ("México".equals(entidadFederativa)) {
            clave = "MC";
        } else if ("Michoacán de Ocampo".equals(entidadFederativa)) {
            clave = "MN";
        } else if ("Morelos".equals(entidadFederativa)) {
            clave = "MS";
        } else if ("Nayarit".equals(entidadFederativa)) {
            clave = "NT";
        } else if ("Nuevo León".equals(entidadFederativa)) {
            clave = "NL";
        } else if ("Oaxaca".equals(entidadFederativa)) {
            clave = "OC";
        } else if ("Puebla".equals(entidadFederativa)) {
            clave = "PL";
        } else if ("Querétaro".equals(entidadFederativa)) {
            clave = "QT";
        } else if ("Quintana Roo".equals(entidadFederativa)) {
            clave = "QR";
        } else if ("San Luis Potosí".equals(entidadFederativa)) {
            clave = "SP";
        } else if ("Sinaloa".equals(entidadFederativa)) {
            clave = "SL";
        } else if ("Sonora".equals(entidadFederativa)) {
            clave = "SR";
        } else if ("Tabasco".equals(entidadFederativa)) {
            clave = "TC";
        } else if ("Tamaulipas".equals(entidadFederativa)) {
            clave = "TS";
        } else if ("Tlaxcala".equals(entidadFederativa)) {
            clave = "TL";
        } else if ("Veracruz de Ignacio de la Llave".equals(entidadFederativa)) {
            clave = "VZ";
        } else if ("Yucatán".equals(entidadFederativa)) {
            clave = "YN";
        } else if ("Zacatecas".equals(entidadFederativa)) {
            clave = "ZS";
        } else if ("Nacido en el Extranjero".equals(entidadFederativa)) {
            clave = "NE";
        } else {
            JOptionPane.showMessageDialog(null, "Te falto llenar la nacionalidad", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Creamos un arreglo que separa por dígitos la variable apellidoPaternoConsonante y toma la primera posición.
        int n = 1;

        String apellidoPaternoConsonante = apellidoPaternoDato.substring(n).replace("Á", "").replace("É", "").replace("Í", "").replace("Ó", "").replace("Ú", "").replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "");
        char[] apellidoPaternoConsonanteChar = apellidoPaternoConsonante.toCharArray();
        char apellidoPaternoConsonanteDato = apellidoPaternoConsonanteChar[0];

        //Sacar Primera consonante interna (no inicial) del segundo apellido. En caso de no tener segundo apellido, se colocará X.
        String apellidoMaternoConsonante = apellidoMaternoDato.substring(n).replace("A", "")
                .replace("E", "")
                .replace("I", "")
                .replace("O", "")
                .replace("U", "")
                .replace("Á", "")
                .replace("É", "")
                .replace("Í", "")
                .replace("Ó", "")
                .replace("Ú", "");
        String apellidoMaternoConsonanteDato = "";
        if (numeroApellidos <= 1) {
            apellidoMaternoConsonanteDato = "X";
            System.out.print(apellidoMaternoConsonanteDato);
        } else {
            char[] apellidoMaternoConsonanteChar = apellidoMaternoConsonante.toCharArray();
            char apellidoMaternoConsonanteDato1 = apellidoMaternoConsonanteChar[0];
            apellidoMaternoConsonanteDato = String.valueOf(apellidoMaternoConsonanteDato1);
        }
        
        String nombreConsonante = nombreDato.substring(n).replace("Á", "")
                .replace("É", "")
                .replace("Í", "")
                .replace("Ó", "")
                .replace("Ú", "")
                .replace("A", "")
                .replace("E", "")
                .replace("I", "")
                .replace("O", "")
                .replace("U", "");
        char[] nombreConsonanteChar = nombreConsonante.toCharArray();
        char nombreConsonanteDato = nombreConsonanteChar[0];

        //si es mayor a 2000 "A" y si es menor "0"
        int anio = Integer.parseInt(numeroAnio);
        String anioDato = "";
        if (anio <= 1999) {

            anioDato = "0";
        } else {

            anioDato = "A";

        }
        // 1
        String uno = "1";

        return (cadena + apellidoMaternoDigito + "" + nombreDatoSi + "" + anioCompleto + numeroMes + numeroDia + generoSeleccionado1 + "" + clave + "" + apellidoPaternoConsonanteDato + "" + apellidoMaternoConsonanteDato + "" + nombreConsonanteDato + anioDato + uno);

    }

}
