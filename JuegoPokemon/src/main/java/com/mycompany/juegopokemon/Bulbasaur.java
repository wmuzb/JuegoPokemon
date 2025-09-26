package com.mycompany.juegopokemon;

import java.util.Arrays;

public class Bulbasaur extends JuegoPokemon{
    
public Bulbasaur() {
        super("Bulbasaur", 100, "Planta", Arrays.asList(
            new Ataque("Placaje", 90, () -> 10),
            new Ataque("Latigazo", 80, () -> 15),
            new Ataque("Drenadoras", 70, () -> 20),
            new Ataque("Rayo Solar", 60, () -> 30)
        ));
    }

    
@Override
    public void mostrarHabilidadesUnicas() {
        System.out.println("Bulbasaur es un Pokémon tipo Planta. Sus ataques pueden absorber energia del enemigo.");
    }
}



