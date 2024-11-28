
public class Persona {
	
	String nome;
	String indirizzo;
	public Persona(String nome, String indirizzo) {
		
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}
	
	public void stampa() {
		System.out.println("Sono una persona");
	}

}
