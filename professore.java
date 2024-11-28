
public class professore extends Persona {

	double stipendio;
	public professore(String nome, String indirizzo, double stipendio) {
		
		super(nome, indirizzo);
		this.stipendio = stipendio;
		
		
	}
	@Override
	public String toString() {
		return "professore [stipendio=" + stipendio + ", nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}

}
