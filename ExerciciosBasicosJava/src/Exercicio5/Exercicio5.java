package Exercicio5;

import java.util.Scanner;
/*5. Escrever um algoritmo que leia uma quantidade desconhecida de
 *números e conte quantos deles estão nos seguintes intervalos: [0-25],
 * [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando
 * for lido um número negativo.
 */

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int quant1 = 0;
		int quant2 = 0;
		int quant3 = 0;
		int quant4 = 0;

		while (numero >= 0) {
			System.out.print("Digite numeros de 0 a 100: ");
			numero = sc.nextInt();

			if (numero >= 0 && numero <= 25) {
				quant1 = quant1 + 1;
			}

			if (numero >= 26 && numero <= 50) {
				quant2 = quant2 + 1;
			}

			if (numero >= 51 && numero <= 75) {
				quant3 = quant3 + 1;
			}

			if (numero >= 76 && numero <= 100) {
				quant4 = quant4 + 1;
			}
		}

		System.out.println("Quantidade de numeros no intervalo [0 a 25] " + quant1);
		System.out.println("Quantidade de numeros no intervalo [25 a 50] " + quant2);
		System.out.println("Quantidade de numeros no intervalo [50 a 75] " + quant3);
		System.out.println("Quantidade de numeros no intervalo [75 a 100] " + quant4);

		sc.close();
	}

}
