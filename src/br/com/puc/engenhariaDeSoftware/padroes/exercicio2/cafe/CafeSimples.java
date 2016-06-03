package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.cafe;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.ingredientes.PoDeCafe;

public class CafeSimples extends Cafe {
	
	protected PoDeCafe 	poDeCafe1;
	protected PoDeCafe 	poDeCafe2;
	
	public CafeSimples() {
		poDeCafe1 = new PoDeCafe(this.acucar);
		poDeCafe2 = new PoDeCafe(poDeCafe1);
	}

	@Override
	public double calculaPreco() {
		return poDeCafe2.calcula();
	}

}
