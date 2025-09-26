
package com.mycompany.juegopokemon;

import java.util.List;


public abstract class JuegoPokemon {
    

  
// Nombre del Pokémon
    protected String nombre;
    protected int vidaMaxima;
    protected int vidaActual;
    protected String tipo;
    protected List<Ataque> ataques;

    // Constructor inicia los atributos
    public JuegoPokemon(String nombre, int vidaMaxima, String tipo, List<Ataque> ataques) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaMaxima; 
        this.tipo = tipo;
        this.ataques = ataques;
    }

    public String getNombre() {
        return nombre;
    }
    public int getVidaActual() {
        return vidaActual;
    }
    public String getTipo() {
        return tipo;
    }
    public List<Ataque> getAtaques() {
        return ataques;
    }
    public boolean estaVivo() {
        return vidaActual > 0;
    }

    // Aplica daño al Pokémon, reduciendo su vida actual
    public void recibirDanio(int danio) {
        vidaActual -= danio;
        if (vidaActual < 0) vidaActual = 0; 
    }

    // Restaura la vida del Pokémon a su valor máximo
    public void curar() {
        vidaActual = vidaMaxima;
    }

    public abstract void mostrarHabilidadesUnicas();

    // Representacion en texto del estado del Pokemon
    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - HP: " + vidaActual + "/" + vidaMaxima;
    }
}
