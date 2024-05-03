package exercicios10;

import java.util.Scanner;

//Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número para ser gerado as contas da tabuada: ");
		int numero = sc.nextInt();

		System.out.println("Tabuada de multiplicação de " + numero + ":");

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

		sc.close();
	}

}