package test;

import org.junit.Assert;
import org.junit.Test;

import main.CalculadoraFacade;

public class TestCalculadoraFacade {

	private static final double TOLERANCIA = 0.00001;
	CalculadoraFacade facade = new CalculadoraFacade();

	@Test
	public void testSomar() {
		Assert.assertEquals(0, facade.somar(0, 0), TOLERANCIA);
		Assert.assertEquals(0, facade.somar(1, -1), TOLERANCIA);
		Assert.assertEquals(0, facade.somar(-1, 1), TOLERANCIA);
		Assert.assertEquals(2000, facade.somar(1000, 1000), TOLERANCIA);
		Assert.assertEquals(1, facade.somar(0.5, 0.5), TOLERANCIA);
		Assert.assertEquals(0.44, facade.somar(0.22, 0.22), TOLERANCIA);
		Assert.assertEquals(3001, facade.somar(1500.5, 1500.5), TOLERANCIA);
		Assert.assertEquals(5100.5, facade.somar(5000, 100.5), TOLERANCIA);
	}

	@Test
	public void testSubtrair() {
		Assert.assertEquals(0, facade.subtrair(0, 0), TOLERANCIA);
		Assert.assertEquals(10.5, facade.subtrair(10.5, 0), TOLERANCIA);
		Assert.assertEquals(-10.5, facade.subtrair(0, 10.5), TOLERANCIA);
		Assert.assertEquals(10001, facade.subtrair(10000, -1), TOLERANCIA);
		Assert.assertEquals(-0.1, facade.subtrair(500.6, 500.7), TOLERANCIA);
		Assert.assertEquals(1000, facade.subtrair(990, -10), TOLERANCIA);
	}

	@Test
	public void testDividir() {
		Assert.assertEquals(0, facade.dividir(0, 2), TOLERANCIA);
		Assert.assertEquals(5, facade.dividir(10, 2), TOLERANCIA);
		Assert.assertEquals(1, facade.dividir(2, 2), TOLERANCIA);
		Assert.assertEquals(0.5, facade.dividir(1, 2), TOLERANCIA);
		Assert.assertEquals(500.25, facade.dividir(1000.5, 2), TOLERANCIA);
		Assert.assertEquals(125.1, facade.dividir(250.2, 2), TOLERANCIA);
		Assert.assertEquals(2, facade.dividir(100, 50), TOLERANCIA);
		Assert.assertEquals(25, facade.dividir(150, 6), TOLERANCIA);
	}

	@Test
	public void testMultiplicar() {
		Assert.assertEquals(0, facade.multiplicar(0, 2), TOLERANCIA);
		Assert.assertEquals(4, facade.multiplicar(2, 2), TOLERANCIA);
		Assert.assertEquals(-4, facade.multiplicar(-2, 2), TOLERANCIA);
		Assert.assertEquals(-2000, facade.multiplicar(-1, 2000), TOLERANCIA);
		Assert.assertEquals(25, facade.multiplicar(5, 5), TOLERANCIA);
		Assert.assertEquals(-400, facade.multiplicar(10, -40), TOLERANCIA);
		Assert.assertEquals(0, facade.multiplicar(0, 0), TOLERANCIA);
		Assert.assertEquals(5, facade.multiplicar(2.5, 2), TOLERANCIA);
		Assert.assertEquals(41, facade.multiplicar(20.5, 2), TOLERANCIA);
	}

	@Test
	public void testEhPar() {
		Assert.assertTrue(facade.ePar(0));
		Assert.assertTrue(facade.ePar(2));
		Assert.assertTrue(facade.ePar(-2));
		Assert.assertTrue(facade.ePar(20));
		Assert.assertTrue(facade.ePar(1024));
		Assert.assertTrue(facade.ePar(-1024));

		Assert.assertFalse(facade.ePar(1));
		Assert.assertFalse(facade.ePar(11));
		Assert.assertFalse(facade.ePar(-1));
		Assert.assertFalse(facade.ePar(1023));
		Assert.assertFalse(facade.ePar(23));
	}

	@Test
	public void testPotencia() {
		Assert.assertEquals(8, facade.potencia(2, 3), TOLERANCIA);
		Assert.assertEquals(1, facade.potencia(2, 0), TOLERANCIA);
		Assert.assertEquals(10, facade.potencia(10, 1), TOLERANCIA);
		Assert.assertEquals(10000, facade.potencia(10, 4), TOLERANCIA);
		Assert.assertEquals(25, facade.potencia(5, 2), TOLERANCIA);
	}
	
	@Test
	public void testFatorial() {
		Assert.assertEquals(3628800, facade.fatorial(10), TOLERANCIA);
	}
}
