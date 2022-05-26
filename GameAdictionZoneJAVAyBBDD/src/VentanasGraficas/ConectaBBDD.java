package VentanasGraficas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ADO.*;
import Exceptions.ExDni;
import Exceptions.ExIntervalo;
import Exceptions.ExNegativo;
import Exceptions.ExTipo;
import Exceptions.ExTlf;
import Exceptions.ExVacio;

public class ConectaBBDD {

    //ATRIBUTOS
    Connection conn = null;
    Statement sentenciaSQL = null;
    ResultSet rs = null;

    //CONSTRUCTOR VACIO
    public ConectaBBDD() {

    }

    //METODO PARA CONEXION BBDD
    public void conecta() throws SQLException {
        try {
            //Registrando el Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver).newInstance();
            System.out.println("Driver " + driver + " Registrado correctamente");
            //Abrir la conexión con la Base de Datos
            System.out.println("Conectando con la Base de datos...");
            String jdbcUrl = "jdbc:mysql://localhost:3306/tiendaalquiler"
                    + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&"
                    + "useLegacyDatetimeCode=false&serverTimezone=UTC"; // o IP
            conn = DriverManager.getConnection(jdbcUrl, "root", "");
            System.out.println("Conexión establecida con la Base de datos...");
        } catch (SQLException se) {
            //Errores de JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Errores de Class.forName
            e.printStackTrace();
        }
    }

    public void crearSentencia() throws java.sql.SQLException {
        // Crear una sentencia para enviar consultas a la base de datos
        sentenciaSQL = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        System.out.println("\nSentencia creada con éxito.");
    }

    public void cerrarConexion() throws java.sql.SQLException {
        // se cerrará la conexión a la BBDD.
        if (rs != null) {
            rs.close();
        }
        if (sentenciaSQL != null) {
            sentenciaSQL.close();
        }
        if (conn != null) {
            conn.close();
        }
        System.out.println("\nConexión cerrada con éxito.");
    }

    //SELECT
    public void ejecutaSQL(String sql) throws java.sql.SQLException {
        // realiza la consulta y devuelve resultados
        System.out.println(sql);
        rs = sentenciaSQL.executeQuery(sql);
    }

    //UPDATE, DELETE, INSERT
    public int updateSQL(String sql) throws java.sql.SQLException {
        // actualiza la BBDD
        int upd = -1;
        try {
            upd = sentenciaSQL.executeUpdate(sql);
        } catch (SQLException e) {
            upd = -1;
        }
        return upd;
    }

    public boolean irFinal() throws java.sql.SQLException {
        boolean ok = false;
        ok = rs.last();
        return ok;
    }

    public boolean irSiguiente() throws java.sql.SQLException {
        boolean ok = false;
        ok = rs.next();
        return ok;
    }

    public boolean irAnterior() throws java.sql.SQLException {
        boolean ok = false;
        ok = rs.previous();
        return ok;
    }

    public Boolean irPrimero() throws java.sql.SQLException {
        boolean ok = false;
        ok = rs.first();
        System.out.println("->" + ok);
        return ok;
    }

    public int tamanyo() throws java.sql.SQLException {
        int tam = 0, origen = 0;
        origen = rs.getRow();
        rs.last();
        tam = rs.getRow();
        rs.absolute(origen);
        return tam;
    }

    public int posRs() throws SQLException {
        int pos = 0;
        pos = rs.getRow();
        return pos;
    }

    //AUTORES
    public String codAutor(String cod) {
        String autor = null;
        try {
            ejecutaSQL("SELECT * FROM autores WHERE codAut= '" + cod + "'");
            if (rs.next()) {
                autor = rs.getString("codAut");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return autor;

    }

    public Autor dameAutor() {

        int anyoAut, publiAut;
        String codAutor, codAut, nombreAut, apeAut;
        float duracion;
        Autor aut = null;

        try {
            //AUTOR
            codAut = rs.getString("codAut");
            nombreAut = rs.getString("nombre");
            apeAut = rs.getString("apellidos");
            anyoAut = rs.getInt("anyoNac");
            publiAut = rs.getInt("publicaciones");
            try {
                aut = new Autor(nombreAut, apeAut, anyoAut, publiAut, codAut);
            } catch (ExVacio ex) {
                System.out.println("Valor capturado: " + ex);
            } catch (ExIntervalo ex) {
                System.out.println("Valor capturado: " + ex);
            } catch (ExNegativo ex) {
                System.out.println("Valor capturado: " + ex);
            } catch (ExTipo ex) {
                System.out.println("Valor capturado: " + ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aut;
    }

    public int grabaAutor(Autor aut) throws java.sql.SQLException {
        int ok = -1;
        String sql = "INSERT INTO autores(codAut,nombre,apellidos,anyoNac,publicaciones) VALUES "
                + "('" + aut.getCodAut() + "'," + "'" + aut.getNom() + "','" + aut.getApell() + "'," + aut.getAnyo_nac() + "," + aut.getPublicaciones() + ")";
        System.out.println(sql);
        ok = this.updateSQL(sql);

        return (ok);
    }

    public int eliminarAutor(String codigo) {
        String sql;
        int ok = -1;
        sql = "DELETE FROM autores WHERE autores.codAut = '" + codigo + "' ";
        System.out.println(sql);
        try {
            ok = this.updateSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }

    //ARTICULOS
    public int grabaArticulo(Articulo art) throws java.sql.SQLException {
        int ok = -1;
        String tipo = "", sql;
        java.sql.Date fechasql;
        int categoria, deteriorado = 0, formatoEbook = 0, sintetizador = 0, formatoFisico = 0;
        LibroImpreso lim = null;
        AudioLibro lau = null;
        Musica mus = null;
        VideoJuego vid = null;
        //Conversion FECHA
        long fecha_ms = art.getFecha().getTime();//Conversion ms
        fechasql = new java.sql.Date(fecha_ms);

        if (art instanceof LibroImpreso) {
            tipo = dameCodigoTipo("LibroImpreso");
        }
        if (art instanceof AudioLibro) {
            tipo = dameCodigoTipo("AudioLibro");
        }
        if (art instanceof Musica) {
            tipo = dameCodigoTipo("Música");
        }
        if (art instanceof VideoJuego) {
            tipo = dameCodigoTipo("VideoJuego");
        }

        sql = "INSERT INTO articulos(codArt, tipoArticulo, codAutor, titulo,"
                + " anyoArt, fechaAlta, deteriorado, resumen, comentario,"
                + " numPaginas, formatoEbook, tapa, sintetizador, "
                + " horasDuracion, minDuracion, nPistas, "
                + "duracion, tipo, edadRecomendada, plataforma, categoria,"
                + " formatoFisico) VALUES (";
        sql = sql + art.getCodArt();
        sql = sql + "," + tipo;
        sql = sql + ",'" + art.getAutor() + "'";
        sql = sql + ",'" + art.getNombre() + "'";
        sql = sql + "," + art.getAnyo();
        sql = sql + ",('" + fechasql + "')";
        deteriorado = conversionBool(art.isDeteriorado());
        sql = sql + "," + deteriorado;
        sql = sql + ",'" + art.getResumen() + "'";
        sql = sql + ",'" + art.getComentarios().toString() + "'";

        if (art instanceof LibroImpreso) {
            lim = (LibroImpreso) art;
            sql = sql + "," + lim.getNumPaginas();
            formatoEbook = conversionBool(lim.isFormato());
            sql = sql + "," + formatoEbook;
            sql = sql + ",'" + lim.getTapa() + "',null,null,null,null,null,null,null,null,null,null)";
        }
        if (art instanceof AudioLibro) {
            lau = (AudioLibro) art;
            sintetizador = conversionBool(lau.isSintetizador());
            sql = sql + ",null,null,null," + sintetizador;
            sql = sql + "," + lau.getHorasDuracion();
            sql = sql + "," + lau.getMinDuracion() + ",null,null,null,null,null,null,null)";
        }
        if (art instanceof Musica) {
            mus = (Musica) art;
            sql = sql + ",null,null,null,null,null,null," + mus.getnPistas();
            sql = sql + "," + mus.getDuracion();
            sql = sql + ",'" + mus.getTipo() + "',null,null,null,null)";
        }
        if (art instanceof VideoJuego) {
            vid = (VideoJuego) art;
            sql = sql + ",null,null,null,null,null,null,null,null,null," + vid.getEdadRecomendada();
            sql = sql + ",'" + vid.getPlataforma() + "'";
            categoria = dameCodigoCategoria(vid.getCategoria());
            sql = sql + "," + categoria;
            formatoFisico = conversionBool(vid.isFormatoFisico());
            sql = sql + "," + formatoFisico + ")";
        }
        ok = this.updateSQL(sql);
        System.out.println(sql);
        return (ok);
    }

    public int conversionBool(boolean bool) {
        int resp = 0;
        if (bool) {
            resp = 1;
        }
        return resp;
    }

    //PARA SABER EL CODIGO DEL TIPO DE ARTICULO
    public String dameCodigoTipo(String clase) {
        String tipo = "", sql;
        ResultSet r;
        sql = "SELECT codTipArt FROM tipoarticulo WHERE descripcion ='" + clase + "'";
        System.out.println(sql);
        try {
            ejecutaSQL(sql);
            irPrimero();
            tipo = rs.getString("codTipArt");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tipo;
    }

    public int dameCodigoCategoria(String clase) {
        String sql;
        int tipo = 0;
        ResultSet r;
        sql = "SELECT codcat FROM categorias WHERE descripcion ='" + clase + "'";
        System.out.println(sql);
        try {
            ejecutaSQL(sql);
            irPrimero();
            tipo = rs.getInt("codcat");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tipo;
    }

    public int eliminarArticulo(int codigo) {
        String sql;
        int ok = -1;
        sql = "DELETE FROM articulos WHERE articulos.codArt = '" + codigo + "' ";
        System.out.println(sql);
        try {
            ok = this.updateSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }

    public Articulo dameArticuloCodigo(int codigo) {
        Articulo art = null;
        String codAutor, comentario, titulo, resumen, tapa, tipo, plataforma, categoria = null;
        int anyo, numPaginas, codArt, tipoArt, hDuracion, nPistas, mDuracion, edadRecomendada;
        float duracion;
        boolean deteriorado, formatoEbook, sintetizador, formatoFisico;
        Date fecha;
        try {
            ejecutaSQL("SELECT * FROM articulos WHERE codArt= '" + codigo + "' ");
            // recogemos valores del resultset
            if (rs.next()) {
                codArt = rs.getInt("codArt");
                codAutor = rs.getString("codAutor");
                titulo = rs.getString("titulo");
                fecha = rs.getDate("fechaAlta");
                anyo = rs.getInt("anyoArt");
                resumen = rs.getString("resumen");
                deteriorado = rs.getBoolean("deteriorado");
                tipoArt = rs.getInt("tipoArticulo");
                comentario = rs.getString("comentario");
                //LIBROIMPRESO
                if (rs.getInt("tipoArticulo") == 1) {
                    numPaginas = rs.getInt("numPaginas");
                    formatoEbook = rs.getBoolean("formatoEbook");
                    tapa = rs.getString("tapa");
                    try {
                        art = new LibroImpreso(formatoEbook, tapa, numPaginas, codArt, titulo, fecha, anyo, resumen, codAutor, deteriorado);
                        art.guardaComentario(comentario);
                    } catch (ExIntervalo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExNegativo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExTipo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExVacio e) {
                        System.out.println("Valor capturado: " + e);
                    }
                }
                //AUDIOLIBRO
                if (rs.getInt("tipoArticulo") == 2) {
                    sintetizador = rs.getBoolean("sintetizador");
                    hDuracion = rs.getInt("horasDuracion");
                    mDuracion = rs.getInt("minDuracion");
                    try {
                        art = new AudioLibro(sintetizador, hDuracion, mDuracion, codArt, titulo, fecha, anyo, resumen, codAutor, deteriorado);
                        art.guardaComentario(comentario);
                    } catch (ExNegativo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExIntervalo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExVacio e) {
                        System.out.println("Valor capturado: " + e);
                    }
                }
                //MUSICA
                if (rs.getInt("tipoArticulo") == 3) {
                    nPistas = rs.getInt("nPistas");
                    duracion = rs.getInt("duracion");
                    tipo = rs.getString("tipo");
                    try {
                        art = new Musica(nPistas, duracion, tipo, codArt, titulo, fecha, anyo, resumen, codAutor, deteriorado);
                        art.guardaComentario(comentario);
                    } catch (ExNegativo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExTipo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExIntervalo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExVacio e) {
                        System.out.println("Valor capturado: " + e);
                    }
                }
                //VIDEOJUEGO
                if (rs.getInt("tipoArticulo") == 4) {
                    edadRecomendada = rs.getInt("edadRecomendada");
                    plataforma = rs.getString("plataforma");
                    if (rs.getInt("categoria") == 1) {
                        categoria = "Aventuras";
                    }
                    if (rs.getInt("categoria") == 2) {
                        categoria = "Bélico";
                    }
                    if (rs.getInt("categoria") == 3) {
                        categoria = "Puzzle";
                    }
                    formatoFisico = rs.getBoolean("formatoFisico");
                    try {
                        art = new VideoJuego(edadRecomendada, plataforma, categoria, formatoFisico, codArt, titulo, fecha, anyo, resumen, codAutor, deteriorado);
                        art.guardaComentario(comentario);
                    } catch (ExNegativo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExTipo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExIntervalo e) {
                        System.out.println("Valor capturado: " + e);
                    } catch (ExVacio e) {
                        System.out.println("Valor capturado: " + e);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return art;
    }

    public Autor obtenerAutorCodigo(String codAutor) {
        String nombre, apellidos, codigo;
        int anyo, publicaciones;
        Autor autor = null;
        try {
            ejecutaSQL("SELECT * FROM autores WHERE codAut= '" + codAutor + "' ");
            if (rs.next()) {
                codigo = rs.getString("codAut");
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                anyo = rs.getInt("anyoNac");
                publicaciones = rs.getInt("publicaciones");
                try {
                    autor = new Autor(nombre, apellidos, anyo, publicaciones, codigo);
                } catch (ExIntervalo e) {
                    e.printStackTrace();
                } catch (ExNegativo e) {
                    e.printStackTrace();
                } catch (ExTipo e) {
                    e.printStackTrace();
                } catch (ExVacio e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return autor;
    }

    public int modiArticulo(Articulo art) throws java.sql.SQLException {
        int ok = -1;
        String tipo = "", sql;
        int categoria, deteriorado = 0, formatoEbook = 0, sintetizador = 0, formatoFisico = 0;
        LibroImpreso lim = null;
        AudioLibro lau = null;
        Musica mus = null;
        VideoJuego vid = null;

        sql = "UPDATE articulos SET ";
        sql = sql + "titulo = '" + art.getNombre() + "'";
        sql = sql + ", anyoArt = " + art.getAnyo();
        deteriorado = conversionBool(art.isDeteriorado());
        sql = sql + ", deteriorado =" + deteriorado;
        sql = sql + ",resumen = '" + art.getResumen() + "'";

        if (art instanceof LibroImpreso) {
            lim = (LibroImpreso) art;
            sql = sql + ",numPaginas=" + lim.getNumPaginas();
            formatoEbook = conversionBool(lim.isFormato());
            sql = sql + ",formatoEbook= " + formatoEbook;
            sql = sql + ",tapa ='" + lim.getTapa() + "' WHERE codArt = " + art.getCodArt();
        }
        if (art instanceof AudioLibro) {
            lau = (AudioLibro) art;
            sintetizador = conversionBool(lau.isSintetizador());
            sql = sql + ",sintetizador = " + sintetizador;
            sql = sql + ",horasDuracion = " + lau.getHorasDuracion();
            sql = sql + ",minDuracion = " + lau.getMinDuracion() + " WHERE codArt = " + art.getCodArt();
        }
        if (art instanceof Musica) {
            mus = (Musica) art;
            sql = sql + ",nPistas = " + mus.getnPistas();
            sql = sql + ",duracion = " + mus.getDuracion();
            sql = sql + ",tipo = '" + mus.getTipo() + "' WHERE codArt = " + art.getCodArt();
        }
        if (art instanceof VideoJuego) {
            vid = (VideoJuego) art;
            sql = sql + ",edadRecomendada = " + vid.getEdadRecomendada();
            sql = sql + ",plataforma = '" + vid.getPlataforma() + "'";
            categoria = dameCodigoCategoria(vid.getCategoria());
            sql = sql + ",categoria = " + categoria;
            formatoFisico = conversionBool(vid.isFormatoFisico());
            sql = sql + ",formatoFisico = " + formatoFisico + " WHERE codArt = " + art.getCodArt();
        }
        ok = this.updateSQL(sql);
        System.out.println(sql);
        return (ok);
    }

    public int modiAutor(Autor aut) {
        String nombre, apellidos, sql, codigo;
        int anyo, publicaciones, ok = -1;

        codigo = aut.getCodAut();
        nombre = aut.getNom();
        apellidos = aut.getApell();
        anyo = aut.getAnyo_nac();
        publicaciones = aut.getPublicaciones();

        sql = "UPDATE `autores` SET `nombre` = '" + nombre + "', `apellidos` = '" + apellidos + "', `anyoNac` = " + anyo + ", `publicaciones` = " + publicaciones + " WHERE `codAut` = '" + codigo + "'";
        System.out.println(sql);
        try {
            ok = this.updateSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }

    public Articulo dameArticulo() {

        int codArt, anyoArt, numPaginas, horasDuracion, minDuracion, nPistas, edadRecomendada;
        String codAutor, titulo, resumen, comentario, tapa, tipo, plataforma, categoria = null;
        float duracion;
        Date fechaAlta;
        boolean deteriorado, formatoEbook, sintetizador, formatoFisico;
        Articulo art = null;
        try {
            codAutor = rs.getString("codAutor");
            codArt = rs.getInt("codArt");
            titulo = rs.getString("titulo");
            anyoArt = rs.getInt("anyoArt");
            fechaAlta = rs.getDate("fechaAlta");
            deteriorado = rs.getBoolean("deteriorado");
            resumen = rs.getString("resumen");
            comentario = rs.getString("comentario");
            //LIBROIMPRESO
            if (rs.getInt("tipoArticulo") == 1) {
                numPaginas = rs.getInt("numPaginas");
                formatoEbook = rs.getBoolean("formatoEbook");
                tapa = rs.getString("tapa");
                try {
                    art = new LibroImpreso(formatoEbook, tapa, numPaginas, codArt, titulo, fechaAlta, anyoArt, resumen, codAutor, deteriorado);
                    art.guardaComentario(comentario);
                } catch (ExIntervalo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExNegativo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExTipo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExVacio e) {
                    System.out.println("Valor capturado: " + e);
                }
            }
            //AUDIOLIBRO
            if (rs.getInt("tipoArticulo") == 2) {
                sintetizador = rs.getBoolean("sintetizador");
                horasDuracion = rs.getInt("horasDuracion");
                minDuracion = rs.getInt("minDuracion");
                try {
                    art = new AudioLibro(sintetizador, horasDuracion, minDuracion, codArt, titulo, fechaAlta, anyoArt, resumen, codAutor, deteriorado);
                    art.guardaComentario(comentario);
                } catch (ExNegativo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExIntervalo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExVacio e) {
                    System.out.println("Valor capturado: " + e);
                }
            }
            //MUSICA
            if (rs.getInt("tipoArticulo") == 3) {
                nPistas = rs.getInt("nPistas");
                duracion = rs.getInt("duracion");
                tipo = rs.getString("tipo");
                try {
                    art = new Musica(nPistas, duracion, tipo, codArt, titulo, fechaAlta, anyoArt, resumen, codAutor, deteriorado);
                    art.guardaComentario(comentario);
                } catch (ExNegativo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExTipo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExIntervalo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExVacio e) {
                    System.out.println("Valor capturado: " + e);
                }
            }
            //VIDEOJUEGO
            if (rs.getInt("tipoArticulo") == 4) {
                edadRecomendada = rs.getInt("edadRecomendada");
                plataforma = rs.getString("plataforma");
                if (rs.getInt("categoria") == 1) {
                    categoria = "Aventuras";
                }
                if (rs.getInt("categoria") == 2) {
                    categoria = "Bélico";
                }
                if (rs.getInt("categoria") == 3) {
                    categoria = "Puzzle";
                }
                formatoFisico = rs.getBoolean("formatoFisico");
                try {
                    art = new VideoJuego(edadRecomendada, plataforma, categoria, formatoFisico, codArt, titulo, fechaAlta, anyoArt, resumen, codAutor, deteriorado);
                    art.guardaComentario(comentario);
                } catch (ExNegativo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExTipo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExIntervalo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExVacio e) {
                    System.out.println("Valor capturado: " + e);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return art;
    }

    //CLIENTE
    public Cliente dameCliente(String dni) {
        String dniCliente, nombre, apellidos, direccion, telf1, telf2;
        Cliente cli = null;
        try {
            ejecutaSQL("SELECT * FROM clientes WHERE dniCliente= '" + dni + "' ");
            if (rs.next()) {
                dniCliente = rs.getString("dniCliente");
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                direccion = rs.getString("direccion");
                telf1 = rs.getString("telf1");
                telf2 = rs.getString("telf2");
                try {
                    cli = new Cliente(dniCliente, nombre, apellidos, direccion, telf1, telf2);
                } catch (ExDni e) {
                    e.printStackTrace();
                } catch (ExTlf e) {
                    e.printStackTrace();
                } catch (ExVacio e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cli;
    }
    

    public int grabaCliente(Cliente cli) throws java.sql.SQLException {
        int ok = -1;
        String sql = "INSERT INTO clientes(dniCliente,nombre,apellidos,direccion,telf1, telf2) VALUES "
                + "('" + cli.getDni() + "'," + "'" + cli.getNombre() + "','" + cli.getApellidos() + "','" + cli.getDireccion() + "','" + cli.getTelf1() + "','" + cli.getTelf2() + "')";
        System.out.println(sql);
        ok = this.updateSQL(sql);
        return (ok);
    }

    public int eliminarCliente(String dni) {
        String sql;
        int ok = -1;
        sql = "DELETE FROM clientes WHERE clientes.dniCliente = '" + dni + "' ";
        System.out.println(sql);
        try {
            ok = this.updateSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }

    public int modiCliente(Cliente cli, String dniBuscar) {
        String sql, dniCliente, nombre, apellidos, direccion, telf1, telf2;
        int ok = -1;

        dniCliente = cli.getDni();
        nombre = cli.getNombre();
        apellidos = cli.getApellidos();
        direccion = cli.getDireccion();
        telf1 = cli.getTelf1();
        telf2 = cli.getTelf2();

        sql = "UPDATE clientes SET dniCliente = '" + dniCliente + "', nombre = '" + nombre + "', apellidos = '" + apellidos + "', direccion = '" + direccion + "', telf1 = '" + telf1 + "', telf2 = '" + telf2 + "' WHERE dniCliente = '" + dniBuscar + "'";
        System.out.println(sql);
        try {
            ok = this.updateSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }

    public Cliente obtenerCliente() {

        String dniCliente, nombre, apellidos, direccion, telf1, telf2;
        Cliente cli = null;

        try {
            //CLIENTE
            dniCliente = rs.getString("dniCliente");
            nombre = rs.getString("nombre");
            apellidos = rs.getString("apellidos");
            direccion = rs.getString("direccion");
            telf1 = rs.getString("telf1");
            telf2 = rs.getString("telf2");
            try {
                cli = new Cliente(dniCliente, nombre, apellidos, direccion, telf1, telf2);
            } catch (ExDni e) {
                e.printStackTrace();
            } catch (ExTlf e) {
                e.printStackTrace();
            } catch (ExVacio e) {
                e.printStackTrace();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cli;
    }

    public int grabaAlquiler(Alquiler alq) throws java.sql.SQLException {
        int ok = -1;
        java.sql.Date fechasql;
        //Conversion FECHA
        long fecha_ms = alq.getFechaAlq().getTime();//Conversion ms
        fechasql = new java.sql.Date(fecha_ms);
        String sql = "INSERT INTO alquiler(codAlq,dni,codArt,fecha_alq,dias) VALUES "
                + "(" + alq.getCodAlq() + "," + "'" + alq.getCli().getDni() + "'," + alq.getA().getCodArt() + ",'" + fechasql + "'," + alq.getDias() + ")";
        System.out.println(sql);
        ok = this.updateSQL(sql);

        return (ok);
    }
    public Alquiler dameAlquilerCodigo(int codigoArticulo, String dniBuscar) {
        String dni;
        int codAlq,codArt, dias;
        Date fechaAlq;
        Alquiler alq = null;
        Cliente cli = null;
        Articulo art = null;
        try {
            ejecutaSQL("SELECT * FROM alquiler WHERE dni= '"+dniBuscar+"' AND codArt = '" + codigoArticulo + "' ");
            if (rs.next()) {
                codAlq = rs.getInt("codAlq");
                dni = rs.getString("dni");
                codArt = rs.getInt("codArt");
                fechaAlq = rs.getDate("fecha_alq");
                dias = rs.getInt("dias");
                cli = dameCliente(dni);
                art = dameArticuloCodigo(codArt);
                
                try {
                    alq = new Alquiler(codAlq,art,dias,cli,fechaAlq);
                } catch (ExNegativo e){
                    e.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alq;
    }
    
    public int modiAlquiler(Alquiler alq) {
        int ok = -1, dias, codArt;
        String sql, dni;
        dias = alq.getDias();
        dni = alq.getCli().getDni();
        codArt = alq.getA().getCodArt();
        sql = "UPDATE `alquiler` SET `dias` = "+dias+" WHERE `alquiler`.`dni` = '"+dni+"' AND `alquiler`.`codArt` = "+codArt;
        System.out.println(sql);
        try {
            ok = this.updateSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }
    
     public int eliminaAlquiler(int codAlq) {
        String sql;
        int ok = -1;
        sql = "DELETE FROM alquiler WHERE alquiler.codAlq = '" + codAlq + "' ";
        System.out.println(sql);
        try {
            ok = this.updateSQL(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }
    
    
    
    
    
    /*
    public Articulo dameArticuloAutor() {

        int codArt, anyoArt, numPaginas, horasDuracion, minDuracion, nPistas, edadRecomendada, anyoAut, publiAut;
        String codAutor, titulo, resumen, comentario, tapa, tipo, plataforma, categoria = null, codAut, nombreAut, apeAut;
        float duracion;
        Date fechaAlta;
        boolean deteriorado, formatoEbook, sintetizador, formatoFisico;
        Articulo art = null;
        Autor aut = null;

        try {
            //AUTOR
            codAut = rs.getString("codAutor");
            nombreAut = rs.getString("nombre");
            apeAut = rs.getString("apellidos");
            anyoAut = rs.getInt("anyoNac");
            publiAut = rs.getInt("publicaciones");
            try {
                aut = new Autor(nombreAut, apeAut, anyoAut, publiAut, codAut);
            } catch (ExVacio ex) {
                System.out.println("Valor capturado: " + ex);
            } catch (ExIntervalo ex) {
                System.out.println("Valor capturado: " + ex);
            } catch (ExNegativo ex) {
                System.out.println("Valor capturado: " + ex);
            } catch (ExTipo ex) {
                System.out.println("Valor capturado: " + ex);
            }
            codArt = rs.getInt("codArt");
            System.out.println(codArt);
            titulo = rs.getString("titulo");
            anyoArt = rs.getInt("anyoArt");
            fechaAlta = rs.getDate("fechaAlta");
            deteriorado = rs.getBoolean("deteriorado");
            resumen = rs.getString("resumen");
            comentario = rs.getString("comentario");
            //LIBROIMPRESO
            if (rs.getInt("tipoArticulo") == 1) {
                numPaginas = rs.getInt("numPaginas");
                formatoEbook = rs.getBoolean("formatoEbook");
                tapa = rs.getString("tapa");
                try {
                    art = new LibroImpreso(formatoEbook, tapa, numPaginas, codArt, titulo, fechaAlta, anyoArt, resumen, aut, deteriorado);
                    art.guardaComentario(comentario);
                } catch (ExIntervalo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExNegativo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExTipo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExVacio e) {
                    System.out.println("Valor capturado: " + e);
                }
            }
            //AUDIOLIBRO
            if (rs.getInt("tipoArticulo") == 2) {
                sintetizador = rs.getBoolean("sintetizador");
                horasDuracion = rs.getInt("horasDuracion");
                minDuracion = rs.getInt("minDuracion");
                try {
                    art = new AudioLibro(sintetizador, horasDuracion, minDuracion, codArt, titulo, fechaAlta, anyoArt, resumen, aut, deteriorado);
                    art.guardaComentario(comentario);
                } catch (ExNegativo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExIntervalo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExVacio e) {
                    System.out.println("Valor capturado: " + e);
                }
            }
            //MUSICA
            if (rs.getInt("tipoArticulo") == 3) {
                nPistas = rs.getInt("nPistas");
                duracion = rs.getInt("duracion");
                tipo = rs.getString("tipo");
                try {
                    art = new Musica(nPistas, duracion, tipo, codArt, titulo, fechaAlta, anyoArt, resumen, aut, deteriorado);
                    art.guardaComentario(comentario);
                } catch (ExNegativo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExTipo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExIntervalo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExVacio e) {
                    System.out.println("Valor capturado: " + e);
                }
            }
            //VIDEOJUEGO
            if (rs.getInt("tipoArticulo") == 4) {
                edadRecomendada = rs.getInt("edadRecomendada");
                plataforma = rs.getString("plataforma");
                if (rs.getInt("categoria") == 1) {
                    categoria = "Aventuras";
                }
                if (rs.getInt("categoria") == 2) {
                    categoria = "Bélico";
                }
                if (rs.getInt("categoria") == 3) {
                    categoria = "Puzzle";
                }
                formatoFisico = rs.getBoolean("formatoFisico");
                try {
                    art = new VideoJuego(edadRecomendada, plataforma, categoria, formatoFisico, codArt, titulo, fechaAlta, anyoArt, resumen, aut, deteriorado);
                    art.guardaComentario(comentario);
                } catch (ExNegativo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExTipo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExIntervalo e) {
                    System.out.println("Valor capturado: " + e);
                } catch (ExVacio e) {
                    System.out.println("Valor capturado: " + e);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConectaBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return art;
    }

     */
}
