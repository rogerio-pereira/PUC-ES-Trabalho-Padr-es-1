package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.cafe;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.ingredientes.LeiteEmPo;

public class CafeComLeite extends CafeSimples {
	protected LeiteEmPo leiteEmPo1;
	protected LeiteEmPo leiteEmPo2;
	protected LeiteEmPo leiteEmPo3;
	
	public CafeComLeite() {
		leiteEmPo1 = new LeiteEmPo(this.poDeCafe2);
		leiteEmPo2 = new LeiteEmPo(leiteEmPo1);
		leiteEmPo3 = new LeiteEmPo(leiteEmPo2);
	}

	@Override
	public double calculaPreco() {
		return leiteEmPo3.calcula();
	}

}
