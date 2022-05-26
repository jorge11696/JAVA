package ADO;

import Exceptions.*;
import MisListas.MiLibreria;
import java.util.Date;

public class LibroImpreso extends Libro {

    //ATRIBUTOS
    private static int numCod = 1;
    private boolean formato;//Formato de ebook
    private String tapa;

    //CONSTRUCTOR
    public LibroImpreso(boolean formato, String tapa, int numPaginas, 
            String nombre, Date fecha, int anyo, 
            String resumen, String autor, boolean deteriorado) throws ExTipo,ExIntervalo, ExVacio, ExNegativo {
        super(numPaginas, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.formato = formato;
        if(MiLibreria.checkTapa(tapa)){
        this.tapa = tapa;
        }
    }
    //CONSTRUCTOR
    public LibroImpreso(boolean formato, String tapa, int numPaginas, 
            int cod,String nombre, Date fecha, int anyo, 
            String resumen, String autor, boolean deteriorado) throws ExTipo,ExIntervalo, ExVacio, ExNegativo {
        super(numPaginas,cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.formato = formato;
        if(MiLibreria.checkTapa(tapa)){
        this.tapa = tapa;
        }
    }
    //GET Y SET
    public boolean isFormato() {
        return formato;
    }

    public void setFormato(boolean formato) {
        this.formato = formato;
    }

    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) throws ExTipo {
        if (MiLibreria.checkTapa(tapa)){
        this.tapa = tapa;
        }
    }

    //METODOS
    @Override
    public String info() {
        String resp = null;
        resp= "Codigo LibroImpreso:" +this.getCodArt()+"\n"
              +"Nombre=" +getNombre() +"\n"
              +"Año Publicación:" +getAnyo()+"\n"
              +"Resumen: " +getResumen()+"\n"
              +"Fecha de Alta: " +getFecha()+"\n"
              +"¿Esta Deteriorado? : " + isDeteriorado() +"\n"
              +"Numero Paginas: " + getNumPaginas()+"\n"
              +"¿Tipo Formato es Papel? : " +isFormato()+"\n" 
              +"Tipo de Tapa:" +getTapa()+"\n"
              + "\n" + "AUTOR \n"
              + "------------------------------------------------------------ \n"
              + "Codigo de Autor: " +getAutor();
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;
        precio = getPreciobase()* dias;
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp=false;
        if (!c.isEmpty()){
             getComentarios().add(c);
             resp=true;
        }
        return resp;
    }

}
