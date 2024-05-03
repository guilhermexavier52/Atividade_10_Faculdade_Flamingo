package exercicios10;

import java.util.Scanner;

/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base
qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E 
o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).*/

public class Exercicio08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a base (B): ");
		int numero01 = sc.nextInt();

		System.out.print("Digite o expoente (E): ");
		int numero02 = sc.nextInt();

		int resultado = 1;

		for (int i = 1; i <= numero02; i++) {
			resultado *= numero01;
		}

		System.out.println("O resultado de " + numero01 + "^" + numero02 + " é: " + resultado);

		sc.close();

	}

}
