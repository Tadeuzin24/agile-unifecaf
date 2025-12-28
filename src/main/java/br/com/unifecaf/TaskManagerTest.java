package br.com.unifecaf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de testes unitários para o TaskManager.
 *
 * Utiliza JUnit 5 para validar as principais funcionalidades
 * do sistema de gerenciamento de tarefas, garantindo a
 * qualidade e confiabilidade do código.
 */

public class TaskManagerTest {

    @Test
    void deveCriarTarefaComSucesso() {
        TaskManager manager = new TaskManager();
        manager.criarTarefa("Teste", "Descrição");

        assertEquals(1, manager.listarTarefas().size());
    }

    @Test
    void deveAtualizarTarefaExistente() {
        TaskManager manager = new TaskManager();
        manager.criarTarefa("Titulo Antigo", "Descricao Antiga");

        boolean atualizado = manager.atualizarTarefa(1, "Novo Titulo", "Nova Descricao");

        assertTrue(atualizado);
    }

    @Test
    void deveRemoverTarefaExistente() {
        TaskManager manager = new TaskManager();
        manager.criarTarefa("Tarefa", "Descricao");

        boolean removido = manager.removerTarefa(1);

        assertTrue(removido);
        assertEquals(0, manager.listarTarefas().size());
    }

    @Test
    void deveCriarTarefaComPrioridadePadrao() {
        TaskManager manager = new TaskManager();
        manager.criarTarefa("Teste prioridade", "Verificar prioridade");

        Task tarefa = manager.listarTarefas().get(0);

        assertEquals("MEDIA", tarefa.getPrioridade());
    }

}
