package ADO;

import Exceptions.*;
import MisListas.MiLibreria;
import java.io.Serializable;

public class Cliente implements Serializable {

    /* Atributos de clase: un int que permita luego asignar un número 
       correlativo al código de socio, impidiendo que se repita.
     */
    private static int num=1;

    // Atributos miembro
    //private final String codSocio; // final porque no va a variar una vez que se asigna a un socio ya no varía
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telf1;
    private String telf2;
    private String telf3;
    private int puntos; // campo propuesto para poder hacer luego operaciones 
    // de fidelización de cliente, el cliente ganaría puntos según unas reglas 
    // por cada alquiler que realice o también podría ser una relación por 
    // cada euro pagado.

    public Cliente(String dni, String nombre, String apellidos,
            String direccion, String telf1, String telf2, String telf3) 
            throws ExDni, ExVacio, ExTlf {
        
        //codSocio = "cod_" + num++;
        if (MiLibreria.checkDni(dni)){
        this.dni = dni;
        }
        if (MiLibreria.checkVacio(nombre)){
        this.nombre = nombre;
        }
        if (MiLibreria.checkVacio(apellidos)){
        this.apellidos = apellidos;
        }
        if (MiLibreria.checkVacio(direccion)){
        this.direccion = direccion;
        }
        if (MiLibreria.checkTelf(telf1)){
        this.telf1 = telf1;
        }
        if (MiLibreria.checkTelf(telf2)){
        this.telf2 = telf2;
        }
        if (MiLibreria.checkTelf(telf3)){
        this.telf3 = telf3;
        }
        puntos = 0;
    }
    //ESTE METODO ES EL QUE UTILIZAREMOS PARA NUESTRA BBDD
    public Cliente(String dni, String nombre, String apellidos,
            String direccion, String telf1, String telf2) 
            throws ExDni, ExVacio, ExTlf {
        
        //codSocio = "cod_" + num++;
        if (MiLibreria.checkDni(dni)){
        this.dni = dni;
        }
        if (MiLibreria.checkVacio(nombre)){
        this.nombre = nombre;
        }
        if (MiLibreria.checkVacio(apellidos)){
        this.apellidos = apellidos;
        }
        if (MiLibreria.checkVacio(direccion)){
        this.direccion = direccion;
        }
        if (MiLibreria.checkTelf(telf1)){
        this.telf1 = telf1;
        }
        if (MiLibreria.checkTelf(telf2)){
        this.telf2 = telf2;
        }
        puntos = 0;
    }

    public Cliente(String dni, String nombre, String apellidos, String direccion, String telf1) throws ExDni,ExVacio, ExTlf {
        //codSocio = "cod_" + num++;
        if (MiLibreria.checkDni(dni)){
        this.dni = dni;
        }
        if (MiLibreria.checkVacio(nombre)){
        this.nombre = nombre;
        }
        if (MiLibreria.checkVacio(apellidos)){
        this.apellidos = apellidos;
        }
        if (MiLibreria.checkVacio(direccion)){
        this.direccion = direccion;
        }
        if (MiLibreria.checkTelf(telf1)){
        this.telf1 = telf1;
        }
        puntos = 0;
    }

    public Cliente(String dni, String nombre, String telf1) throws ExDni, ExVacio, ExTlf {
        //codSocio = "cod_" + num++;
        if (MiLibreria.checkDni(dni)){
        this.dni = dni;
        }
        if (MiLibreria.checkVacio(nombre)){
        this.nombre = nombre;
        }
        if (MiLibreria.checkTelf(telf1)){
        this.telf1 = telf1;
        }
        puntos = 0;
    }

    //GET Y SET
    public static int getNum() {
        return num;
    }
    /*
    public String getCodSocio() {
        return codSocio;
    }
    */
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws ExDni {
        if (MiLibreria.checkDni(dni)){
        this.dni = dni;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExVacio {
        if (MiLibreria.checkVacio(nombre)){
        this.nombre = nombre;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) throws ExVacio {
        if (MiLibreria.checkVacio(apellidos)){
        this.apellidos = apellidos;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws ExVacio {
        if (MiLibreria.checkVacio(direccion)){
        this.direccion = direccion;
        }
    }

    public String getTelf1() {
        return telf1;
    }

    public void setTelf1(String telf1) throws ExTlf {
        if (MiLibreria.checkTelf(telf1)){
        this.telf1 = telf1;
        }
    }

    public String getTelf2() {
        return telf2;
    }

    public void setTelf2(String telf2) throws ExTlf {
        if (MiLibreria.checkTelf(telf2)){
        this.telf2 = telf2;
        }
    }

    public String getTelf3() {
        return telf3;
    }

    public void setTelf3(String telf3) throws ExTlf {
        if (MiLibreria.checkTelf(telf3)){
        this.telf3 = telf3;
        }
    }

    public int getPuntos() {
        return puntos;
    }

    /* Constructores: (nunca piden el codSocio ya que se asigna automáticamente 
    y tampoco se piden los puntos ya que se da de alta al socio con 0 puntos 
    o con una cantidad de puntos asignados como regalo por el alta)
    
    Un constructor que como mínimo pida el DNI y un teléfono.
    
    Y otros constructores de combinación de datos, por ejemplo uno que pida 
    todos los datos, menos los telf 2 y 3.
    
    Otro con todos los campos.


Setters y Getters
    Todos tienes setters y getters excepto:
    cosSocio : solo tiene getter

Y dudo sobre si 'puntos' debería tener setter ya que para eso debería haber 
    un método que permita implementar una regla de asignación de puntos 
    ligada al alquiler.


Métodos:

public String info // que de la información del Socio
public boolean deudor // que nos devuelva true si el Socio tiene 
    pendiente devolver algún artículo

public int addpuntos // que añada puntos a un Socio a partir de unas 
    reglas según algún alquiler realizado

     */
    //METODOS
    public String info() {
        String resp;
        resp = "Dni: " + dni +"\n"
                + "Nombre: " + nombre +"\n" 
                +"Apellidos: " + apellidos +"\n"
                + "Direccion: " + direccion +"\n"
                + "Telefono 1: " + telf1 + "\n"
                + "Telefono 2: " + telf2 +"\n"
                + "Telefono 3: " + telf3 + "\n"
                + "Puntos: " + getPuntos();
        return resp;
    }

    public boolean deudor() {
        boolean resp = false;

        return resp;
    }

    public int addPuntos() {
        int puntos = 0;

        return puntos;
    }

}
