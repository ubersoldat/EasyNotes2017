/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Felipe
 */
public class datosAsignatura {

    private String Nombre;
    private String Tipo;
    private int EVteorica;
    private int EVpractica;
    private double PondtTeorica;
    private double PondtPratica;
    private int Horas;
    private int Nivel;

    public datosAsignatura() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getEVteorica() {
        return EVteorica;
    }

    public void setEVteorica(int EVteorica) {
        this.EVteorica = EVteorica;
    }

    public int getEVpractica() {
        return EVpractica;
    }

    public void setEVpractica(int EVpractica) {
        this.EVpractica = EVpractica;
    }

    public double getPondtTeorica() {
        return PondtTeorica;
    }

    public void setPondtTeorica(double PondtTeorica) {
        this.PondtTeorica = PondtTeorica;
    }

    public double getPondtPratica() {
        return PondtPratica;
    }

    public void setPondtPratica(double PondtPratica) {
        this.PondtPratica = PondtPratica;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }
}
