package br.com.puc.engenhariaDeSoftware.padroes.exercicio1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio1.Aluno;

public class AlunoTest {
	private static Aluno aluno;
	
	@Before
	public void configuraClasseDeTeste()
	{
		aluno = new Aluno() {
			@Override
			public boolean isAprovado() {
				return false;
			}
		};
	}

	@Test
	public void lancaNotaMenorQueZero() 
	{
		try
		{
			aluno.lancaNota(-1);
		}
		catch(RuntimeException e)
		{
			assertEquals(e.getMessage(), "Nota não pode ser menor que 0");
		}
	}
	
	@Test
	public void lancaNotaMaiorQueDez()
	{
		try
		{
			aluno.lancaNota(13);
		}
		catch(RuntimeException e)
		{
			assertEquals(e.getMessage(), "Nota não pode ser maior que 0");
		}
	}
	
	@Test
	public void lancaNotaCorreta()
	{
		aluno.lancaNota(5.0);
		assertEquals(aluno.getNota(), 5.0, 0.0);
	}
	
	@Test
	public void lancaDuasNotasCorretas()
	{
		aluno.lancaNota(3.0);
		aluno.lancaNota(5.5);
		assertEquals(aluno.getNota(), 5.5, 0.0);
	}
	
	@Test
	public void lancaAulaNegativa()
	{
		try
		{
			aluno.lancaFaltas(-1, 0);
		}
		catch(RuntimeException e)
		{
			assertEquals(e.getMessage(), "Não pode ser lançado numeros nulos de aulas");
		}
	}
	
	@Test
	public void lancaAulaZerada()
	{
		try
		{
			aluno.lancaFaltas(0, 0);
		}
		catch(RuntimeException e)
		{
			assertEquals(e.getMessage(), "Não pode ser lançado numeros nulos de aulas");
		}
	}
	
	@Test
	public void lancaVariasAulas()
	{
		aluno.lancaFaltas(2, 0);
		
		assertEquals(aluno.getAulas(), 2);
	}
	
	@Test
	public void lancaMaisAulas()
	{
		aluno.lancaFaltas(2, 0);
		aluno.lancaFaltas(1, 0);
		aluno.lancaFaltas(5, 0);
		
		assertEquals(aluno.getAulas(), 8);
	}
	
	@Test
	public void lancaFaltaNegativa()
	{
		try
		{
			aluno.lancaFaltas(2, -1);
		}
		catch(RuntimeException e)
		{
			assertEquals(e.getMessage(), "Não pode ser lançado numeros nulos de faltas");
		}
	}
	
	@Test
	public void lancaZeroFaltas()
	{
		aluno.lancaFaltas(2, 0);
		
		assertEquals(aluno.getFaltas(), 0);
	}
	
	@Test
	public void lancaUmaFalta()
	{
		aluno.lancaFaltas(2, 2);
		
		assertEquals(aluno.getFaltas(), 2);
	}
	
	@Test
	public void lancaVariasFaltas()
	{
		aluno.lancaFaltas(2, 2);
		aluno.lancaFaltas(1, 1);
		aluno.lancaFaltas(5, 0);
		
		assertEquals(aluno.getFaltas(), 3);
	}
	
	@Test(expected=RuntimeException.class)
	public void CalculaFrequenciaSemAulas()
	{
		aluno.getFrequencia();
	}
	
	@Test
	public void CalculaFrequenciaCemPorCento()
	{
		aluno.lancaFaltas(2, 0);
		
		assertEquals(aluno.getFrequencia(), 100);
	}
	
	@Test
	public void CalculaFrequenciaZeroCento()
	{
		aluno.lancaFaltas(2, 2);
		aluno.lancaFaltas(3, 3);
		
		assertEquals(aluno.getFrequencia(), 0);
	}
	
	@Test
	public void CalculaFrequencia()
	{
		aluno.lancaFaltas(2, 1);
		aluno.lancaFaltas(3, 2);
		aluno.lancaFaltas(4, 1);
		
		assertEquals(aluno.getFrequencia(), 56);
	}
}
