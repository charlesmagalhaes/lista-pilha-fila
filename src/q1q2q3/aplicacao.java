package q1q2q3;
import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ListaPilha agendaPessoal = new ListaPilha(5);
		
		
		agendaPessoal.push(new Agenda("Matheus", 532548777));
		agendaPessoal.push(new Agenda("João", 325484848));
		agendaPessoal.push(new Agenda("Fernando", 377484848));
		agendaPessoal.push(new Agenda("Heidy", 377484848));
		agendaPessoal.push(new Agenda("Reginaldo", 377484848));
		
		System.out.println(agendaPessoal.changeTopBottom());
		System.out.println("-----------------------------------------------------");
		
		int opcao;
		do {
			
			
			System.out.print("PROGRAMA PILHA \n0: Sair "
					+ "\n1: Inserir itens "
					+ "\n2: Remover itens "
					+ "\n3: Imprimir Tamanho "
					+ "\n4: Imprimir Item Topo \nEntre com a opção desejada: "
				);
				opcao = ler.nextInt();
				System.out.println("\n-----------------------------------------------------");
				switch (opcao) {
					case 0: 
						
						System.out.println("Fim do programa!");
						break;
						
					case 1: 
						
						System.out.print("Digite o nome do contato: ");
						String nome = ler.next();
						System.out.print("Digite o numero do contato: ");
						long numero = ler.nextLong();
						agendaPessoal.push(new Agenda(nome,numero));
						
						System.out.println("-----------------------------------------------------");
						System.out.print("clique na tecla p, após enter para prosseguir: ");
						ler.next();

						break;
					
					case 2: 
						if(!agendaPessoal.empty()) {
							agendaPessoal.pop();
							System.out.println("Item removido com sucesso!!!");
							System.out.println("-----------------------------------------------------");
						}else {
							
							System.out.println("A lista está vazia, assim não tem como remover");
							System.out.println("-----------------------------------------------------");
						}
						
						System.out.print("clique na tecla p, após enter para prosseguir: ");
						ler.next();
						break;
					case 3: 
						
						System.out.println("Tamanho lista: "+agendaPessoal.size());
						System.out.println("-----------------------------------------------------");
						
						System.out.print("clique na tecla p, após enter para prosseguir: ");
						ler.next();
						break;
					case 4: 
						if(agendaPessoal.empty()) {
							System.out.println("A lista está vazia");
						}else {
							System.out.println("Topo da lista: "+agendaPessoal.top().nome+" - "+agendaPessoal.top().tel);
							System.out.println("-----------------------------------------------------");
						}
						
						
						System.out.print("clique na tecla p, após enter para prosseguir: ");
						ler.next();
						break;
					
					default:
						System.out.println("Opção invalidade!!!");
						System.out.println("-----------------------------------------------------");
						System.out.print("clique na tecla p, após enter para prosseguir: ");
						ler.next();
				}
					
			
		}while (opcao != 0); 
		
		
						
		ler.close();

	}

}
