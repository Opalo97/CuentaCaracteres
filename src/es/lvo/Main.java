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
            if (letra == texto.charAt(i)) {
                revision += 1;
            }
        }

        if (revision  != 0) {
            System.out.println("Número de veces que aparece el carácter " + letra + " : " + revision);
        } else {
            System.out.println("El caracter " + letra + "no está en el texto");
        }

        entrada.close();
    }
}
