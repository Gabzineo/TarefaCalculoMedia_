package CalculodeMedia;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);

        EscanerDados dados = new EscanerDados(s);
        Calculadora notas = new Calculadora();

        dados.validaNota(notas);
        notas.CalcularMedia();

        System.out.println("Sua nota é " + notas.CalcularMedia());
    }
}
