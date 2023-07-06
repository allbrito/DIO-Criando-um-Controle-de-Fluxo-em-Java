package br.com.allan;

public class ParametrosInvalidosException extends Exception	{

    public void tratamento() {
        System.out.println("O segundo numero deve ser maior que o primeiro");
    }
}