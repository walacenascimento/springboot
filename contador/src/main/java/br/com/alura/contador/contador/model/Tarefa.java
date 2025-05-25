package br.com.alura.contador.contador.model;

// serialiando dados
public class Tarefa {
    // Atributos
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    // Construtor
    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    // getters
    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    // toString
    @Override
    public String toString() {
        return "Tarefas{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                ", pessoaResponsavel='" + pessoaResponsavel + '\'' +
                '}';
    }

}
