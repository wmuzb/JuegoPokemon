

package com.mycompany.juegopokemon;

import java.util.Arrays;

public class Squirtle extends JuegoPokemon{
    
public Squirtle() {
        super("Squirtle", 100, "Agua", Arrays.asList(
            new Ataque("Placaje", 90, () -> 10),
            new Ataque("Pistola Agua", 80, () -> 15),
            new Ataque("Burbuja", 70, () -> 20),
            new Ataque("Hidrobomba", 60, () -> 30)
        ));
    }


@Override
    public void mostrarHabilidadesUnicas() {
        System.out.println("Squirtle es un tipo Agua. Sus ataques pueden mojar al enemigo.");
    }


}
