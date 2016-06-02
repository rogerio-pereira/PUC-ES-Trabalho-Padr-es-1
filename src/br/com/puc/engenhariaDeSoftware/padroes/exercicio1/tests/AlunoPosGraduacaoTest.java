package br.com.puc.engenhariaDeSoftware.padroes.exercicio1.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio1.AlunoPosGraduacao;

public class AlunoPosGraduacaoTest {
	private AlunoPosGraduacao aluno;

	@Before
	public void configuraClasseDeTeste()
	{
		aluno = new AlunoPosGraduacao();
	}
	
	@Test(expected=RuntimeException.class)
	public void AlunoPosGraduacaoSemNotaSemFrequencia() {
		aluno.isAprovado();
	}

	@Test(expected=RuntimeException.class)
	public void AlunoPosGraduacaoComNotaSemFrequencia() {
		aluno.lancaNota(5);
		
		aluno.isAprovado();
	}
	
	@Test(expected=RuntimeException.class)
	public void AlunoPosGraduacaoSemNotaComFrequencia() {
		aluno.lancaFaltas(4, 1);
		
		aluno.isAprovado();
	}
	
	@Test
	public void AlunoPosGraduacaoReprovadoPorNota() {
		aluno.lancaFaltas(100, 20);
		aluno.lancaNota(7.4);
		
		assertEquals(aluno.isAprovado(), false);
	}
	
	@Test
	public void AlunoPosGraduacaoReprovadoPorFalta() {
		aluno.lancaFaltas(100, 21);
		aluno.lancaNota(7.5);
		
		assertEquals(aluno.isAprovado(), false);
	}
	
	@Test
	public void AlunoPosGraduacaoAprovado() {
		aluno.lancaFaltas(100, 20);
		aluno.lancaNota(7.5);
		
		assertEquals(aluno.isAprovado(), true);
	}
}
