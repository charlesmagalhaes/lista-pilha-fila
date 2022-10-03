package q4;

public class ListaCaracteres {
	
	int topoMaius=0;
	int topoMinus=0;
	
	private String[] listaMaius = new String[5];
	private String[] listaMinus = new String[5];
	
	public String push(String caracter) {
		String mensagem;
		if(this.topoMaius == listaMaius.length) {
			duplicarListaMaius();
		};
		
		if(this.topoMinus == listaMinus.length) {
			duplicarListaMinus();
		};
		
		if((caracter.toLowerCase() == caracter)) {
			listaMaius[this.topoMaius] = caracter;
			this.topoMaius++;
			mensagem = "Caracter inserido!";
		}else {
			listaMinus[this.topoMinus] = caracter;
			this.topoMinus++;
			mensagem = "Caracter inserido!";
		}
		
		
		return mensagem;
	}
	
	public String exibir() {
		String lista="";
		for(int i=this.topoMaius; i> 0;i--) {
			if(i == this.topoMaius) {
				lista = "Lista caracter minuscula(s)";
			}
			lista += "\n"+listaMaius[i-1];
					
		}
		
		for(int i=this.topoMinus; i> 0;i--) {
			if(i == this.topoMinus) {
				lista += "\nLista caracter(s) maiuscula(s)";
			}
			lista += "\n"+listaMinus[i-1];
		}
		
		return lista;
	}
	
	
	
	public void duplicarListaMaius() {
		String[] listaTemporariaMai = listaMaius;
		listaMaius = new String[listaMaius.length*2];
		for (int i=0; i < listaTemporariaMai.length;i++) {
			listaMaius[i] = listaTemporariaMai[i];
		}
		
	}
	
	public void duplicarListaMinus() {
		String[] listaTemporariaMin = listaMinus;
		listaMinus = new String[listaMinus.length*2];
		for (int i=0; i < listaTemporariaMin.length;i++) {
			listaMinus[i] = listaTemporariaMin[i];
		}
		
	}

}
