package exercicios10;

// Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

public class Exercicio03 {
	public static void main(String[] args) {

		int valorFinal = 0;

        for (int i = 1; i <= 100; i++) {
            valorFinal += i;
        }

        System.out.println("A soma dos cem primeiros números inteiros de 1 a 100 é: " + valorFinal);
	}

}
