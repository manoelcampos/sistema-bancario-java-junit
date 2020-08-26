package com.sistemabancario.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste base para implementação dos testes
 * unitários para a classe {@link Movimentacao}.
 * Os testes foram gerados pelo IDE apenas como modelo
 * (fiz apenas algumas melhorias de boas práticas 
 * como tirar visibilidade public e definir variáveis como final).
 * 
 * Assim, NENHUM DELES FUNCIONA E O CÓDIGO PRECISA SER ALTERADO
 * de acordo com as regras de negócio dos métodos da classe {@link Movimentacao}.
 * Ao iniciar a alteração de um teste aqui,
 * a primeira coisa a fazer é remover a chamada de fail(),
 * que indica que o teste é apenas um protótipo.
 * 
 * @author Manoel Campos da Silva Filho
 */
class MovimentacaoTest {
    /**
     * Verifica se o valor passado para o ID está sendo realmente armazenado.
     */
    @Test
    void testGetId() {
        final Movimentacao instance = new Movimentacao(new Conta());
        final long esperado = 1;
        instance.setId(esperado);
        final long obtido = instance.getId();
        assertEquals(esperado, obtido);
    }

    /**
     * R00 - Verifica se ocorre erro ao tentar inserir uma descrição nula.
     *
     * <p>O nome dos testes para os requisitos indicados na classe {@link Movimentacao}
     * deve seguir este padrão de nome, onde o número do requisito é incluído no nome do teste.
     * </p>
     */
    @Test
    void testR00SetDescricaoNula() {
        final Movimentacao instance = new Movimentacao(new Conta());
        assertThrows(NullPointerException.class, () -> instance.setDescricao(null));
    }

    /**
     * R00 - Verifica se ocorre erro ao tentar inserir uma descrição vazia.
     */
    @Test
    void testR00SetDescricaoVazia() {
        final Movimentacao instance = new Movimentacao(new Conta());
        assertThrows(IllegalArgumentException.class, () -> instance.setDescricao(""));
    }

    /**
     * R00 - Verifica se ocorre erro ao tentar inserir uma descrição somente com espaços em branco.
     */
    @Test
    void testR00SetDescricaoBranco() {
        final Movimentacao instance = new Movimentacao(new Conta());
        final String espacosEmBranco = "           ";
        assertThrows(IllegalArgumentException.class, () -> instance.setDescricao(espacosEmBranco));
    }

}
