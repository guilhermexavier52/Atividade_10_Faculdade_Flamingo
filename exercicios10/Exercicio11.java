package exercicios10;

/*Elaborar um programa que apresente como resultado 
 *o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10.*/

public class Exercicio11 {

	public static void main(String[] args) {
		System.out.println("Fatorial dos valores ímpares de 1 a 10:");

		for (int i = 1; i <= 10; i++) {

			if (i % 2 != 0) {
				int fatorial = somaFatorial(i);
				System.out.println(i + " = " + fatorial);
			}
		}
	}

	public static int somaFatorial(int numero) {
		int resultado = 1;

		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;

	}

}
