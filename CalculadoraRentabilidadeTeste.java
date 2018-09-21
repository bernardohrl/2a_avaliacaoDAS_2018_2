package tests;
import org.junit.Assert.*;
import org.junit.Test;

import app.CalculadoraRentabilidade;
import static org.junit.Assert.assertEquals;

public class CalculadoraRentabilidadeTeste {

	double dias1 = 60;
	double inicial1 = 1000; 
	double txAnual1 = 8.5;
	double aliquota1 = 22.5;
	
	double dias2 = 120;
	double inicial2 = 500; 
	double txAnual2 = 8.0;
	double aliquota2 = 22.5;
	

	
	@Test
	public void testRendimentoBruto1() {
		double rendBruto = CalculadoraRentabilidade.rendimentoBruto(dias1, inicial1, txAnual1, aliquota1);
		
		assertEquals(rendBruto, 13.97, 0.1);
	}
	
	@Test
	public void testImpostoRenda1() {
		double rendBruto = CalculadoraRentabilidade.impostoRenda(dias1, inicial1, txAnual1, aliquota1);
		
		assertEquals(rendBruto, 3.14, 0.1);
	}
	
	@Test
	public void testRendimentoLiquido1() {
		double rendBruto = CalculadoraRentabilidade.rendimentoLiquido(dias1, inicial1, txAnual1, aliquota1);
		
		assertEquals(rendBruto, 1.3972, 0.1);
	}
	
	
	@Test
	public void testRendimentoBruto2() {
		double rendBruto = CalculadoraRentabilidade.rendimentoBruto(dias2, inicial2, txAnual2, aliquota2);
		
		assertEquals(rendBruto, 13.15, 0.1);
	}
	
	@Test
	public void testImpostoRenda2() {
		double rendBruto = CalculadoraRentabilidade.impostoRenda(dias2, inicial2, txAnual2, aliquota2);
		
		assertEquals(rendBruto, 2.96, 0.1);
	}
	
	@Test
	public void testRendimentoLiquido2() {
		double rendBruto = CalculadoraRentabilidade.rendimentoLiquido(dias2, inicial2, txAnual2, aliquota2);
		
		assertEquals(rendBruto, 2.6301, 0.01);
	}
}
