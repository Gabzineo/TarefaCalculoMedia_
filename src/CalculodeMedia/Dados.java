package CalculodeMedia;

import java.util.Scanner;

public class Dados {
    private Scanner scanner;

    public Dados(Scanner scanner){
        this.scanner = scanner;
    }

    public void Validanota(Calculadora notas){
        System.out.println("Sua primeira nota é: ");
        notas.setNota1(scanner.nextDouble());

        System.out.println("Sua segunda nota é: ");
        notas.setNota2(scanner.nextDouble());

        System.out.println("Sua terceira nota é: ");
        notas.setNota3(scanner.nextDouble());

        System.out.println("Sua quarta nota é: ");
        notas.setNota4(scanner.nextDouble());
    }

}
