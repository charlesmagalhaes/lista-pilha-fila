
public class ListaPilha {
	
	int topo;
	int tam_max;
	private Agenda[] itens;
	
	public ListaPilha(int tamanho) {

		this.topo = 0;
		this.tam_max = tamanho;
		this.itens = new Agenda[tamanho];
	}

}
