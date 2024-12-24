package Sistema;

public class Livro {
	
	private String titulo, autor;
	private boolean aluguel;

	public Livro(String titulo, String autor) {
		this.titulo=titulo;
		this.autor=autor;
		this.aluguel=true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isAluguel() {
		return aluguel;
	}

	public void setAluguel(boolean aluguel) {
		this.aluguel = aluguel;
	}
}
