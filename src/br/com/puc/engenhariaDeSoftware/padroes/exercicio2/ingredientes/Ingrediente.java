package br.com.puc.engenhariaDeSoftware.padroes.exercicio2.ingredientes;

public class Ingrediente {
	protected Ingrediente outroIngrediente;
	
	protected double preco;
	
	public void setPreco(double preco)
	{
		this.preco = preco;
	}
	
	public double getPreco()
	{
		return preco;
	}
	
	public double calcula()
	{
		return getPreco() + outroIngrediente.calcula();
	}
}
