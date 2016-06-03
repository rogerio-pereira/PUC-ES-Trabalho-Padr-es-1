package br.com.puc.engenhariaDeSoftware.padroes.exercicio1;

public class AlunoTecnico extends Aluno {

	@Override
	public boolean isAprovado() {
		if(this.getAulas() < 0)
			throw new RuntimeException("Não foi lançado nenhuma aula");
		if(this.getNota() < 0)
			throw new RuntimeException("Não foi lançado nenhuma nota");
		
		if((this.getNota() >= 5) && (this.getFrequencia() >= 75))
			return true;
		
		return false;
	}

}
