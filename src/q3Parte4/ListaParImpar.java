package q3Parte4;

public class ListaParImpar {
	
	int topoPar=0;
	int topoImpar=0;
	
	private int[] listaPar = new int[10];
	private int[] listaImpar = new int[10];
	
	public String push(int valor) {
		String mensagem;
		if(full()) {
			mensagem = "Lista cheia, essa foi programa somente para 10 numeros";
			return mensagem;
		}
		if((valor%2)==0 || valor ==0) {
			listaPar[this.topoPar] = valor;
			this.topoPar++;
			mensagem = "item inserido com sucesso!";
		}else {
			listaImpar[this.topoImpar] = valor;
			this.topoImpar++;
			mensagem = "item inserido com sucesso!";
		}
		
		
		return mensagem;
	}

	private boolean full() {
		return this.topoImpar+this.topoPar == 10;
	}
	
	public String exibir() {
		String lista="";
		for(int i=0; i< this.topoImpar;i++) {
			if(i == 0) {
				lista = "Lista dos Numeros Impar(es)";
			}
			lista += "\n"+listaImpar[i];
					
		}
		
		for(int i=0; i< this.topoPar;i++) {
			if(i == 0) {
				lista += "\nLista dos Numeros Par(es)";
			}
			lista += "\n"+listaPar[i];
		}
		
		return lista;
	}

}
