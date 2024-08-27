package Ejercicios.GPT;

import javax.swing.*;
import java.util.Scanner;

public class Juego_Adivinar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 100);
        int numero = 0;
        int intentos = 0;

        while (aleatorio != numero) {
            intentos++;
            System.out.println("indique un numero");
            numero = entrada.nextInt();

            if (aleatorio<numero){

                System.out.println("El numero es menor");

            }else if (aleatorio>numero){

                System.out.println("El numero es mayor");

            } else if (aleatorio==numero) {

                System.out.println("el numero es correcto");

            }

        }


    }
}
