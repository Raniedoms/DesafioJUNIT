package br.com.fiap.explorer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JulgamentoPrisioneiroTest {

	private JulgamentoPrisioneiro julg;
	
	
	// QUANDO CONDENA플O FOR INDIVIDUAL - 5 ANOS DE PENA
	@Test
	public void calculaPenaCondenacaoMutua() {
	
		int resultadoObtido = julg.calculaPena("Culpado", "Culpado");
		
		assertEquals(5, resultadoObtido);
	}

	// QUANDO CONDENA플O FOR INDIVIDUAL - 10 ANOS DE PENA
	@Test
	public void calculaCondenacaoIndividual() {
	
		int resultadoObtido = julg.calculaPena("Culpado", "Inocente");
		
		assertEquals(10, resultadoObtido);
	}
	
	
	// QUANDO CONDENA플O FOR CUMPLICE - 1 ANOS DE PENA
	@Test
	public void calculaCondenacaoCumplice() {
	
		int resultadoObtido = julg.calculaPena("Inocente", "Culpado");
		
		assertEquals(1, resultadoObtido);
	}
	
	
	
	// QUANDO CONDENA플O FOR INOCENTE - SEM PENA
	@Test
	public void calculaCondenacaoInocente() {
	
		int resultadoObtido = julg.calculaPena("Inocente", "Inocente");
		
		assertEquals(0, resultadoObtido);
	}
	

}
