package edu.fatec.lp2.exercicio2;


public class ListaCompra implements Calculavel {
	
	   private ItemCompra[] itensCompra;
	   private int qtdMax;
	   private int qtdAtual = 0;

	   
	//CONSTRUTOR DA CLASSE
	public ListaCompra(int qtdMax) {
		this.itensCompra = new ItemCompra[qtdMax];
		this.qtdMax = qtdMax;
	}
	
	//INCLUIR ITEM
	public void incluirItem(ItemCompra itensCompras) {
		if(qtdAtual < qtdMax) {
			itensCompra[qtdAtual] = itensCompras;
			qtdAtual++;
		}
	}


	@Override
	public double calcularPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

}
