package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int revision = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un texto: ");
        String texto = entrada.nextLine();
        System.out.print("Intenta adivinar la letra del texto: ");
        char letra = entrada.nextLine().charAt(0);

        for (int i = 0; i < texto.length(); i++) {

        }

        entrada.close();
    }
}
