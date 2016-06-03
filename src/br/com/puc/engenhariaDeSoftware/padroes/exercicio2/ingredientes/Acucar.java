package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.ingredientes;

public class Acucar extends Ingrediente {
	
	public Acucar()
	{
		this.setPreco(0.2);
		this.outroIngrediente = new IngredienteZero();
	}
	
	public Acucar(Ingrediente outroIngrediente)
	{
		this.setPreco(0.2);
		this.outroIngrediente = outroIngrediente;
	}
}
