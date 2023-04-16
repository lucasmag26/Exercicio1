package edu.fatec.lp2.exercicio1;

class MsgFoto extends Mensagem
{
    private int tamanho;

    public MsgFoto(Contatinho destinatario, String hora_envio, String conteudo){
        super(destinatario, hora_envio, conteudo);
        this.tamanho = conteudo.length();
    }
    
    public int Tamanho(){
        return this.tamanho;
    }
    
    @Override
    public Mensagem sendMenssage(String mensagem){
        return this;
    }
}