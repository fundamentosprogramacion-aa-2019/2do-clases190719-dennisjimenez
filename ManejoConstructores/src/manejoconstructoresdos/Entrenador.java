/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructoresdos;

/**
 *
 * @author dljimenez2
 */
public class Entrenador {

    private String nombre;
    private int edad;
    private String deporte;
    private double salario;
    private Equipo equipo;

    public Entrenador(String n, int m, String d, double s, Equipo e) {
        establecerNombre(n);
        establecerEdad(m);
        establecerDeporte(d);
        establecerSalario(s);
        establecerEquipo(e);
    }

    public void establecerNombre(String n) {

        nombre = n;
    }

    public void establecerEdad(int m) {

        edad = m;
    }

    public void establecerDeporte(String d) {

        deporte = d;
    }

    public void establecerSalario(double s) {

        salario = s;
    }

    public void establecerEquipo(Equipo e) {

        equipo = e;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerDeporte() {
        return deporte;
    }

    public double obtenerSalario() {
        return salario;
    }

    public Equipo obtenerEquipo() {
        return equipo;
    }

    public String toString() {
        String cadena = String.format("Entrenador:\n\tNombre: %s\n\tDeporte:"
                + " %s\n\tEquipo: %s\n\tProvincia: %s\n",
                obtenerNombre(),
                obtenerDeporte(),
                obtenerEquipo().obtenerNombre(),
                obtenerEquipo().obtenerCiudad().obtenerProvincia());
        return cadena;
    }
}
