package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Calculadora {
    public static void main(String[] args) {
        int opcao;
        double valor1;
        double valor2;
        Scanner sc = new Scanner(System.in);
        Calcular operacao = null;
        System.out.println("OPCAO (1) Somar");
        System.out.println("OPCAO (2) Subtrair");
        System.out.println("OPCAO (3) Multiplicar");
        System.out.println("OPCAO (4) Dividir");

        System.out.println("Escolha uma opcao: ");
        opcao = sc.nextInt();

        System.out.println("Digite o primeiro valor:");
        valor1 = sc.nextDouble();
        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextDouble();

        switch (opcao) {
            case 1 -> operacao = new CalculoSomar();
            case 2 -> operacao = new CalculoSubtrair();
            case 3 -> operacao = new CalculoMultiplicacao();
            case 4 -> operacao = new CalculoDivisao();
        }
        Calculo(operacao, valor1, valor2);
        sc.close();
    }
     public static void Calculo(Calcular operacao, double val1, double val2){
        double resultadoOperacao;
        resultadoOperacao = operacao.calcular(val1, val2);
        
        System.out.println("Resultado:" + resultadoOperacao + "\n");   
    }
}
