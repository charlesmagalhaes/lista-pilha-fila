package q3Parte4;

import java.util.Scanner;

public class aplicacaoQ3P4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ListaParImpar listaNumeros = new ListaParImpar();
		
		for(int i=0; i < 10;i++) {
			
			System.out.print("Digite o "+NumerosOrdinais.values()[i]+" numero: ");
			int valor = ler.nextInt();
			listaNumeros.push(valor);
		}
		
		System.out.println("-----------------------------------");
		System.out.println(listaNumeros.exibir());
		
		String teste = "D";
		System.out.println(teste.toLowerCase() == teste);
		
		ler.close();
	}

}
