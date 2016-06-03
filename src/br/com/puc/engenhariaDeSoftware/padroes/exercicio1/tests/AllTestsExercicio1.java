package br.com.puc.engenhariaDeSoftware.padroes.exercicio1.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
				AlunoTest.class,
				AlunoTecnicoTest.class,
				AlunoGraduacaoTest.class,
				AlunoPosGraduacaoTest.class
			})
public class AllTestsExercicio1 {

}
