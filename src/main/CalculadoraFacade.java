package main;

public class CalculadoraFacade {

	Calculadora calculadora = new Calculadora();
	
	public double somar(double valor1, double valor2) {
		return calculadora.somar(valor1, valor2);
	}

	public double multiplicar(double valor1, double valor2) {
		return calculadora.multiplicar(valor1, valor2);
	}

	public double dividir(double valor1, double valor2) {
		return calculadora.dividir(valor1, valor2);
	}

	public double subtrair(double valor1, double valor2) {
		return calculadora.subtrair(valor1, valor2);
	}

	public boolean ePar(int valor) {
		return calculadora.ePar(valor);
	}

	public double potencia(double base, int potencia) {
		return calculadora.potencia(base, potencia);
	}

	public long fatorial(int valor) {
		return calculadora.fatorial(valor);
	}
}
