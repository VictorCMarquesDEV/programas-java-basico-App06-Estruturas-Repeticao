package app006;

import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		int cc = 0;
		while (cc < 10) {
			cc++;
			if (cc == 2 || cc == 3 || cc == 4) {
				continue;
			} else if (cc == 7){
				break;
			}
			System.out.println("Cambalhota " + cc);
		}
		
		System.out.println("============================");
		
		int num, s = 0;
		String resp = null;
		try (Scanner teclado = new Scanner(System.in)) {
			do {
				System.out.print("Digite um número: ");
				num = teclado.nextInt();
				s += num;
				System.out.print("Deseja continuar? [S/N]: ");
				resp = teclado.next();
			} while(resp.equals("S"));
		}
		System.out.println("A soma de todos os valores é " + s);
		
		System.out.println("============================");
		
		for(int camb=1; camb<=10; camb++) {
			System.out.println("Cambalhota " + camb);
		}
	}

}
