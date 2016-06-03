package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.tests.cafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.cafe.CafeComLeite;

public class CafeComLeiteTest {
	private CafeComLeite cafe;
	
	@Before
	public void configuraClasseDeTeste()
	{
		cafe = new CafeComLeite();
	}
	
	@Test
	public void calculaValorCafe()
	{
		assertEquals(cafe.calculaPreco(), 4.8, 0.00);
	}
}
