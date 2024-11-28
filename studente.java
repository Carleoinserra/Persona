
public class studente extends Persona {

	String matricola;
	
	public studente(String nome, String indirizzo, String matricola) {
		super(nome, indirizzo);
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "studente [matricola=" + matricola + ", nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public void stampa() {
		
		System.out.println("Sono uno studente");
	}

}
