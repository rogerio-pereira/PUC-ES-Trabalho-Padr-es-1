package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.cafe;

import br.com.puc.engenhariaDeSoftware.padroes.exercicio2.ingredientes.Acucar;

public class Cafe {
	protected Acucar acucar;
	
	public Cafe()
	{
		acucar = new Acucar();
	}

	public double calculaPreco() {
		return acucar.calcula();
	}
}
