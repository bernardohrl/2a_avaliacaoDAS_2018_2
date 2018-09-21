package tests;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;

import app.CalculadoraRentabilidade;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CalculadoraRentabilidadeTeste {
	
	@Parameter(0)
	public double dias;
	@Parameter(1)
	public double inicial;
	@Parameter(2)
	public double txAnual;
	@Parameter(3)
	public double aliquota;
	@Parameter(4)
	public double rendBruto;
	@Parameter(5)
	public double impostoRenda;
	@Parameter(6)
	public double rendLiquido;

	
	@Parameters
	public static Collection<Object[]> params() {
		Object[][] values = {{1000,100,7.5,15.0,20.55,3.08,20.5479},
							 {60,1000,8.5,22.5,13.97,3.14,1.3972},
							 {120,500,8.5,22.5,13.97,3.14,2.7945}};
		
		return Arrays.asList(values);
	}
	

	
	@Test
	public void testRendimentoBruto() {
		double recived = CalculadoraRentabilidade.rendimentoBruto(dias, inicial, txAnual, aliquota);
		
		assertEquals(recived, rendBruto, 0.1);
	}
	
	@Test
	public void testImpostoRenda() {
		double recived = CalculadoraRentabilidade.impostoRenda(dias, inicial, txAnual, aliquota);
		
		assertEquals(recived, impostoRenda, 0.1);
	}
	
	@Test
	public void testRendimentoLiquido() {
		double recived = CalculadoraRentabilidade.rendimentoLiquido(dias, inicial, txAnual, aliquota);
		
		assertEquals(recived, rendLiquido, 0.1);
	}
}
