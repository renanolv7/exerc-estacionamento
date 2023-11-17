package estacionamento.service;

import java.time.Duration;

import estacionamento.model.Periodo;


public class PeriodoService {
	
	private boolean Horas;
	
	public Integer verificaTempoTotal(Periodo periodo) {
		Integer diferenca = 0;
		Duration duracao = Duration.between(periodo.getHoraInicial(), periodo.getHoraFinal());
		if(duracao.toHoursPart() > 0) {
			this.setHoras(true);
			diferenca = duracao.toHoursPart();
		}else if(duracao.toMinutesPart() < 60){
			this.setHoras(false);
			diferenca = duracao.toMinutesPart();
		}
		return diferenca;
	}
	
	public Double calculaValorTotal(Periodo periodo) {
		Double valorTotal = 0.0;
		if((verificaTempoTotal(periodo) <= 15)&&(!Horas)){
			valorTotal = 0.0;
		}else if((verificaTempoTotal(periodo) >= 15)&&(!Horas)) {
			valorTotal = periodo.getValorHora();
		}else if(Horas){
			valorTotal = verificaTempoTotal(periodo) * periodo.getValorHora();
		}
		return valorTotal;
	}

	
	// Getters e setters 
	public boolean Horas() {
		return Horas;
	}

	public void setHoras(boolean Horas) {
		this.Horas = Horas;
	}
	
	

}
