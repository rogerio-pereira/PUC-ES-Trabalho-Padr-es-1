package br.com.puc.engenhariaDeSoftware.padroes.exercicio1;

public abstract class Aluno 
{
	protected double nota = -1;
	protected int 	aulas = -1;
	protected int 	faltas = -1;
	
	/**
	 * Lança a nota para o aluno
	 * @param notaLancada
	 */
	public void lancaNota(double notaLancada)
	{
		if(notaLancada < 0.0)
			throw new RuntimeException("Nota não pode ser menor que 0");
		if(notaLancada > 10.0)
			throw new RuntimeException("Nota não pode ser maior que 0");
		
		nota = notaLancada;
	}
	
	/**
	 * Lanca numero de aulas e quantidade de faltas
	 * @param aulasLancadas Numero de aulas aplicadas
	 * @param faltasLancadas Numero de faltas do aluno
	 */
	public void lancaFaltas(int aulasLancadas, int faltasLancadas)
	{
		if(aulasLancadas < 1)
			throw new RuntimeException("Não pode ser lançado numeros nulos de aulas");
		if(faltasLancadas < 0)
			throw new RuntimeException("Não pode ser lançado numeros nulos de faltas");

		if(aulas == -1)
			aulas = 0;
		if(faltas == -1)
			faltas = 0;
		
		aulas 	= aulas + aulasLancadas;
		faltas	= faltas + faltasLancadas;
	}
	
	/**
	 * Obtém a nota
	 * @return float Nota do Aluno
	 */
	public double getNota()
	{
		return nota;
	}
	
	/**
	 * Obtém o número de aulas
	 * @return int Número de aulas
	 */
	public int getAulas()
	{
		return aulas;
	}
	
	/**
	 * Obtém o número de faltas do aluno
	 * @return int Número de faltas do Aluno
	 */
	public int getFaltas()
	{
		return faltas;
	}
	
	/**
	 * Obtém a frequencia do aluno
	 * @return float Frequencia de presença do Aluno
	 */
	public int getFrequencia()
	{
		if(getAulas() < 1)
			throw new RuntimeException("Nenhuma aula lançada");
		
		double frequencia = (double)getFaltas()/(double)getAulas();	//Calcula a porcentagem de presença
		frequencia = 1.0 - frequencia;								//Diminui a porcentagem de 1, para obter a frequencia
		frequencia = frequencia * 100; 								//Multiplica por 100 para obter o valor fracionario da frequencia, por exemplo 30%
		
		return (int) frequencia;
	}
	
	/**
	 * Método abstrato para verificação de aprovação do aluno
	 * @return boolean Situação do Aluno
	 */
	public abstract boolean isAprovado();
}
