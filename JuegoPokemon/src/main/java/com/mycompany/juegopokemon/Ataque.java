

package com.mycompany.juegopokemon;


import exceptions.AtaqueFallidoException;

import java.util.Random;

public class Ataque {
    
private String nombre;
    private int precision; // porcentaje entre 0 y 100
    private ReglaDeDanio reglaDeDanio;

    public Ataque(String nombre, int precision, ReglaDeDanio reglaDeDanio) {
        this.nombre = nombre;
        this.precision = precision;
        this.reglaDeDanio = reglaDeDanio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecision() {
        return precision;
    }

    public int ejecutar() throws AtaqueFallidoException {
        Random random = new Random();
        int tirada = random.nextInt(100) + 1; // 1 a 100
        if (tirada > precision) {
            throw new AtaqueFallidoException(nombre + " falló!");
        }
        return reglaDeDanio.calcularDanio();
    }

    @Override
    public String toString() {
        return nombre + " (Precisión: " + precision + "%)";
    }
}



