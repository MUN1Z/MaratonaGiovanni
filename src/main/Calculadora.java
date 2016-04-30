package main;

public class Calculadora {
	
	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}

	public double dividir(double valor1, double valor2) {
		return valor1 / valor2;
	}

	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}

	public boolean ePar(int valor) {
		return valor % 2 == 0;
	}

	public double potencia(double base, int potencia) {
		return Math.pow(base, potencia);
	}

	public long fatorial(int valor) {
		
		int num, fat = 1;
        int cont = 1;

        do{
            num = valor;
            
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            cont++;
            
       }while(cont < 2);
    
		return fat;
	}
	
}
