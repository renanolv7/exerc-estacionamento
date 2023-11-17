package estacionamento.model;

public class Vaga {
	// Contador inicializado com 1, para dizer minha quantidade de vagas
	private static Integer contador = 1;
	private Integer id;
	private String andar;
	private String numero;
	private Boolean livre;
	private Carro carro;
	
	public Vaga(String andar, String numero, Boolean livre, Carro carro) {
		this.andar = andar;
		this.numero = numero;
		this.livre = livre;
		this.carro = carro;
		this.id = contador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Boolean getLivre() {
		return livre;
	}
	
	public void setLivre(Boolean livre) {
		this.livre = livre;
	}
	
	public Carro getCarro() {
		return carro;
	}
	
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
}
