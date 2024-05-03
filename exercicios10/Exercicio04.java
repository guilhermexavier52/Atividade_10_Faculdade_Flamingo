package exercicios10;

//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

public class Exercicio04 {

	public static void main(String[] args) {
		  int somaDosPares = 0;

	        for (int i = 1; i <= 500; i++) {
	            if (i % 2 == 0) {
	            	somaDosPares += i;
	            }
	        }

	        System.out.println("O somatório dos valores pares de 1 até 500 é: " + somaDosPares);
	    }
	}

