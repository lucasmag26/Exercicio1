package edu.fatec.lp2.exercicio1;

class MsgTexto extends Mensagem
{
    private int num_char;

    public MsgTexto(Contatinho destinatario, String hora_envio, String conteudo){
        super(destinatario, hora_envio, conteudo);
        this.num_char = conteudo.length();
    }
    
    public int getNum_char(){
        return this.num_char;
    }
    
    @Override
    public Mensagem sendMenssage(String mensagem){
        return this;
    }
}
