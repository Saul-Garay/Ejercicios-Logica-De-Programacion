package palabraInvertida;

import java.util.Scanner;

public class PalabraInvertida {

	public static void main(String[] args) {
		
		Scanner ejercicio6 = new Scanner(System.in);
		
		
        String frase;
        String fraseInvertida = "\n";
        
        System.out.println("Ingresa la frase: ");
        frase = ejercicio6.nextLine();
        
        for (int i = frase.length()-1; i >= 0; i--){
            fraseInvertida += frase.charAt(i);
        }
        
        System.out.println("La frase invertida es: " + fraseInvertida);	

	}

}
