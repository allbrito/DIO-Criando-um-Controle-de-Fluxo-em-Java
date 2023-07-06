package br.com.allan;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = sc.nextInt();

        try {
            contar(numero1, numero2);
        } catch (br.com.allan.ParametrosInvalidosException e) {
            e.tratamento();
        }
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero2 < numero1) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = numero2 - numero1;
            for (int i = 1; i<=contagem ; i++) {
                System.out.println(i);
            }
        }
    }
}