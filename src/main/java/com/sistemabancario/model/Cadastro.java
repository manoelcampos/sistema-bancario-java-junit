package com.sistemabancario.model;

/**
 * Interface contendo os métodos básicos que qualquer entidade 
 * (classe de negócio que será persistida no banco de dados) deve ter. 
 * 
 * @author Manoel Campos da Silva Filho
 */
public interface Cadastro {

    /**
     * @return
     */
    long getId();

    /**
     * @param id
     */
    void setId(long id);
}