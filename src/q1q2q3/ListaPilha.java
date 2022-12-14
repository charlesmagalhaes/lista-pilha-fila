package q1q2q3;

public class ListaPilha {
	
	int topo;
	int tam_max;
	private Agenda[] itens;
	
	public ListaPilha(int tamanho) {

		this.topo = 0;
		this.tam_max = tamanho;
		this.itens = new Agenda[tamanho];
	}

	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public int getTam_max() {
		return tam_max;
	}

	public void setTam_max(int tam_max) {
		this.tam_max = tam_max;
	}
	
	public String push(Agenda contato) {
		String mensagem;
		if(this.topo <  this.tam_max) {
			itens[this.topo] = contato;
			this.topo++;
			mensagem = "Contato inserido com sucesso!!!";
		}else {
			duplicarPilha();
			itens[this.topo] = contato;
			this.topo++;
			mensagem = "Contato inserido com sucesso!!!";
		}

		return mensagem;
	}
	
	public void duplicarPilha() {
		Agenda[] listaTemporaria = itens;
		tam_max *=2;
		itens = new Agenda[tam_max];
		for (int i=0; i < listaTemporaria.length;i++) {
			itens[i] = listaTemporaria[i];
		}
		
	}
	
	public void pop() {
		this.topo--;
	}
	
	public boolean empty() {
		return this.topo == 0;
	}
	
	public boolean full() {
		return this.topo == this.tam_max;
	}
	
	public Agenda top() {
		return itens[this.topo-1];
		
	}
	
	public int size() {
		return this.topo;
	}
	
	public String changeTopBottom() {
		String mensagem;
	
		if(this.topo == 1) {
			mensagem = "Existem somente um elemento na pilha";
		} else if(empty()) {
			mensagem = "Pilha vazia";
		}else {
			Agenda itemTemporario = itens[this.topo-1];
			itens[this.topo-1] = itens[0];
			itens[0] = itemTemporario;
			
			mensagem = "Troca feita com sucesso!!!";
		}
		return mensagem;
	}

}
