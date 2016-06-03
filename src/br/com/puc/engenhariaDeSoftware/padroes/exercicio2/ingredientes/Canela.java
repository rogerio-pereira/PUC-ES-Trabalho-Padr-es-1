package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.ingredientes;

public class Canela extends Ingrediente {
	public Canela()
	{
		this.setPreco(1.5);
		this.outroIngrediente = new IngredienteZero();
	}
	
	public Canela(Ingrediente outroIngrediente)
	{
		this.setPreco(1.5);
		this.outroIngrediente = outroIngrediente;
	}
}
