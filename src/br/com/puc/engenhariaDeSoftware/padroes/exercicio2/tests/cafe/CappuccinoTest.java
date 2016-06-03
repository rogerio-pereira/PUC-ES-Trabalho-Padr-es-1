package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.tests.cafe;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.cafe.Cappuccino;

public class CappuccinoTest {
	private Cappuccino cafe;
	
	@Before
	public void configuraClasseDeTeste()
	{
		cafe = new Cappuccino();
	}
	
	@Test
	public void calculaValorCafe()
	{
		assertEquals(cafe.calculaPreco(), 6.3, 0.00);
	}
}
