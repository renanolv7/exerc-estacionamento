package estacionamento.service;

import estacionamento.model.Carro;
import estacionamento.model.Vaga;

public class EstacionamentoService {

	public void estacionar(Carro carro, Vaga vaga) {
		System.out.println("-- INFORMACAO SOBRE A VAGA  --");
		if(!vaga.getLivre()) {
			vaga.setCarro(carro);
			vaga.setLivre(false);
			System.out.println(" Carro " + vaga.getCarro().getMarca() + " de placa " + vaga.getCarro().getPlaca() + " estacionado na vaga " + vaga.getNumero() +  vaga.getAndar());
		} else {
			System.out.println("A vaga numero " + vaga.getNumero() + " do " + vaga.getAndar() + " ja esta ocupada!");
		}
	}
	
	public void desocuparVaga(Vaga vaga) {
		vaga.setLivre(true);
		vaga.setCarro(null);
		
		System.out.println(" A vaga de numero " + vaga.getNumero() + " do"  + vaga.getAndar() + " foi desocupada.");
	}
	
}
