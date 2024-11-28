import java.util.ArrayList;

public class UsaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona p1 = new Persona("Rossi", "Via Roma");
		Persona p2 = new studente("Bianchi", "Via torino", "1234");
		
		//System.out.println(p1);
		//System.out.println(p2);
		
		ArrayList <Persona> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		
		for (Persona pers: lista) {
			
			pers.stampa();
		}
	}

}
