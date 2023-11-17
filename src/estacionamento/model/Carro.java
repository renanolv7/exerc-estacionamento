package estacionamento.model;

public class Carro {
	
	private static Integer contador = 1;
	private Integer id;
	private String placa;
	private String marca;
	
	//Construtor para carro 
	public Carro(String placa, String marca){
		this.id = contador;
		this.marca = marca;
		this.placa = placa;
		// Aqui irá fazer um incremento de 1 em 1 para os meus carros
		Carro.contador += 1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
