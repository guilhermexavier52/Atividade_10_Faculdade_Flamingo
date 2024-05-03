package exercicios10;

//Apresentar os quadrados dos números inteiros de 15 a 200.
public class Exercicio01 {
	public static void main(String[] args) {
		for (int i = 15; i <= 200; i++) {
			int resultado = i * i;
			System.out.println("O quadrado de " + i + " é: " + resultado);
		}
	}
}
