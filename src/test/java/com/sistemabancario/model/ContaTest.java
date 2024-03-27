package com.sistemabancario.model;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ContaTest {

    private final Conta conta = new Conta();

    @Test
    @Order(1)
    void setNumValido_R01() {
        final var valido = "02120-2";
        conta.setNumero(valido);
        assertEquals(valido, conta.getNumero());
    }

    @Test
    @Order(2)
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


}
