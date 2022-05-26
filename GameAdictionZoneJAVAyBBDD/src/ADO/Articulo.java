package ADO;

import Exceptions.*;
import MisListas.MiLibreria;
import java.util.*;
import java.io.Serializable;

public abstract class Articulo implements Serializable {

    // atributos de clase
    private static float preciobase = 1;
    // atributos miembro
    private int codArt;
    private String nombre;
    private Date fecha;
    private int anyo;
    private String resumen;
    private String autor;
    private boolean deteriorado;
    private ArrayList<String> comentarios = new ArrayList();

    //CONSTRUCTOR
    public Articulo(String nombre, Date fecha, int anyo,
            String resumen, String autor, boolean deteriorado) throws ExIntervalo, ExVacio {
        
        if (MiLibreria.checkVacio(nombre)){
        this.nombre = nombre;
        }
        this.fecha = fecha;
        if (MiLibreria.checkIntervalo(2000, 2050, anyo)){
        this.anyo = anyo;
        }
        if (MiLibreria.checkVacio(resumen)){
        this.resumen = resumen;
        }
        this.autor = autor;
        this.deteriorado = deteriorado;
    }

    //CONSTRUCTOR
    public Articulo(int cod, String nombre, Date fecha, int anyo,
            String resumen, String autor, boolean deteriorado) throws ExIntervalo, ExVacio {
        this.codArt = cod;
        if (MiLibreria.checkVacio(nombre)){
        this.nombre = nombre;
        }
        this.fecha = fecha;
        if (MiLibreria.checkIntervalo(2000, 2050, anyo)){
        this.anyo = anyo;
        }
        if (MiLibreria.checkVacio(resumen)){
        this.resumen = resumen;
        }
        this.autor = autor;
        this.deteriorado = deteriorado;
    }
    
    
    //GET Y SET
    
    public static float getPreciobase() {
        return preciobase;
    }

    public int getCodArt() {
        return codArt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExVacio {
        if (MiLibreria.checkVacio(nombre)){
        this.nombre = nombre;
        }
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) throws ExIntervalo {
        if (MiLibreria.checkIntervalo(2000, 2050, anyo)){
        this.anyo = anyo;
        }
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) throws ExVacio {
        if (MiLibreria.checkVacio(resumen)){
        this.resumen = resumen;
        }
    }

    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDeteriorado() {
        return deteriorado;
    }

    public void setDeteriorado(boolean deteriorado) {
        this.deteriorado = deteriorado;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }
   

    public abstract String info();

    public abstract float precioAlquilerArticulo(int dias);

    public abstract boolean guardaComentario(String c);

    

    

}
