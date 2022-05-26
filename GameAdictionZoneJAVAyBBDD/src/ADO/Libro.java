package ADO;

import Exceptions.*;
import MisListas.MiLibreria;
import java.util.Date;

public abstract class Libro extends Articulo {

    // atrinutos miembro
    private int numPaginas;

    //CONSTRUCTOR
    public Libro(int numPaginas, String nombre, Date fecha,
            int anyo, String resumen, String autor, boolean deteriorado) throws ExIntervalo, ExVacio, ExNegativo {
        super(nombre, fecha, anyo, resumen, autor, deteriorado);
        if (MiLibreria.checkNegativo(numPaginas)) {
            this.numPaginas = numPaginas;
        }
    }

    //CONSTRUCTOR
    public Libro(int numPaginas,int cod, String nombre, Date fecha,
            int anyo, String resumen, String autor, boolean deteriorado) throws ExIntervalo, ExVacio, ExNegativo {
        super(cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        if (MiLibreria.checkNegativo(numPaginas)) {
            this.numPaginas = numPaginas;
        }
    }

    //GET Y SET
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) throws ExNegativo {
        if (MiLibreria.checkNegativo(numPaginas)) {
            this.numPaginas = numPaginas;
        }
    }
}
