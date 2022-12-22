package ejercicio9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        HashMap<String, String> traduccion = new HashMap<String, String>();
  
        traduccion.put("Visitante", "Outlander");
        traduccion.put("Eso", "It");
        traduccion.put("Resplandor", "Shining");
        traduccion.put("Misery", "Miseria");
        traduccion.put("Doctor", "Doctor");
        traduccion.put("Sueño", "Dream");
        traduccion.put("Locura", "Madness");
        traduccion.put("Montaña", "Mountain");
        traduccion.put("Villano", "Villian");
        traduccion.put("Dios", "God");
        traduccion.put("Guerra", "War");
        traduccion.put("Control", "Control");
        traduccion.put("Café", "Coffe");
        traduccion.put("Botella", "Bottle");
        traduccion.put("Agua", "Water");
        traduccion.put("Refresco", "Soda");
        traduccion.put("Computadora", "Computer");
        traduccion.put("Audifonos", "Headphones");
        traduccion.put("Laberinto", "Maze");
        traduccion.put("Corredor", "Runner");
        
        String entradaTeclado = "";
        System.out.println ("Introduzca la palabra que quiere traducir:" + entradaTeclado);
        String entradaTeclado1 = sc.nextLine();
        
       
        String definition = traduccion.get(entradaTeclado1);
        if (definition != null) {
          System.out.println(definition);
        } else {
          System.out.println("Lo siento, esa palabra no está en el diccionario.");
        }

          
   }
}