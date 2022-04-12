package br.com.dominio.api_back_end.Controller;

public enum Dias_Semana {
    Segunda("Segunda"),
    terça("terça"),
    Quarta("Quarta"),
    Quinta("Quinta"),
    Sexta("Sexta"),
    Sábado("Sábado"),
    Domingo("Domingo"),
    Amannha("Amanhã"),
    Ontemn("Ontem");

    private String descricao;

    Dias_Semana(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
