package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.tests.cafe;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.cafe.Cafe;

public class CafeTest {
	private Cafe cafe;
	
	@Before
	public void configuraClasseDeTeste()
	{
		cafe = new Cafe();
	}
	
	@Test
	public void calculaValorCafe()
	{
		assertEquals(cafe.calculaPreco(), 0.2, 0.00);
	}
}
