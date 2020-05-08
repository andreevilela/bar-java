package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int qtdCerveja, qtdRefri, qtdEspeto;
		double ingresso, consumo, total;
		String couvert;
		
		System.out.printf("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.printf("Quantidade de cervejas: ");
		qtdCerveja = sc.nextInt();
		System.out.printf("Quantidade de refrigerantes: ");
		qtdRefri = sc.nextInt();
		System.out.printf("Quantidade de espetinhos: ");
		qtdEspeto = sc.nextInt();
		
		if (sexo == 'M' || sexo == 'm') {
			ingresso = 10.00;
		} else {
			ingresso = 8.00;
		}

		consumo = 5.00 * qtdCerveja + 3.00 * qtdRefri + 7.00 * qtdEspeto;

		if (consumo < 30.00) {
			total = ingresso + consumo + 4.00;
			couvert = "Couvert = R$ 4.00";
		} else {
			total = ingresso + consumo;
			couvert = "Isento de Couvert";
		}
		
		System.out.println();
		System.out.println("RELATÓRIO: ");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		System.out.println(couvert);
		System.out.printf("Ingresso = R$ %.2f%n%n", ingresso);
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		
		sc.close();

	}

}
