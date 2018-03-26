package aula4;

public class Cliente {

    private String nome;
    private String endereço;
    private String cpf;
    private int idade;
    
    public Cliente(String nome, String endereço, String cpf,int idade){
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public void mudarCPF(String cpf){
        if (this.idade <= 60) {
           validarCPF(cpf);
        }
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    } 
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return this.endereço;
    }  
 
    public String getCpf(){
        return this.cpf;
    }
    
    private boolean validarCPF(String cpf){
        return false;
        //Série de regras aqui, falha caso não seja válido
    }
  
}
