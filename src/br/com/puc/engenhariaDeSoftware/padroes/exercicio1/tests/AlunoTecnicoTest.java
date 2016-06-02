package br.com.puc.engenhariaDeSoftware.padroes.exercicio1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio1.AlunoTecnico;

public class AlunoTecnicoTest {
private AlunoTecnico aluno;
	
	@Before
	public void configuraClasseDeTeste()
	{
		aluno = new AlunoTecnico();
	}
	
	@Test(expected=RuntimeException.class)
	public void AlunoTecnicoSemNotaSemFrequencia() {
		aluno.isAprovado();
	}

	@Test(expected=RuntimeException.class)
	public void AlunoTecnicoComNotaSemFrequencia() {
		aluno.lancaNota(5);
		
		aluno.isAprovado();
	}
	
	@Test(expected=RuntimeException.class)
	public void AlunoTecnicoSemNotaComFrequencia() {
		aluno.lancaFaltas(4, 1);
		
		aluno.isAprovado();
	}
	
	@Test
	public void AlunoTecnicoReprovadoPorNota() {
		aluno.lancaFaltas(100, 25);
		aluno.lancaNota(4.0);
		
		assertEquals(aluno.isAprovado(), false);
	}
	
	@Test
	public void AlunoTecnicoReprovadoPorFalta() {
		aluno.lancaFaltas(100, 26);
		aluno.lancaNota(5.0);
		
		assertEquals(aluno.isAprovado(), false);
	}
	
	@Test
	public void AlunoTecnicoAprovado() {
		aluno.lancaFaltas(100, 25);
		aluno.lancaNota(5.0);
		
		assertEquals(aluno.isAprovado(), true);
	}
}
