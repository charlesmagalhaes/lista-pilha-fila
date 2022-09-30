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

						break;
					
					case 2: 
						agendaPessoal.pop();
					
						break;
					case 3: 
						
						System.out.println("Tamanho lista: "+agendaPessoal.size());
						System.out.println("-----------------------------------------------------");
					
						break;
					case 4: 
						
						System.out.println(agendaPessoal.top().nome);
						System.out.println("-----------------------------------------------------");
						
						break;
					
					default:
						System.out.println("Opção invalidade!!!");
						System.out.println("-----------------------------------------------------");
				}
					
			
		}while (opcao != 0); 
		
		
						


	}

}
