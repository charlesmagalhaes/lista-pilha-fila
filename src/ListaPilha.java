
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

}
