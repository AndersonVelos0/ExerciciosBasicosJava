package Exercicio1;

/* 1. Supondo que a população de um país A seja de 55.000 habitantes e tem
 * uma taxa de crescimento mensal de 0,3%. A população de um país B tem
 * 160.000 habitantes e tem uma taxa de crescimento mensal de 0,18%.
 * Faça um programa que calcule e escreva o número de meses necessários
 * para que a população do país A ultrapasse ou iguale a população do país
 * B, mantidas as taxas de crescimento.
 */

public class Exercicio1 {

	double populacaoA = 55000;
	double taxaCrescMensalA = 0.0003;

	double populacaoB = 160000;
	double taxaCrescMensalB = 0.0018;

	int meses = 0;

	while (populacaoA < populacaoB) {

		populacaoA = populacaoA + (populacaoA * taxaCrescMensalA);
		populacaoB = populacaoB + (populacaoB * taxaCrescMensalB);
		meses++;
	}

	System.out.println("O numero de meses necessário para a Populacao A ultrapassar "
			+ "ou  igualar a populacao B é:  "+meses+" meses");
}

}