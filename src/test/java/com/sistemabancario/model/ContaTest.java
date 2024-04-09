package com.sistemabancario.model;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    public final Conta conta = new Conta();

    @Test
    void setNumValido_R01() {
        final var valido = "02120-2";
        conta.setNumero(valido);
        assertEquals(valido, conta.getNumero());
    }

    @Test
    void setNumInv_R01() {
        final var inv = "abc";
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> conta.setNumero(inv)),
                () -> assertNotEquals(inv, conta.getNumero())
        );
    }

    @Test
    void poupancaFalse_R02() {
        assertFalse(conta.isPoupanca());
    }

    @Test
    void getSaldoTotal_R06() {
        int expected = 100;
        conta.setLimite(expected);
        assertEquals(expected,conta.getSaldoTotal());
    }

    @Test
    void addAddMovimentacao_R07() {
        final var mov = new Movimentacao(conta);
        mov.setConfirmada(true);
        mov.setTipo('C');
        final int valor = 50;
        mov.setValor(valor);
        conta.addMovimentacao(mov);
        assertEquals(valor, conta.getSaldoTotal());
    }


}
