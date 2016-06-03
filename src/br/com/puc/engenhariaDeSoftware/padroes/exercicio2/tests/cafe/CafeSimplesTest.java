package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.tests.cafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.cafe.CafeSimples;

public class CafeSimplesTest {
	private CafeSimples cafe;
	
	@Before
	public void configuraClasseDeTeste()
	{
		cafe = new CafeSimples();
	}
	
	@Test
	public void calculaValorCafe()
	{
		assertEquals(cafe.calculaPreco(), 1.2, 0.00);
	}
}
