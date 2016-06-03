package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.ingredientes;

public class LeiteEmPo extends Ingrediente {	
	public LeiteEmPo()
	{
		this.setPreco(1.2);
		this.outroIngrediente = new IngredienteZero();
	}
	
	public LeiteEmPo(Ingrediente outroIngrediente)
	{
		this.setPreco(1.2);
		
		this.outroIngrediente = outroIngrediente;
	}
}
