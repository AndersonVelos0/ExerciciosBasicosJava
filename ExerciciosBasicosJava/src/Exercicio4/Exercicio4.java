package Exercicio4;

import java.util.Scanner;

/*4. Desenvolver um programa que leia a altura de 15 pessoas. Este
 *programa deverá calcular e mostrar:
 *a. A menor altura do grupo;
 *b. A maior altura do grupo; 
 */
public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double altura;
		double maiorAlt = Double.MIN_VALUE;
		double menorAlt = Double.MAX_VALUE;

		for (int i = 0; i <= 14; i++) {
			System.out.print("Digite a sua " + (i + 1) + "ª altura:");
			altura = sc.nextDouble();

			if (altura > maiorAlt) {
				maiorAlt = altura;
			}
			if (altura < menorAlt) {
				menorAlt = altura;
			}
		}
		System.out.println("A maior altura é: " + maiorAlt);
		System.out.println("A menor altura é: " + menorAlt);

		sc.close();
	}

}
