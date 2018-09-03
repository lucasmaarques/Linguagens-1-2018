/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio1;

/**
 *
 * @author lucas.araujo
 */
public class descricao {
    private String nome;
    private int altura;
    private int peso;
    
    public descricao(String nome, int altura, int peso){
        setNome(nome);
        setAltura(altura);
        setPeso(peso);
             
    }
    
    @Override
    public String toString(){
        String retorno = "Nome:" + getNome();
        retorno += "\nAltura: " + getAltura() + "\nPeso: " + getPeso();
        return retorno;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

}
