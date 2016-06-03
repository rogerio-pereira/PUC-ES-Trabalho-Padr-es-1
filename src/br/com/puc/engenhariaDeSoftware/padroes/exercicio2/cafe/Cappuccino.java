package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.cafe;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.ingredientes.Canela;

public class Cappuccino extends CafeComLeite {
	protected Canela canela;
	
	public Cappuccino() {
		canela = new Canela(this.leiteEmPo3);
	}
	
	@Override
	public double calculaPreco() {
		return this.canela.calcula();
	}
}
