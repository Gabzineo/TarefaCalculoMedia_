package CalculodeMedia;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Dados notas = new Dados(scanner);
        Calculadora media = new Calculadora();

        notas.Validanota(media);
        media.CalcularMedia();
        double resultado = media.getMedia();

        if(resultado >=7){
            System.out.println("Você foi aprovado");
        }else if(resultado >= 5){
            System.out.println("Você está de Recuperação");
        }else if(resultado <=4.9){
            System.out.println("Você foi Reprovado");
        }else {
            System.out.println("ERRO DE DIGITAÇÃO, MEDIA INVALIA! DIGITE NOVAMENTE");
        }
    }
}
