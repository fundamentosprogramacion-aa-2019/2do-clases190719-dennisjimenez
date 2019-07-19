/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructores;

/**
 *
 * @author dljimenez2
 */
public class Entrenador {

    private String nombre;
    private int edad;
    private String deporte;

    public Entrenador() {
        establecerNombre("Luis");
        establecerEdad(20);
        establecerDeporte("Voley");
    }

    public Entrenador(String n, int e, String d) {
        establecerNombre(n);
        establecerEdad(e);
        establecerDeporte(d);
    }

    public void establecerDeporte(String d) {
        deporte = d;
    }

    public void establecerNombre(String e) {
        nombre = e;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public String obtenerDeporte() {
        return deporte;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String toString() {
        String cadena = String.format("Entrenador %s - Edad: %d - Deporte: %s",
                obtenerNombre(), obtenerEdad(), obtenerDeporte());
        return cadena;
    }
}
