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
    void getId() {
        final var movimentacao = new Movimentacao(new Conta());
        final long esperado = 1;
        movimentacao.setId(esperado);
        final long obtido = movimentacao.getId();
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
    void r00SetDescricaoNula() {
        final var movimentacao = new Movimentacao(new Conta());
        assertThrows(NullPointerException.class, () -> movimentacao.setDescricao(null));
    }

    /**
     * R00 - Verifica se ocorre erro ao tentar inserir uma descrição vazia.
     */
    @Test
    void r00SetDescricaoVazia() {
        final var movimentacao = new Movimentacao(new Conta());
        assertThrows(IllegalArgumentException.class, () -> movimentacao.setDescricao(""));
    }

    /**
     * R00 - Verifica se ocorre erro ao tentar inserir uma descrição somente com espaços em branco.
     */
    @Test
    void r00SetDescricaoBranco() {
        final var movimentacao = new Movimentacao(new Conta());
        final String espacosEmBranco = "           ";
        assertThrows(IllegalArgumentException.class, () -> movimentacao.setDescricao(espacosEmBranco));
    }

    @Test
    void setDescricaoValida() {
        final var movimentacao = new Movimentacao(new Conta());
        final String descricao = "Saque Caixa Eletrônico";
        movimentacao.setDescricao(descricao);
        assertEquals(descricao, movimentacao.getDescricao());
    }

}
