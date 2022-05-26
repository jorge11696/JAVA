package MisListas;

import Exceptions.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiLibreria {

    //METODO VALIDAR RANGO
    public static boolean checkIntervalo(int min, int max, int opc) throws ExIntervalo {
        boolean resp = true;
        if (opc < min || opc > max) {
            resp = false;
            throw new ExIntervalo("Número fuera de rango!");
        }
        return resp;
    }
    /*
    //METODO VALIDAR STRINGS SIN ESPACIOS EN BLANCO NI NUMEROS
    public static boolean checkNombre(String nombre) throws ExNombre {
        boolean resp = true;
        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.charAt(i);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (nombre.charAt(0) == ' ') {
                resp = false;
                throw new ExNombre("Campo vacío!");
            }
            if (!((c >= 'a' && c <= 'z') || (c == ' ') || (c >= 'A' && c <= 'Z'))) {
                resp = false;
                throw new ExNombre("Campo  solo admite letras");
            }
        }
        if (nombre.equals("")) {
            resp = false;
            throw new ExNombre("Campo vacío");
        }
        return resp;
    }
   */
    //METODO PARA VALIDAR CAMPOS VACIOS
    public static boolean checkVacio(String texto) throws ExVacio {
        boolean resp = true;
        if (texto.isEmpty()) {
            resp = false;
            throw new ExVacio("Campo vacio");
        }
        if (texto.equals(" ")) {
            resp = false;
            throw new ExVacio("Campo vacio");
        }
        return resp;
    }

    //METODO PARA VALIDAR SI O NO 
    public static boolean checkSiNo(String resp) throws ExTipo {
        boolean ok = true;
        if (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no")) {
            ok = false;
            throw new ExTipo("Valores admitidos (SI|NO)");
        }
        return ok;
    }

    //METODO VALIDAR FECHA CORRECTA
    public static boolean checkFecha(String fecha) throws ExFecha {
        boolean resp = true;
        Pattern patron = Pattern.compile("\\d{1,2}-\\d{1,2}-\\d{4}");
        Matcher mat = patron.matcher(fecha);
        if (!mat.matches()) {
            resp = false;
            throw new ExFecha("Fecha Incorrecta! Formato valido: 10-03-2022");
        }
        return resp;
    }

    //METODO PARA VALIDAR ENTEROS NEGATIVOS
    public static boolean checkNegativo(int resp) throws ExNegativo {
        boolean ok = true;
        if (resp < 0) {
            ok = false;
            throw new ExNegativo("El número no puede ser negativo");
        }
        return ok;
    }

    //METODO PARA VALIDAR FLOAT NEGATIVOS
    public static boolean checkNegativof(float resp) throws ExNegativo {
        boolean ok = true;
        if (resp < 0) {
            ok = false;
            throw new ExNegativo("El número no puede ser negativo");
        }
        return ok;
    }

    //METODO PARA VALIDAR DURA O BLANDA
    public static boolean checkTapa(String tapa) throws ExTipo {
        boolean resp = true;
        if (!tapa.equalsIgnoreCase("blanda") && !tapa.equalsIgnoreCase("dura")) {
            resp = false;
            throw new ExTipo("La tapa solo puede ser 'blanda' o 'dura'");
        }
        return resp;
    }
    //METODO PARA VALIDAD CD O VINILO

    public static boolean checkCd(String tipo) throws ExTipo {
        boolean resp = true;
        if (!tipo.equalsIgnoreCase("cd") && !tipo.equalsIgnoreCase("vinilo")) {
            resp = false;
            throw new ExTipo("Solo puede ser CD o vinilo. ");
        }
        return resp;
    }
    //METODO VALIDAR PLATAFORMA

    public static boolean checkPlataforma(String plataforma) throws ExTipo {
        boolean resp = true;
        String[] misplataformas = {"PC", "Play3", "Play4", "Play5", "Xbox"};
        boolean ok = false;
        int i = 0;
        while (i < misplataformas.length && !ok) {
            if (misplataformas[i].equalsIgnoreCase(plataforma)) {
                ok = true;
            }
            i++;
        }
        if (!ok) {
            resp = false;
            throw new ExTipo("La plataforma no es correcta Validos(PC|PLAY3|PLAY4|PLAY5|XBOX");
        }
        return resp;
    }
    //METODO PARA VALIDAR CATEGORIA

    public static boolean checkCategoria(String categoria) throws ExTipo {
        boolean resp = true;
        String[] miscategorias = {"Aventuras", "Bélico", "Puzzle"};
        boolean ok = false;
        int i = 0;
        while (i < miscategorias.length && !ok) {
            if (miscategorias[i].equalsIgnoreCase(categoria)) {
                ok = true;
            }
            i++;
        }
        if (!ok) {
            resp = false;
            throw new ExTipo("La categoria no es correcta! Validos(Aventuras|Belico|Puzzle)");
        }
        return resp;
    }
    //METODO PARA VALIDAR DNI

    public static boolean checkDni(String dni) throws ExDni {
        boolean ok = true;

        char[] letraDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        boolean resp = true;
        String num;
        char letra;
        int indice, resto;
        indice = 0;
        if (dni.length() == 9) {
            num = dni.substring(0, 8);
            while (indice < num.length() && resp) {
                if (Character.isDigit(num.charAt(indice))) {
                    indice++;
                } else {
                    ok = false;
                    throw new ExDni("Los 8 primeros caracteres tienen que ser números");
                }
            }
            if (resp) {
                letra = dni.charAt(8);
                if (Character.isLetter(letra)) {
                    letra = Character.toUpperCase(letra);
                    resto = Integer.parseInt(num) % 23;
                    if (letra != letraDni[resto]) {
                        ok = false;
                        throw new ExDni("La letra no es válida");
                    }
                } else {
                    ok = false;
                    throw new ExDni("El último carácter tiene que ser una letra");
                }
            } else {
                ok = false;
                throw new ExDni("Dni inválido");
            }
        } else {
            ok = false;
            throw new ExDni("Debe introducir 9 caracteres");
        }
        return ok;
    }
    //METODO VALIDACION TELEFONOS

    public static boolean checkTelf(String numero) throws ExTlf {
        boolean ok = true, resp = true;
        if (numero.length() != 9) {
            ok = false;
            throw new ExTlf("El número tiene que tener 9 dígitos");
        } else {
            int i = 0;
            while (i < numero.length() && ok == true) {
                if (Character.isDigit(numero.charAt(i)) == false) {
                    ok = false;
                }
                i++;
            }
        }
        if (!ok) {
            resp = false;
            throw new ExTlf("El teléfono solo puede contener dígitos");
        }
        return resp;
    }

    //METODO PARA FECHA ACTUAL
    public static String fechaHoy() {
        Calendar fechaActual = new GregorianCalendar();
        int año = fechaActual.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        return año + "-" + mes + "-" + dia;
    }
    /*
    public static boolean checkCodArt(String cod) throws ExTipo {
        boolean resp = true;
        Pattern pat = Pattern.compile("[A-Z]{3}[0-9]+");
        Matcher mat = pat.matcher(cod);
        if (!mat.matches()) {
            resp = false;
            throw new ExTipo("Codigo no valido! (MUS0|VID123|LAU12|LIM123");
        }
        return resp;
    }
    */
    public static boolean checkCodAutor(String cod) throws ExTipo {
        boolean resp = true;
        Pattern pat = Pattern.compile("[a-z]{3}[0-9]+");
        Matcher mat = pat.matcher(cod);
        if (!mat.matches()) {
            resp = false;
            throw new ExTipo("Invalido!(aut01|aut1|aut0|aut123");
        }
        return resp;
    }
}
