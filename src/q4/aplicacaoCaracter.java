package q4;

import java.util.Scanner;

public class aplicacaoCaracter {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String sair = "999";
		
		ListaCaracteres listaCaracter = new ListaCaracteres();
		
		String caracter;

		do {
			
			System.out.print("Digite um caracter ou para sair digite 999: ");
			caracter = ler.next();
			if(caracter.compareTo(sair) != 0) {
				listaCaracter.push(caracter);
			}
			
		}while(caracter.compareTo(sair) != 0);
		
		System.out.println(listaCaracter.exibir());
		
		
		System.out.println("Fim do programa!!");
		ler.close();

	}

}
