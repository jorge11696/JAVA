package ADO;
import Exceptions.*;
import MisListas.MiLibreria;
import java.io.Serializable;

public class Autor implements Serializable{

    // ATRIBUTOS 
    private String nom;
    private String codAut;
    private String Apell;
    private int anyo_nac;
    private int publicaciones;
    //CONSTRUCTOR
    public Autor(String nom, String Apell, int anyo_nac, int publicaciones, String codAut) throws ExVacio, ExIntervalo, ExNegativo, ExTipo {
        if (MiLibreria.checkVacio(nom)){
        this.nom = nom;
        }
        if (MiLibreria.checkVacio(Apell)){
        this.Apell = Apell;
        }
        if (MiLibreria.checkIntervalo(0,2050, anyo_nac)){
        this.anyo_nac = anyo_nac;
        }
        if (MiLibreria.checkNegativo(publicaciones)){
        this.publicaciones = publicaciones;
        }
        if (MiLibreria.checkCodAutor(codAut)){
        this.codAut = codAut;
        }
    }
    //GET Y SET
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws ExVacio {
        if(MiLibreria.checkVacio(nom)){
        this.nom = nom;
        }
    }

    public String getApell() {
        return Apell;
    }

    public void setApell(String Apell) throws ExVacio {
        if (MiLibreria.checkVacio(Apell)){
        this.Apell = Apell;
        }
    }

    public int getAnyo_nac() {
        return anyo_nac;
    }
    
    public String getCodAut() {
        return codAut;
    }
    public void setCodAut(String codAut) throws ExTipo {
        if (MiLibreria.checkCodAutor(codAut)){
        this.codAut = codAut;
        }
    }
    
    public void setAnyo_nac(int anyo_nac) throws ExIntervalo {
        if (MiLibreria.checkIntervalo(0, 2050, anyo_nac)){
        this.anyo_nac = anyo_nac;
        }
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(int publicaciones) throws ExNegativo {
        if (MiLibreria.checkNegativo(publicaciones)){
        this.publicaciones = publicaciones;
        }
    }
    //METODOS
    
    public String info() {
        String resp = null;
        resp = "Nombre: " + nom +"\n"+ 
               "Apellidos:" + Apell + "\n"+
               "Codigo Autor:" + codAut + "\n"+
               "Anyo de nacimiento: " + anyo_nac +"\n"+ 
               "Publicaciones: " + publicaciones;
        return resp;
    }

}
