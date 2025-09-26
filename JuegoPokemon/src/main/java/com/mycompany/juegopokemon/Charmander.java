

package com.mycompany.juegopokemon;

import java.util.Arrays;


public class Charmander extends JuegoPokemon{
    

public Charmander() {
        super("Charmander", 100, "Fuego", Arrays.asList(
            new Ataque("Arañazo", 90, () -> 10),
            new Ataque("Ascuas", 80, () -> 15),
            new Ataque("Lanzallamas", 70, () -> 25),
            new Ataque("Garra Dragón", 60, () -> 30)
        ));
    }


   
@Override
    public void mostrarHabilidadesUnicas() {
        System.out.println("Charmander es un Pokémon de tipo Fuego. Sus ataques queman al enemigo.");
    }
}
