package ADO;

import Exceptions.*;
import MisListas.MiLibreria;
import java.util.Date;

public class VideoJuego extends Articulo {
    //ATRIBUTOS DE CLASE
    private static float suplemento = 5f;
    private static int numCod = 0;
    //ATRIBUTOS MIEMBRO
    private int edadRecomendada;
    private String plataforma; // PS2, PS3, PS4, XBOX, PC,...
    private String categoria;  //Acción, Deportivo, Estrategia, Simulación,...
    private boolean formatoFisico;

    //CONSTRUCTOR
    public VideoJuego(int edadRecomendada, String plataforma, String categoria, 
            boolean formatoFisico, String nombre, Date fecha, int anyo, String resumen, 
            String autor, boolean deteriorado) throws ExNegativo, ExTipo,ExIntervalo, ExVacio {
        super(nombre, fecha, anyo, resumen, autor, deteriorado);
        if (MiLibreria.checkNegativo(edadRecomendada)){
        this.edadRecomendada = edadRecomendada;
        }
        if (MiLibreria.checkPlataforma(plataforma)){
        this.plataforma = plataforma;
        }
        if (MiLibreria.checkCategoria(categoria)){
        this.categoria = categoria;
        }
        this.formatoFisico = formatoFisico;
    }
    //CONSTRUCTOR
    public VideoJuego(int edadRecomendada, String plataforma, String categoria, 
            boolean formatoFisico,int cod, String nombre, Date fecha, int anyo, String resumen, 
            String autor, boolean deteriorado) throws ExNegativo, ExTipo,ExIntervalo, ExVacio {
        super(cod,nombre, fecha, anyo, resumen, autor, deteriorado);
        if (MiLibreria.checkNegativo(edadRecomendada)){
        this.edadRecomendada = edadRecomendada;
        }
        if (MiLibreria.checkPlataforma(plataforma)){
        this.plataforma = plataforma;
        }
        if (MiLibreria.checkCategoria(categoria)){
        this.categoria = categoria;
        }
        this.formatoFisico = formatoFisico;
    }

    //GET Y SET
    public static float getSuplemento() {
        return suplemento;
    }
    
    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) throws ExNegativo {
        if (MiLibreria.checkNegativo(edadRecomendada)){
        this.edadRecomendada = edadRecomendada;
        }
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) throws ExTipo {
        if (MiLibreria.checkPlataforma(plataforma)){
        this.plataforma = plataforma;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws ExTipo {
        if (MiLibreria.checkCategoria(categoria)){
        this.categoria = categoria;
        }
    }

    public boolean isFormatoFisico() {
        return formatoFisico;
    }

    public void setFormatoFisico(boolean formatoFisico) {
        this.formatoFisico = formatoFisico;
    }

    //METODOS
    @Override
    public String info() {
        String resp = null;
        resp = "Codigo Articulo Musical:" + this.getCodArt() + "\n"
                + "Nombre=" + getNombre() + "\n"
                + "Año Publicación:" + getAnyo() + "\n"
                + "Resumen: " + getResumen() + "\n"  
                + "Fecha de Alta: " +getFecha()+"\n"
                + "¿Esta Deteriorado? : " + isDeteriorado() + "\n"
                + "Edad Recomendada : +" + getEdadRecomendada() + "\n"
                + "Plataforma: " + getPlataforma() + ", Categoria :" + getCategoria() + "\n"
                + "¿FormatoFisico? " + isFormatoFisico()+ "\n"
                + "\n" + "AUTOR \n"
                + "------------------------------------------------------------ \n"
                + "Codigo Autor: "+getAutor();
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;
        precio = getSuplemento() + getPreciobase() * dias;
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
