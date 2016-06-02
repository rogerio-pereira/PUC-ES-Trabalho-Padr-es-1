package br.com.puc.engenhariaDeSoftware.padroes.exercicio1;

public class AlunoTecnico extends Aluno {

	@Override
	public boolean isAprovado() {
		if((this.getNota() >= 5) && (this.getFrequencia() >= 75))
			return true;
		
		return false;
	}

}
