package com.sistemabancario.model;

/**
 * Representa uma agência bancária.
 * 
 * @author Manoel Campos da Silva Filho
 */
public class Agencia implements Cadastro {
    private long id;

    /**
     * Banco ao qual a agência pertence.
     * O banco deve ser fornecido como um parâmetro no construtor,
     * pois não pode haver agência sem banco.
     * Um teste deve verificar se, após usar tal construtor para instanciar
     * a agência, se o atributo banco foi setado (ou seja, se não é nulo). 
     * 
     * (R01)
     */
    private Banco banco;

    /**
     * Número único da agência bancária para um banco.
     *
     * <ul>
     *      <li>O valor é obrigatório, não podendo ser nulo nem vazio (R02).</li>
     *      <li>
     *          Deve ter exatamente 4 algarismos, seguido de um hífen e mais um dígito verificador.
     *          (o hífen é pra deixar clara a existência de tal dígito). 
     *          Exemplos de números de agência
     *          válidos inclui: 0638-6, 1886-4, 1867-8. 
     * 
     *          (R03)
     *      </li>
     *      <li>
     *          Deve ser validado usando o algoritmo do Módulo 11, que está implementado
     *          no método {@link Util#calculaDigitoModulo11(String)}.
     *          Você deve chamar o método como 
     *          String digitoCalculado = Util.calculaDigitoModulo11(numero)
     *          e então verificar se o dígito informado em numero é igual ao 
     *          dígito calculado pelo método e armazenado na variável 
     *          digitoCalculado no exemplo acima.
     *          Uma forma simples de fazer isso é verificar se a String numero termina
     *          com o digitoCalculado, usando o método endsWith da classe String.
     *          Se o numero não terminar com o digitoCalculado, ele é inválido
     *          e uma exceção deve ser lançada para informar isso.
     *          Um exemplo de agência válida que pode ser utilizada para testes é 1867-8.
     * 
     *          (R04)
     *      </li>
     * </ul>
     */
    private String numero;

    @Override
    public long getId() {
        // TODO: Você precisa implementar este método
        return 0;
    }

    @Override
    public void setId(long id) {
        // TODO: Você precisa implementar este método
    }

    public String getNumero() {
        return numero;
    }

    /**
     * Altera o número da agência, verificando se o dígito está correto
     * utilizando o algoritmo 
     * <a href="https://pt.wikipedia.org/wiki/Dígito_verificador#Módulo_11">modulo 11</a>.
     * @param numero novo número da agência
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
