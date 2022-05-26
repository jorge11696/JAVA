package ADO;

import Exceptions.*;
import MisListas.MiLibreria;
import java.util.Date;

public class Musica extends Articulo {

    //ATRIBUTOS DE CLASE
    private static float suplemento = 2;
    private static int numCod = 0;
    //ATRIBUTOS MIEMBRO
    private int nPistas;
    private float duracion;
    private String tipo; // cd o vinilo
    //CONSTRUCTOR

    public Musica(int nPistas, float duracion, String tipo, String nombre, Date fecha, 
            int anyo, String resumen, String autor, boolean deteriorado) throws ExNegativo, ExTipo,ExIntervalo, ExVacio {
        super(nombre, fecha, anyo, resumen, autor, deteriorado);
        if (MiLibreria.checkNegativo(nPistas)) {
            this.nPistas = nPistas;
        }
        if (MiLibreria.checkNegativof(duracion)) {
            this.duracion = duracion;
        }
        if (MiLibreria.checkCd(tipo)) {
            this.tipo = tipo;
        }
    }
    //CONSTRUCTOR

    public Musica(int nPistas, float duracion, String tipo,int cod, String nombre, Date fecha, 
            int anyo, String resumen, String autor, boolean deteriorado) throws ExNegativo, ExTipo,ExIntervalo, ExVacio {
        super(cod,nombre, fecha, anyo, resumen, autor, deteriorado);
        if (MiLibreria.checkNegativo(nPistas)) {
            this.nPistas = nPistas;
        }
        if (MiLibreria.checkNegativof(duracion)) {
            this.duracion = duracion;
        }
        if (MiLibreria.checkCd(tipo)) {
            this.tipo = tipo;
        }
    }

    //Getters y Setters:
    public static float getSuplemento() {
        return suplemento;
    }

    public int getnPistas() {
        return nPistas;
    }

    public void setnPistas(int nPistas) throws ExNegativo {
        if (MiLibreria.checkNegativo(nPistas)) {
            this.nPistas = nPistas;
        }
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) throws ExNegativo {
        if (MiLibreria.checkNegativof(duracion)) {
            this.duracion = duracion;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws ExTipo {
        if (MiLibreria.checkCd(tipo)) {
            this.tipo = tipo;
        }
    }

    //METODOS
    @Override
    public String info() {
        String resp = null;
        resp = "Codigo Articulo Musical: " + this.getCodArt() + "\n"
                + "Nombre=" + getNombre() + "\n"
                + "Año Publicación:" + getAnyo() + "\n"
                + "Resumen: " + getResumen() + "\n"
                + "Fecha de Alta: " +getFecha()+"\n"
                + "¿Esta Deteriorado? : " + isDeteriorado() + "\n"
                + "Numero Pistas : " + getnPistas() + "\n"
                + "Duración: " + getDuracion() + "\n"
                + "Tipo :" + getTipo() +"\n"
                + "\n" + "AUTOR \n"
                + "------------------------------------------------------------ \n"
                + "Codigo de Autor: "+getAutor();
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;
        precio = getSuplemento() + (getPreciobase() * dias);
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp = false;
        if (!c.isEmpty()) {
            getComentarios().add(c);
            resp = true;
        }
        return resp;
    }

}
