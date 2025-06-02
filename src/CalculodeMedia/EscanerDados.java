package CalculodeMedia;

import java.util.Scanner;

public class EscanerDados {
    private Scanner scanner;

   public EscanerDados(Scanner scanner){
       this.scanner = scanner;
   }

    public void validaNota(Calculadora notas){
       System.out.println("Sua primeira nota é: ");
       notas.setNota1(scanner.nextDouble());

        System.out.println("Sua primeira nota é: ");
        notas.setNota2(scanner.nextDouble());

        System.out.println("Sua primeira nota é: ");
        notas.setNota3(scanner.nextDouble());

        System.out.println("Sua primeira nota é: ");
        notas.setNota4(scanner.nextDouble());
    }
}
