package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel{
	public int quantidade;
	public Produto produtos;
	public double desconto;
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	
	@Override
	public double calcularPreco() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
