package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.tests.cafe.CafeComLeiteTest;
import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.tests.cafe.CafeSimplesTest;
import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.tests.cafe.CafeTest;
import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.tests.cafe.CappuccinoTest;

@RunWith(Suite.class)
@SuiteClasses({ 
				CafeTest.class,
				CafeSimplesTest.class,
				CafeComLeiteTest.class,
				CappuccinoTest.class
			})
public class AllTestsExercicio2 {

}
