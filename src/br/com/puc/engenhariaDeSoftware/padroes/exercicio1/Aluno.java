package br.com.puc.engenhariaDeSoftware.padroes.exercicio1;

public abstract class Aluno 
{
	protected float nota;
	protected int 	aulas;
	protected int 	faltas;
	
	/**
	 * Lança a nota para o aluno
	 * @param notaLancada
	 */
	public void lancaNota(float notaLancada)
	{
		if(nota < 0)
			throw new RuntimeException("Nota não pode ser menor que 0");
		if(nota > 10)
			throw new RuntimeException("Nota não pode ser menor que 0");
		
		nota = notaLancada;
	}
	
	/**
	 * Lanca numero de aulas e quantidade de faltas
	 * @param aulasLancadas Numero de aulas aplicadas
	 * @param faltasLancadas Numero de faltas do aluno
	 */
	public void lancaFaltas(int aulasLancadas, int faltasLancadas)
	{
		aulas 	= aulas + aulasLancadas;
		faltas	= faltas + faltasLancadas;
	}
	
	/**
	 * Obtém a nota
	 * @return float Nota do Aluno
	 */
	public float getNota()
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
	 * Obteḿ o número de faltas do aluno
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
	public float getFrequencia()
	{
		return getFaltas()/getAulas();
	}
	
	/**
	 * Método abstrato para verificação de aprovação do aluno
	 * @return boolean Situação do Aluno
	 */
	public abstract boolean isAprovado();
}
