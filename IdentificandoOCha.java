package com.beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdentificandoOCha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer tipoCha = 0;
        Integer respostasCertas = 0;
        List<Integer> competidores = new ArrayList<>(5);


        System.out.println("Tipo do chá: ");
        tipoCha = sc.nextInt();
        if (tipoCha > 4) {
            System.out.println("Informe um número de 1 á 4");
        } else {
            System.out.println("Informe a resposta sobre o tipo do chá: ");

            for (int i = 0; i <= 4; i++) {
                int respostas = sc.nextInt();
                competidores.add(respostas);
            }

            for (int competidor : competidores) {
                if (competidor == tipoCha) {
                    respostasCertas++;
                }
            }
            System.out.println(respostasCertas);
        }
    }
}
