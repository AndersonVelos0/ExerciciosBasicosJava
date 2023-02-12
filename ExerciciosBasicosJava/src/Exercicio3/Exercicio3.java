package Exercicio3;

/*3. Desenvolver um programa que efetue a soma de todos os números
 *ímpares que são múltiplos de três e que se encontram no conjunto dos
 *números de 1 até 500. 
 */

public class Exercicio3 {

	public static void main(String[] args) {

		int soma = 0;

		System.out.println("Os numeros impares e multiplos de 3 sao: ");
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 1 && i % 3 == 0) {
				System.out.println(i);
				soma = soma + i;
			}
		}
		System.out.println("A soma de todos os numeros impares e multiplos de tres e: " + soma);
	}

}
