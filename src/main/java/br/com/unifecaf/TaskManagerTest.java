package br.com.unifecaf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
