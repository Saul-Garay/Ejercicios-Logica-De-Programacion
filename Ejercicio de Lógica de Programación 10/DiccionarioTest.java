package diccionarioInglesEspañolTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class DiccionarioTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        HashMap<String, String> traduccion = new HashMap<String, String>();
        Random generator = new Random();

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

        Set<String> keySet = traduccion.keySet();
        List<String> keyList = new ArrayList<>(keySet);
        
        int respuestaCorrecta = 0;
        for(int i = 0; i < 5; i++) {
            int aleatorio = new Random().nextInt(keyList.size());
            	String palabraEspañol = keyList.get(aleatorio);
            	String palabraIngles = traduccion.get(palabraEspañol);
            	System.out.println("La traducción para " + palabraEspañol + " es:");
            	
            	String respuesta = sc.nextLine();
            
            if(respuesta.equals(palabraIngles)) respuestaCorrecta++;
        }
        System.out.println("Respuestas correctas: " + respuestaCorrecta);
    }
}
