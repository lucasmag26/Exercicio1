package edu.fatec.lp2.exercicio1;

abstract class Mensagem
{
    
    private Contatinho destinatario;
    private String hora_envio;
    private String conteudo;
    
    public Mensagem(Contatinho destinatario, String hora_envio, String conteudo){
        this.destinatario = destinatario;
        this.hora_envio = hora_envio;
        this.conteudo = conteudo;
    }
 
    public Contatinho getDestinatario(){
        return this.destinatario;
    }
    
    public void setDestinatario(Contatinho destinatario){
        this.destinatario = destinatario;
    }
    
    public String getHora_envio(){
        return this.hora_envio;
    }
    
    public void setHora_envio(String hora_envio){
        this.hora_envio = hora_envio;
    }
     
    public String getConteudo(){
        return this.conteudo;
    }
    
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    
    public abstract Mensagem sendMenssage(String mensagem);

    public String toString(){
        return "["+this.destinatario +", "+this.conteudo+","+ this.hora_envio+"]";
    }   
    
}

