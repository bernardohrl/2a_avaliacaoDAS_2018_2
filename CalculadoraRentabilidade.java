package app;

public class CalculadoraRentabilidade {
	
	public static double rendimentoBruto(double dias, double inicial, double txAnual, double aliquota) {
		return inicial*((txAnual/100)*dias/365);
	}
	
	public static double impostoRenda(double dias, double inicial, double txAnual, double aliquota) {
		return (inicial*((txAnual/100)*dias/365))*aliquota/100;
	}
	
	public static double rendimentoLiquido(double dias, double inicial, double txAnual, double aliquota) {
		double totalFinal = inicial + (inicial*((txAnual/100)*dias/365));

		return ((totalFinal/inicial) * 100) - 100;
	}
}
