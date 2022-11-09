package br.edu.atitus.poo.projetofinaltb.dados;

public class Departamento extends GenericDados{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public Departamento (){
        this(0,"");
    }
    
    public Departamento(int id, String nome){
        this.setId(id);
        this.setNome(nome);
    }  
}
