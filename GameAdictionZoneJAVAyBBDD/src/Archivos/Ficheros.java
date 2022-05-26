
package Archivos;
import MisListas.*;
import java.io.*;
import ADO.*;
public class Ficheros {
    /*
    El metodo GUARDAR articulos sirve para que una vez hayamos creado varios objetos de 
    gran utilidad para la app los almacene en Articulos.txt y podamos finalizar la ejecucion
    sin perderlos, ya que a pesar de que se eliminen de la app se quedaran guardados en el fichero.
    
    El metodo CARGAR sirve para que una vez arranquemos el programa, que se encontrara vacío
    sin objetos, invoquemos a este metodo para copiar los objetos del fichero Articulos.txt y
    pegarlos en misArticulos... asi podemos trabajar con la app completa de objetos necesarios.
    
    */
    /*
    public static boolean guardarArticulos(ListaArticulos listaA) {
        FileOutputStream fs;
        ObjectOutputStream oos;
        Articulo a;
        boolean guardado = false;
        //escritura del fichero
        try {
            fs = new FileOutputStream("Documentos/Articulos.txt");
            oos = new ObjectOutputStream(fs);
            for (int i = 0; i < listaA.numArticulos(); i++) {
                a = (Articulo) listaA.getArticulo(i);
                oos.writeObject(a); //escribe el objeto en el flujo salida
                System.out.println(a.getCodArt());
            }
            System.out.println("Articulo Guardado");
            // Cerramos los flujos abiertos una vez utilizados
            oos.close();
            fs.close();
            guardado = true;
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            guardado = false;
        }
        return guardado;
    }
    
    public static boolean guardarClientes(ListaClientes listaCli) {
        FileOutputStream fs;
        ObjectOutputStream oos;
        Cliente cli;
        boolean guardado = false;
        //escritura del fichero
        try {
            fs = new FileOutputStream("Documentos/Clientes.txt");
            oos = new ObjectOutputStream(fs);
            for (int i = 0; i < listaCli.numClientes(); i++) {
                cli = (Cliente) listaCli.getCliente(i);
                oos.writeObject(cli); //escribe el objeto en el flujo salida
            }
            System.out.println("Cliente Guardado");
            // Cerramos los flujos abiertos una vez utilizados
            oos.close();
            fs.close();
            guardado = true;
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            guardado = false;
        }
        return guardado;
    }

    public static boolean cargarArticulos(ListaArticulos listaA) {
        FileInputStream fe;
        DataInputStream d;
        ObjectInputStream ois;
        File f;
        Articulo v;
        boolean cargado = false;
        // lectura del fichero (de manera análoga a la escritura)
        listaA.vaciarLista();
        try {
            f = null;
            fe = null;
            d = null;
            try {
                f = new File("Documentos/Articulos.txt");
                if (f.exists()) {
                    // Asociamos el FileInputStream con el ObjectInputStream
                    fe = new FileInputStream(f);
                    ois = new ObjectInputStream(fe);
                    while (fe.available() > 0) {
                        v = (Articulo) ois.readObject();
                        cargado = listaA.añadirArticulo(v);
                        System.out.println(v.info());
                    }
                    System.out.println("Articulo cargado");
                }
            } catch (EOFException eof) {
                System.err.println("Fin de Fichero encontrado ");
            } catch (FileNotFoundException fnf) {
                System.err.println("Fichero no encontrado " + fnf);
            } catch (IOException e) {
                System.err.println("Se ha producido una IOException" + e.toString());
            } catch (ClassNotFoundException e) {
                System.err.println("Error de programa" + e);
            } finally {
                if (d != null) {
                    d.close();
                    fe.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cargado;
    }
    public static boolean cargarClientes(ListaClientes listaCli) {
        FileInputStream fe;
        DataInputStream d;
        ObjectInputStream ois;
        File f;
        Cliente c;
        boolean cargado = false;
        // lectura del fichero (de manera análoga a la escritura)
        listaCli.vaciarLista();
        try {
            f = null;
            fe = null;
            d = null;
            try {
                f = new File("Documentos/Clientes.txt");
                if (f.exists()) {
                    // Asociamos el FileInputStream con el ObjectInputStream
                    fe = new FileInputStream(f);
                    ois = new ObjectInputStream(fe);
                    while (fe.available() > 0) {
                        c = (Cliente) ois.readObject();
                        cargado = listaCli.añadirCliente(c);
                        
                    }
                    System.out.println("Cliente cargado");
                }
            } catch (EOFException eof) {
                System.err.println("Fin de Fichero encontrado ");
            } catch (FileNotFoundException fnf) {
                System.err.println("Fichero no encontrado " + fnf);
            } catch (IOException e) {
                System.err.println("Se ha producido una IOException" + e.toString());
            } catch (ClassNotFoundException e) {
                System.err.println("Error de programa" + e);
            } finally {
                if (d != null) {
                    d.close();
                    fe.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cargado;
    }
 */
}
