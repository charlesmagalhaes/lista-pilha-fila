
public class aplicacao {

	public static void main(String[] args) {
		
		ListaPilha agendaPessoal = new ListaPilha(5);
		
		
		agendaPessoal.push(new Agenda("Matheus", 532548777));
		agendaPessoal.push(new Agenda("João", 325484848));
		agendaPessoal.push(new Agenda("Fernando", 377484848));
		agendaPessoal.push(new Agenda("Heidy", 377484848));
		agendaPessoal.push(new Agenda("Reginaldo", 377484848));
		
		
		System.out.println(agendaPessoal.push(new Agenda("Paulo", 325484848)));

	}

}
