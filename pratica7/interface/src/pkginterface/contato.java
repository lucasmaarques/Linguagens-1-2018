package pkginterface;

public class contato {
private String nome;
private String numero;

public contato(String rnome, String rnumero){
 this.nome = rnome;
 this.numero = rnumero;
}  
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}