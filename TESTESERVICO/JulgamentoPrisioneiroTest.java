package br.com.fiap.explorer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JulgamentoPrisioneiroTest {

	private JulgamentoPrisioneiro julg;
	
	
	// QUANDO CONDENAÇÃO FOR INDIVIDUAL - 5 ANOS DE PENA
	@Test
	public void calculaPenaCondenacaoMutua() {
	
		int resultadoObtido = julg.calculaPena("Culpado", "Culpado");
		
		assertEquals(5, resultadoObtido);
	}

	// QUANDO CONDENAÇÃO FOR INDIVIDUAL - 10 ANOS DE PENA
	@Test
	public void calculaCondenacaoIndividual() {
	
		int resultadoObtido = julg.calculaPena("Culpado", "Inocente");
		
		assertEquals(10, resultadoObtido);
	}
	
	
	// QUANDO CONDENAÇÃO FOR CUMPLICE - 1 ANOS DE PENA
	@Test
	public void calculaCondenacaoCumplice() {
	
		int resultadoObtido = julg.calculaPena("Inocente", "Culpado");
		
		assertEquals(1, resultadoObtido);
	}
	
	
	
	// QUANDO CONDENAÇÃO FOR INOCENTE - SEM PENA
	@Test
	public void calculaCondenacaoInocente() {
	
		int resultadoObtido = julg.calculaPena("Inocente", "Inocente");
		
		assertEquals(0, resultadoObtido);
	}
	

}
