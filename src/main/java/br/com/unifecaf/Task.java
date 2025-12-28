package br.com.unifecaf;

/**
 * Classe responsável por representar uma tarefa do sistema.
 */

public class Task {

    private int id;
    private String titulo;
    private String descricao;
    private String prioridade;

    public Task(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = "MEDIA";
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

}
