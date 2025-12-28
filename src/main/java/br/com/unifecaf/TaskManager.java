package br.com.unifecaf;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável pelo gerenciamento das tarefas do sistema.
 *
 * Permite criar, listar, atualizar e remover tarefas,
 * simulando um sistema básico de gerenciamento de tarefas
 * baseado em metodologias ágeis.
 */

public class TaskManager {

    private List<Task> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public void criarTarefa(String titulo, String descricao) {
        Task tarefa = new Task(proximoId++, titulo, descricao);
        tarefas.add(tarefa);
    }

    public List<Task> listarTarefas() {
        return tarefas;
    }

    public boolean atualizarTarefa(int id, String novoTitulo, String novaDescricao) {
        for (Task tarefa : tarefas) {
            if (tarefa.getId() == id) {
                tarefa.setTitulo(novoTitulo);
                tarefa.setDescricao(novaDescricao);
                return true;
            }
        }
        return false;
    }

    public boolean removerTarefa(int id) {
        return tarefas.removeIf(tarefa -> tarefa.getId() == id);
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.criarTarefa("Estudar Engenharia de Software", "Revisar Kanban e UML");
        manager.criarTarefa("Implementar projeto", "Criar CRUD em Java");

        System.out.println("Tarefas cadastradas:");
        for (Task tarefa : manager.listarTarefas()) {
            System.out.println(tarefa.getId() + " - " + tarefa.getTitulo());
        }
    }
}
