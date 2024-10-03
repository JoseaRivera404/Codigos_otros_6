/*
 * El programa crea y muestra un arreglo con 20 números enteros aleatorios y pregunta al usuario
 * que numeros quiere resaltar (encerrar entre corchetes), si los multiplos de 5 o los multiplos de 7
 * depende de lo que el usuario seleccione el programa imprimira todos los numéros pero ahora algunas
 * estaran resaltados. 
 */

import java.util.Scanner;
//Por buenas prácticas cambiamos el nombre de la clase
public class Codigo6 {
	// Se creó el método main
	public static void main(String[] args) {
		// Se corrigió la inicialización del array
		int[] n = new int[20];
		// Se agrego un scanner
		Scanner sc = new Scanner(System.in);
		// Se corrigió el incremento de i
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      // Se corrigió la sintaxis del sysout
	      System.out.print(n[i] + " ");
	    }
	    // Se corrigió la sintaxis del sysout
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    // Se utilizó el scanner para recibir la entrada del teclado
	    int opcion = sc.nextInt();
	    // Se corrigió el uso del operador ternario
	    int multiplo = (opcion == 1) ? 5 : 7;
	    // Se cambio el uso del foreach y se cambio el tipo de variable de e
	    for(Integer e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	        // Se cerró correctamente el if
	      }
	       else {
	    	// Se corrigió la sintaxis del sysout
	        System.out.print(e + " ");
	      }
	    }
	    // Se cerró el Scanner
	    sc.close();

	}
}
