package edu.fatec.lp2.exercicio1;

class MsgAudio extends Mensagem
{
    private int duracao;

    public MsgAudio(Contatinho destinatario, String hora_envio, String conteudo){
        super(destinatario, hora_envio, conteudo);
        this.duracao = conteudo.length();
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    
    @Override
    public Mensagem sendMenssage(String mensagem){
        return this;
    }
}
