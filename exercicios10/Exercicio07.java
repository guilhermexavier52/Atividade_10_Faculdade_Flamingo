package exercicios10;

/* Apresentar os resultados das potências de 3, variando
 *do expoente 0 até o expoente 15. Deve ser considerado 
 *que qualquer número elevado a zero é 1, e elevado a 
 *1 é ele próprio. Observe que neste exercício não pode 
 *ser utilizado o operador de exponenciação do portuguol (^).*/

public class Exercicio07 {

	public static void main(String[] args) {
		System.out.println("Potências de 3:");

		System.out.println("3^0 = 1");

		System.out.println("3^1 = 3");

		int resultado = 3;
		for (int i = 2; i <= 15; i++) {
			resultado *= 3;
			System.out.println("3^" + i + " = " + resultado);
		}
	}
}
