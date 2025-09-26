

package com.mycompany.juegopokemon;

import java.util.Scanner;


public class InicioJuego 
          
{
public static void main(String[] args) {
    System.out.println("Bienvenido al Juego Pokémon");
   
}
    public static String pedirNombreJugador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al Juego Pokémon!");
        System.out.print("Ingresa tu nombre: ");
        return scanner.nextLine();
    }
}

