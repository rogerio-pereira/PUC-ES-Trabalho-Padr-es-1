package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.ingredientes;

public class PoDeCafe extends Ingrediente {	
	public PoDeCafe()
	{
		this.setPreco(0.5);
		this.outroIngrediente = new IngredienteZero();
	}
	
	public PoDeCafe(Ingrediente outroIngrediente)
	{
		this.setPreco(0.5);
		
		this.outroIngrediente = outroIngrediente;
	}
}
