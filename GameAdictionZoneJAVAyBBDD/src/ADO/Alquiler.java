package ADO;

import Exceptions.ExNegativo;
import MisListas.MiLibreria;
import java.util.Date;

public class Alquiler {

    //ATRIBUTOS
    private int codAlq;
    private Articulo a;
    private int dias;
    private Cliente cli;
    private Date fechaAlq;
    //CONSTRUCTOR
    public Alquiler(Articulo a, int dias, Cliente cli, Date fechaAlq) throws ExNegativo {
        this.a = a;
        if (MiLibreria.checkNegativo(dias)){
        this.dias = dias;
        }
        this.cli = cli;
        this.fechaAlq = fechaAlq;
    }
    public Alquiler(int codAlq, Articulo a, int dias, Cliente cli, Date fechaAlq) throws ExNegativo {
        this.codAlq = codAlq;
        this.a = a;
        if (MiLibreria.checkNegativo(dias)){
        this.dias = dias;
        }
        this.cli = cli;
        this.fechaAlq = fechaAlq;
    }
    
    //GETTERS Y SETTERS
    
    public int getCodAlq() {
        return codAlq;
    }
    
    public Date getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }
    
    public Articulo getA() {
        return a;
    }

    public void setA(Articulo a) {
        this.a = a;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) throws ExNegativo {
        if (MiLibreria.checkNegativo(dias)){
        this.dias = dias;
        }
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    //METODOS
    public String muestraInfoAlquiler(){
      String factura;
      factura = "****************************FACTURA*************************** \n"
              +"\n" + "ARTICULO \n"
              +"--------------------------------------------------------------- \n"
              + a.info()+" \n" 
              + "\n"+"CLIENTE \n"
              + "-------------------------------------------------------------- \n"
              + cli.info() +"\n"
              + "\n" + "PRECIO \n"
              + "-------------------------------------------------------------- \n"
              + "IMPORTE TOTAL: " + a.precioAlquilerArticulo(dias) +"€" + " \n"
              + "DIAS: "+dias+ " \n"
              + "FECHA DE ALQUILER: "+fechaAlq+" \n"
              + "CODIGO DE ALQUILER: "+codAlq;
      return factura;
  }

    

    
}
