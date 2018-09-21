package tests;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraRentabilidadeTeste {

	int dias = 60;
	double inicial = 10000; 
	double txAnual = 8.5;
	double aliquota = 22.5;
	
	@Test
	public void testRendimentoBruto() {
		double rendBruto = CalculadoraRentabilidade.rendimentoBruto(dias, inicial, txAnual, aliquota);
		
		assertEquals(rendBruto, 13.97, 0.1);
	}
	
	@Test
	public void testImpostoRenda() {
		double rendBruto = CalculadoraRentabilidade.impostoRenda(dias, inicial, txAnual, aliquota);
		
		assertEquals(rendBruto, 3.14, 0.1);
	}
	
	@Test
	public void testRendimentoLiquido() {
		double rendBruto = CalculadoraRentabilidade.rendimentoLiquido(dias, inicial, txAnual, aliquota);
		
		assertEquals(rendBruto, 1.0829, 0.1);
	}
}
