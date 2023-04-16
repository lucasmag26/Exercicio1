package edu.fatec.lp2.exercicio1;


class Whatsapp{
  
    private Contatinho[] contatos = {
        new Contatinho("nome1","1"),
        new Contatinho("nome2","2"),
        new Contatinho("nome3","3")
    };
    private Mensagem[] mensagens = {
        new MsgTexto(contatos[0],"1","conteudo1"),
        new MsgTexto(contatos[1],"2","conteudo22"),
        new MsgTexto(contatos[2],"3","conteudo333")
    };

    void listarContatos(){
        for(int x = 0; x < this.contatos.length; x++ ){
        	System.out.println(this.contatos[x]);
        }
    }
    
    void listarMensagens(){
        //System.out.println(((MsgTexto)this.mensagens[0]).getNum_char());
        
        for(int x = 0; x < this.mensagens.length; x++ ){
        	System.out.println(this.mensagens[x]);
        }
        
    }   
}