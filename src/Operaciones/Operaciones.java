package Operaciones;

import Clases.*;
import Conexion.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class Operaciones {

    // Cramos las variables para la conexion
    static Connection cn = null;
    static Statement s = null;
    static ResultSet rs;
    datosAsignatura dat = new datosAsignatura();

    public void agregarAsign(String nombre, String tipoAprovacion, int EVteo, int EVprac, double pondT,
            double pondP, int horas, int nivel) {

        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();// ESTO ME FALTABA

            String query = "INSERT INTO Asignatura (NombreAsign,Tip_Aprovacion,EVTeorica,EVPractica,PondTeorica,PondPractica,Horas,Nivel) "
                    + "VALUES ('" + nombre + "','" + tipoAprovacion + "','" + EVteo + "','" + EVprac + "','" + pondT + "','" + pondP + "','" + horas + "','" + nivel + "')";
            s.executeUpdate(query);
            s.close();
            cn.close();
            //JOptionPane.showMessageDialog(null, "Usuario Ingresado!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }
    }

    public void agregarNotasTeoricas(String nota1, String nota2, String nota3, String nota4, String nota5, String nota6,
            String nota7, String nota8, String nota9, String nombre) {

        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();// ESTO ME FALTABA

            String query = "INSERT INTO NotasTeorico (Nota1,Nota2,Nota3,Nota4,Nota5,Nota6,Nota7,Nota8,Nota9,Asignatura_NombreAsign) "
                    + "VALUES ('" + nota1 + "','" + nota2 + "','" + nota3 + "','" + nota4 + "','" + nota5 + "','" + nota6 + "','" + nota7 + "','" + nota8 + "','" + nota9 + "','" + nombre + "')";
            s.executeUpdate(query);
            s.close();
            cn.close();
            //JOptionPane.showMessageDialog(null, "Usuario Ingresado!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }
    }

    public void agregarNotasPracticas(String nota1, String nota2, String nota3, String nota4, String nota5, String nota6,
            String nota7, String nota8, String nota9, String nombre) {

        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();// ESTO ME FALTABA

            String query = "INSERT INTO NotasPractico (Nota1,Nota2,Nota3,Nota4,Nota5,Nota6,Nota7,Nota8,Nota9,Asignatura_NombreAsign) "
                    + "VALUES ('" + nota1 + "','" + nota2 + "','" + nota3 + "','" + nota4 + "','" + nota5 + "','" + nota6 + "','" + nota7 + "','" + nota8 + "','" + nota9 + "','" + nombre + "')";
            s.executeUpdate(query);
            s.close();
            cn.close();
            //JOptionPane.showMessageDialog(null, "Usuario Ingresado!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }
    }

    public void agregarPondT(String pt1, String pt2, String pt3, String pt4, String pt5, String pt6,
            String pt7, String pt8, String pt9, String nombre) {

        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();// ESTO ME FALTABA

            String query = "INSERT INTO PondTeo (pt1,pt2,pt3,pt4,pt5,pt6,pt7,pt8,pt9,Asignatura_NombreAsign) "
                    + "VALUES ('" + pt1 + "','" + pt2 + "','" + pt3 + "','" + pt4 + "','" + pt5 + "','" + pt6 + "','" + pt7 + "','" + pt8 + "','" + pt9 + "','" + nombre + "')";
            s.executeUpdate(query);
            s.close();
            cn.close();
            //JOptionPane.showMessageDialog(null, "Usuario Ingresado!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }
    }

    public void agregarPondP(String pp1, String pp2, String pp3, String pp4, String pp5, String pp6,
            String pp7, String pp8, String pp9, String nombre) {

        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();// ESTO ME FALTABA

            String query = "INSERT INTO PondPrac (pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8,pp9,Asignatura_NombreAsign) "
                    + "VALUES ('" + pp1 + "','" + pp2 + "','" + pp3 + "','" + pp4 + "','" + pp5 + "','" + pp6 + "','" + pp7 + "','" + pp8 + "','" + pp9 + "','" + nombre + "')";
            s.executeUpdate(query);
            s.close();
            cn.close();
            //JOptionPane.showMessageDialog(null, "Usuario Ingresado!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }
    }

    public void agregarNotasFinales(String Fpractico, String Fteorico, String Pgeneral, String nombre) {

        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();// ESTO ME FALTABA

            String query = "INSERT INTO NotasFinales (Fpractico,Fteorico,Pgeneral,Asignatura_NombreAsign) "
                    + "VALUES ('" + Fpractico + "','" + Fteorico + "','" + Pgeneral + "','" + nombre + "')";
            s.executeUpdate(query);
            s.close();
            cn.close();
            //JOptionPane.showMessageDialog(null, "Usuario Ingresado!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }
    }

    public boolean verRamo(String nombre) {
        boolean r = false;
        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();// ESTO ME FALTABA
            String query = "SELECT NombreAsign FROM Asignatura WHERE NombreAsign ='" + nombre + "'";
            rs = s.executeQuery(query);

            if (rs.next()) {
                //System.out.println("Nombre Existe");
                r = true;
            } else {
                //System.out.println("Nombre No Existe");
                r = false;
            }
            rs.close();
            s.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }

        return r;
    }

    public ArrayList<datosAsignatura> ConsultaListaRamos() {

        ArrayList<datosAsignatura> APP = new ArrayList<>();
        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();
            //MODIFICAR LA SITANXIS DE LA CONSULTA SQL
            String sql = "SELECT NombreAsign,Tip_Aprovacion,EVTeorica,EVPractica,PondTeorica,PondPractica,Horas,Nivel FROM Asignatura";
            rs = s.executeQuery(sql);
            //rs.getString("Nombre")
            while (rs.next()) {
                datosAsignatura pAsig = new datosAsignatura();
                pAsig.setNombre(rs.getString("NombreAsign"));
                pAsig.setTipo(rs.getString("Tip_Aprovacion"));
                pAsig.setEVteorica(rs.getInt("EVTeorica"));
                pAsig.setEVpractica(rs.getInt("EVPractica"));
                pAsig.setPondtTeorica(rs.getDouble("PondTeorica"));
                pAsig.setPondtPratica(rs.getDouble("PondPractica"));
                pAsig.setHoras(rs.getInt("Horas"));
                pAsig.setNivel(rs.getInt("Nivel"));

                APP.add(pAsig);
            }
            s.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return APP;
    }

    public datosAsignatura SelectAllDataFromAsignatura(String nombre) {
        datosAsignatura dAsignatura = new datosAsignatura();

        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();
            //MODIFICAR LA SITANXIS DE LA CONSULTA SQL
            String sql = "SELECT NombreAsign,Tip_Aprovacion,EVTeorica,EVPractica,PondTeorica,PondPractica,Horas,Nivel FROM Asignatura WHERE NombreAsign ='" + nombre + "'";
            rs = s.executeQuery(sql);
            //rs.getString("Nombre")
            while (rs.next()) {

                dAsignatura.setNombre(rs.getString("NombreAsign"));
                dAsignatura.setTipo(rs.getString("Tip_Aprovacion"));
                dAsignatura.setEVteorica(rs.getInt("EVTeorica"));
                dAsignatura.setEVpractica(rs.getInt("EVPractica"));
                dAsignatura.setPondtTeorica(rs.getDouble("PondTeorica"));
                dAsignatura.setPondtPratica(rs.getDouble("PondPractica"));
                dAsignatura.setHoras(rs.getInt("Horas"));
                dAsignatura.setNivel(rs.getInt("Nivel"));

            }
            s.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dAsignatura;
    }

    public NotasTeoricas notasTeoricas(String nombre) {
        //datosAsignatura dAsignatura = new datosAsignatura();
        NotasTeoricas nt = new NotasTeoricas();
        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();
            //MODIFICAR LA SITANXIS DE LA CONSULTA SQL
            String sql = "SELECT Nota1,Nota2,Nota3,Nota4,Nota5,Nota6,Nota7,Nota8,Nota9 FROM NotasTeorico WHERE Asignatura_NombreAsign ='" + nombre + "'";
            rs = s.executeQuery(sql);
            //rs.getString("Nombre")
            while (rs.next()) {

                nt.setN1(rs.getString("Nota1"));
                nt.setN2(rs.getString("Nota2"));
                nt.setN3(rs.getString("Nota3"));
                nt.setN4(rs.getString("Nota4"));
                nt.setN5(rs.getString("Nota5"));
                nt.setN6(rs.getString("Nota6"));
                nt.setN7(rs.getString("Nota7"));
                nt.setN8(rs.getString("Nota8"));
                nt.setN9(rs.getString("Nota9"));
                //nt.setNombre(rs.getString("Asignatura_NombreAsign"));
            }
            s.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return nt;
    }

    public NotasPracticas notasPracticas(String nombre) {
        //datosAsignatura dAsignatura = new datosAsignatura();
        NotasPracticas np = new NotasPracticas();
        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();
            //MODIFICAR LA SITANXIS DE LA CONSULTA SQL
            String sql = "SELECT Nota1,Nota2,Nota3,Nota4,Nota5,Nota6,Nota7,Nota8,Nota9 FROM NotasPractico WHERE Asignatura_NombreAsign ='" + nombre + "'";
            rs = s.executeQuery(sql);
            //rs.getString("Nombre")
            while (rs.next()) {

                np.setN1(rs.getString("Nota1"));
                np.setN2(rs.getString("Nota2"));
                np.setN3(rs.getString("Nota3"));
                np.setN4(rs.getString("Nota4"));
                np.setN5(rs.getString("Nota5"));
                np.setN6(rs.getString("Nota6"));
                np.setN7(rs.getString("Nota7"));
                np.setN8(rs.getString("Nota8"));
                np.setN9(rs.getString("Nota9"));
                //np.setNombre(rs.getString("Asignatura_NombreAsign"));
            }
            s.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return np;
    }

    public PondPracticas ponderacionPrac(String nombre) {
        //datosAsignatura dAsignatura = new datosAsignatura();
        PondPracticas pp = new PondPracticas();
        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();
            //MODIFICAR LA SITANXIS DE LA CONSULTA SQL
            String sql = "SELECT pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8,pp9 FROM PondPrac WHERE Asignatura_NombreAsign ='" + nombre + "'";
            rs = s.executeQuery(sql);
            //rs.getString("Nombre")
            while (rs.next()) {

                pp.setPp1(rs.getString("pp1"));
                pp.setPp2(rs.getString("pp2"));
                pp.setPp3(rs.getString("pp3"));
                pp.setPp4(rs.getString("pp4"));
                pp.setPp5(rs.getString("pp5"));
                pp.setPp6(rs.getString("pp6"));
                pp.setPp7(rs.getString("pp7"));
                pp.setPp8(rs.getString("pp8"));
                pp.setPp9(rs.getString("pp9"));
                //pp.setNombre(rs.getString("Asignatura_NombreAsign"));
            }
            s.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pp;
    }

    public PondTeoricas ponderacionTeo(String nombre) {
        //datosAsignatura dAsignatura = new datosAsignatura();
        PondTeoricas pt = new PondTeoricas();
        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();
            //MODIFICAR LA SITANXIS DE LA CONSULTA SQL
            String sql = "SELECT pt1,pt2,pt3,pt4,pt5,pt6,pt7,pt8,pt9 FROM PondTeo WHERE Asignatura_NombreAsign ='" + nombre + "'";
            rs = s.executeQuery(sql);
            //rs.getString("Nombre")
            while (rs.next()) {

                pt.setPt1(rs.getString("pt1"));
                pt.setPt2(rs.getString("pt2"));
                pt.setPt3(rs.getString("pt3"));
                pt.setPt4(rs.getString("pt4"));
                pt.setPt5(rs.getString("pt5"));
                pt.setPt6(rs.getString("pt6"));
                pt.setPt7(rs.getString("pt7"));
                pt.setPt8(rs.getString("pt8"));
                pt.setPt9(rs.getString("pt9"));
                //pt.setNombre(rs.getString("Asignatura_NombreAsign"));
            }
            s.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pt;
    }

    public NotasFinales notasFinales(String nombre) {
        //datosAsignatura dAsignatura = new datosAsignatura();
        NotasFinales nf = new NotasFinales();
        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();
            //MODIFICAR LA SITANXIS DE LA CONSULTA SQL
            String sql = "SELECT Fpractico, Fteorico, Pgeneral FROM NotasFinales WHERE Asignatura_NombreAsign ='" + nombre + "'";
            rs = s.executeQuery(sql);
            //rs.getString("Nombre")
            while (rs.next()) {

                nf.setNfp(rs.getString("Fpractico"));
                nf.setNft(rs.getString("Fteorico"));
                nf.setPg(rs.getString("Pgeneral"));

                //pt.setNombre(rs.getString("Asignatura_NombreAsign"));
            }
            s.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return nf;
    }

    public String verTipo(String nombre) {

        String tipo = "";
        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();// ESTO ME FALTABA
            String query = "SELECT Tip_Aprovacion FROM Asignatura WHERE NombreAsign ='" + nombre + "'";
            rs = s.executeQuery(query);

            while (rs.next()) {
                tipo = rs.getString("Tip_Aprovacion");
            }

            rs.close();
            s.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }

        return tipo;
    }

    public void borrarRamo(String nombre) {

        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();
            String query = "DELETE FROM NotasFinales WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(query);

            String g = "DELETE FROM pondteo WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(g);

            String p = "DELETE FROM pondprac WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(p);

            String o = "DELETE FROM notasteorico WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(o);

            String u = "DELETE FROM notaspractico WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(u);

            String i = "DELETE FROM asignatura WHERE NombreAsign='" + nombre + "'";
            s.executeUpdate(i);
            JOptionPane.showMessageDialog(null, "Asignatura Eliminada!");
            //rs.close();
            s.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }

    }
    public void actualizarRamoConNuevosDatos(String nombre) {

        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();
            String query = "DELETE FROM NotasFinales WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(query);

            String g = "DELETE FROM pondteo WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(g);

            String p = "DELETE FROM pondprac WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(p);

            String o = "DELETE FROM notasteorico WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(o);

            String u = "DELETE FROM notaspractico WHERE Asignatura_NombreAsign='" + nombre + "'";
            s.executeUpdate(u);

           // JOptionPane.showMessageDialog(null, "Asignatura Eliminada!");
            //rs.close();
            s.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }

    }
    
/*
    public int datosPaginaPrincipal() {

        //String tipo = "";
        int cont = 0;
        try {
            cn = Conexion.Enlace(cn);
            s = cn.createStatement();// ESTO ME FALTABA
            String ramos = "SELECT * FROM Asignatura";
            rs = s.executeQuery(ramos);
            //COUNT(NombreAsign) sirve para obtener la cantidad de datos que estan en una determinada clumna, pero no funciona aqui
            while (rs.next()) {
                //System.out.println("gg");
                cont++;
                //System.out.println("gg");
            }
            String horas = "SELECT COUNT(NombreAsign) FROM Asignatura";
            rs = s.executeQuery(horas);

            rs.close();
            s.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! " + e);
            System.out.println("Error = " + e);
        }

        return cont;
    }

    */
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void validarTextoNombre(String cadena, java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != KeyEvent.VK_SPACE) && !(c >= '1' && c <= '9')) {
            evt.consume();
        }
        if (cadena.length() >= 14) {
            evt.consume();
        }
    }

    public void validarCantNotas(String cadena, java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!(c >= '1' && c <= '9')) {
            evt.consume();
        }
        if (cadena.length() >= 1) {
            evt.consume();
        }
    }

    public void validarCantHoras(String cadena, java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!(c >= '1' && c <= '9')) {
            evt.consume();
        }
        if (cadena.length() >= 1) {
            evt.consume();
        }
    }

    public void validacionNotas(String cadena, java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!(c >= '0' && c <= '9') && c != '.') {
            evt.consume();
        }
        if ((c == '.') && cadena.contains(".")) {
            evt.consume();
        }
        if (cadena.length() >= 3) {
            evt.consume();
        }
    }

    public void validacionPonderaciones(String cadena, java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!(c >= '0' && c <= '9') && c != '.') {
            evt.consume();
        }
        if ((c == '.') && cadena.contains(".")) {
            evt.consume();
        }
        if (cadena.length() >= 5) {
            evt.consume();
        }
    }

    public double truncarNum(double a) {
        double aux = Math.rint(a * 100) / 100;
        a = aux;
        return a;
    }

    public void mensajeError() {
        JOptionPane.showMessageDialog(null, "Por favor llene todos los recuadros",
                "ERROR", JOptionPane.WARNING_MESSAGE);
    }

    //utilizando como parametro el arreglo de notas y el arreglo ponderaciones ya sea teorico o practico
    //calcula el promedio de la parte teorica o parte practica
    public double calcPromedioSimple(double[] notas, double[] pond) {
        double cont = 0;
        for (int i = 0; i < notas.length; i++) {
            cont = cont + (notas[i] * (pond[i] / 100));
        }
        double prom = cont;
        return prom;
    }

    //suma las ponderaciones
    public double sumPond(double pondT[]) {
        double cont2 = 0;
        for (int i = 0; i < pondT.length; i++) {
            cont2 = cont2 + pondT[i];
        }
        return cont2;
    }

    //valida la nota para que sea mayor a 0 o menor a 7 y devuelve un boolean
    public boolean validarNota(double notaT[]) {
        boolean pasa = true;
        for (int i = 0; i < notaT.length; i++) {
            if (notaT[i] > 7 || notaT[i] <= 0) {
                pasa = false;
            }
        }
        return pasa;
    }

    //valida la ponderacion para que sea mayor a 0 devuelve un boolean
    public boolean validarPond(double pondT[]) {
        boolean pasa = true;
        for (int i = 0; i < pondT.length; i++) {
            if (pondT[i] <= 0) {
                pasa = false;
            }
        }
        return pasa;
    }

    //utilizando como parametro el arreglo de notas y el arreglo ponderaciones ya sea teorico o practico
    // y recorre los arreglos hasta la penultima posicion ya que la ultima nota es la incognita que necesitamos calcular
    //calcula nota faltante en la ultima prueba para pasar con un 4
    public double calcNotaFaltante(double[] notas, double[] pond) {
        double cont = 0;
        int tam = notas.length;
        for (int i = 0; i < tam - 1; i++) {
            cont = cont + (notas[i] * (pond[i] / 100));
        }
        double nf = (4 - cont) / (pond[tam - 1] / 100);

        return nf;
    }

    //utilizando como parametro el arreglo de notas y el arreglo ponderaciones ya sea teorico o practico
    // y recorre los arreglos hasta la penultima posicion ya que la ultima nota es la incognita que necesitamos calcular
    //calcula nota necesaria para rendir examen    
    public double calcNotaPExamen(double[] notas, double[] pond) {
        double cont = 0;
        int tam = notas.length;
        for (int i = 0; i < tam - 1; i++) {
            cont = cont + (notas[i] * (pond[i] / 100));
        }
        double nf = (3.6 - cont) / (pond[tam - 1] / 100);

        return nf;
    }

    //calcula el promedio total del ramo usando el promedio teorico, promedio practico ,
    //ponderacion practica y ponderacion teorica
    // y retorna un double con el promedio general del ramo
    public double calcPromedioTotal(double promT, double promP, double pondT, double pondP) {

        double promFT = promT * (pondT / 100);
        double promFP = promP * (pondP / 100);
        double promFinal = promFT + promFP;

        return promFinal;
    }

}
