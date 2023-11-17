package estacionamento.model;

import java.time.LocalTime;

public class Periodo {
	private static Integer contador = 1;
	private Integer id;
	private LocalTime horaInicial;
	private LocalTime horaFinal;
	private Double valorHora;
	private Vaga vaga;
	private Carro carro;
	
	public Periodo(LocalTime horaInicial, LocalTime horaFinal, Double valorHora, Vaga vaga, Carro carro) {
		this.id = contador;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		this.valorHora = valorHora;
		this.vaga = vaga;
		this.carro = carro;
		Periodo.contador += 1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalTime getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(LocalTime horaInicial) {
		this.horaInicial = horaInicial;
	}

	public LocalTime getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(LocalTime horaFinal) {
		this.horaFinal = horaFinal;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	
	
}
