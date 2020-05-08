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

		System.out.printf("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.printf("Quantidade de cervejas: ");
		qtdCerveja = sc.nextInt();
		System.out.printf("Quantidade de refrigerantes: ");
		qtdRefri = sc.nextInt();
		System.out.printf("Quantidade de espetinhos: ");
		qtdEspeto = sc.nextInt();
		
		
		sc.close();

	}

}
