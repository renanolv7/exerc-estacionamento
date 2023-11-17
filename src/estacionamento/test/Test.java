package estacionamento.test;

import java.time.LocalTime;

import estacionamento.model.Carro;
import estacionamento.model.Periodo;
import estacionamento.model.Vaga;
import estacionamento.service.EstacionamentoService;
import estacionamento.service.PeriodoService;

public class Test {
	private static PeriodoService periodoService = new PeriodoService();
	private static EstacionamentoService estacionamentoService = new EstacionamentoService();
	private static final Double valorHora = 15.0;
	
	
	public static void main(String[] args) {
		// Carro 1 e primeira vaga ocupada
		Carro carroUm = new Carro("AXN-3442", "Chevrolet");
		Vaga vagaUm = new Vaga(" andar 2", "6", false, carroUm);
		LocalTime entrada = LocalTime.of(10, 00);
		LocalTime saida = LocalTime.of(10, 30);
		Periodo periodoUm = new Periodo(entrada, saida, valorHora, vagaUm, carroUm);
		
		// Chamando método estacionar
		estacionamentoService.estacionar(carroUm, vagaUm);
		
		// Chamando métodos para verificar tempo e calcular valor
		periodoService.verificaTempoTotal(periodoUm);
		periodoService.calculaValorTotal(periodoUm);

		// Chamando método desocupar vaga
		estacionamentoService.desocuparVaga(vagaUm);
		System.out.println();
		
		
		imprimirDados(periodoUm);
		
		System.out.println();
		System.out.println();
		
		
		// Instanciando carro 2 e segunda vaga ocupada
		Carro carroDois = new Carro("BRA-2E19", "Volkswagen");
		Vaga vagaDois = new Vaga(" andar 4", "3", false, carroDois);
		LocalTime entrada1 = LocalTime.of(19, 59);
		LocalTime saida1 = LocalTime.of(23, 12);
		Periodo periodoDois = new Periodo(entrada1, saida1, valorHora, vagaDois, carroDois);
		
		
		estacionamentoService.estacionar(carroDois, vagaDois);
		
		periodoService.verificaTempoTotal(periodoDois);
		periodoService.calculaValorTotal(periodoDois);
		
		estacionamentoService.desocuparVaga(vagaDois);
		System.out.println();
		
		// Imprimindo dados do periodo dois 
		imprimirDados(periodoDois);
		
	}
	
	private static void imprimirDados(Periodo periodo) {
		System.out.println(" -- INFORMAÇÃO/ATUALIZAÇÃO DO CARRO E VAGA  --");
		System.out.println((" Placa e marca do carro: " + periodo.getCarro().getPlaca()+"\t"+periodo.getCarro().getMarca()));
		System.out.println(" Andar e numero da vaga: " + periodo.getVaga().getAndar()+"\t"+periodo.getVaga().getNumero());
		if(!periodoService.Horas()) {
			System.out.println(" Tempo total: " + periodoService.verificaTempoTotal(periodo)+" Minuto(s).");
		}else {
			System.out.println(" Tempo total: " + periodoService.verificaTempoTotal(periodo)+" Hora(s).");
		}
			System.out.println(" Valor Total: " + periodoService.calculaValorTotal(periodo));
	}
	
}
