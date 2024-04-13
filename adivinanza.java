package Logica;

import java.util.Random;
import java.util.Scanner;

public class adivinanza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        // Generar un número entero aleatorio entre 0 y 100
        int numeroAleatorio = random.nextInt(100+1);
        int intentos = 0;
        int numero;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        do {
            System.out.print("Ingrese un número entre 0 y 100: ");
            numero = teclado.nextInt();

            intentos++;

            if (numero < numeroAleatorio) {
                System.out.println("El número que ingresaste es menor al número secreto. Intenta de nuevo.");
            } else if (numero > numeroAleatorio) {
                System.out.println("El número que ingresaste es mayor al número secreto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intento(s).");
            }
        } while (intentos != 5);
        System.out.println("Se te acabaron los 5 intentos disponibles pruebe a la proxima");
        teclado.close(); // Cerrar el scanner al finalizar
    }//Main
}//class
