package edu.fatec.lp2.exercicio1;

public class Contatinho
{
    private String nome;
    private String celular;
    public Contatinho(String nome, String celular){
        this.nome = nome;
        this.celular = celular;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCelular(){
        return this.celular;
    }
    public void setCelular(String celular){
        this.celular = celular;
    }
    public String toString(){
        return "["+this.nome+","+ this.celular+"]";
    }
}
