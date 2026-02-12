package entities;

public class CurrencyConverter {
	public static final double IOF=6.00;
	
	public static double conversor(double dolar, int quantity) {
		double valor = dolar * quantity;
		double valorFinal = valor + valor * IOF / 100;
		return valorFinal;
	}
	
}
