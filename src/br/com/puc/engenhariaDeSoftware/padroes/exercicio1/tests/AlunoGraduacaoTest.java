package br.com.puc.engenhariaDeSoftware.padroes.exercicio1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio1.AlunoGraduacao;

public class AlunoGraduacaoTest {
	private AlunoGraduacao aluno;

	@Before
	public void configuraClasseDeTeste()
	{
		aluno = new AlunoGraduacao();
	}
	
	@Test(expected=RuntimeException.class)
	public void AlunoGraduacaoSemNotaSemFrequencia() {
		aluno.isAprovado();
	}

	@Test(expected=RuntimeException.class)
	public void AlunoGraduacaoComNotaSemFrequencia() {
		aluno.lancaNota(5);
		
		aluno.isAprovado();
	}
	
	@Test(expected=RuntimeException.class)
	public void AlunoGraduacaoSemNotaComFrequencia() {
		aluno.lancaFaltas(4, 1);
		
		aluno.isAprovado();
	}
	
	@Test
	public void AlunoGraduacaoReprovadoPorNota() {
		aluno.lancaFaltas(100, 20);
		aluno.lancaNota(6.4);
		
		assertEquals(aluno.isAprovado(), false);
	}
	
	@Test
	public void AlunoGraduacaoReprovadoPorFalta() {
		aluno.lancaFaltas(100, 21);
		aluno.lancaNota(6.5);
		
		assertEquals(aluno.isAprovado(), false);
	}
	
	@Test
	public void AlunoGraduacaoAprovado() {
		aluno.lancaFaltas(100, 20);
		aluno.lancaNota(6.5);
		
		assertEquals(aluno.isAprovado(), true);
	}
}
