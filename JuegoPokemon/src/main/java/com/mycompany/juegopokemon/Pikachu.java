
package com.mycompany.juegopokemon;

import java.util.Arrays;

public class Pikachu extends JuegoPokemon{
    
public Pikachu() {
        super("Pikachu", 100, "Eléctrico", Arrays.asList(
            new Ataque("Impactrueno", 90, () -> 10),
            new Ataque("Electrobola", 80, () -> 15),
            new Ataque("Rayo", 70, () -> 25),
            new Ataque("Trueno", 60, () -> 30)
        ));
    }

   
@Override
    public void mostrarHabilidadesUnicas() {
        System.out.println("Pikachu es un Pokemon tipo electrico. Sus ataques pueden detener al enemigo.");
    }


}
