package organizandojava2;
import java.util.Comparator;

public class Dados implements Comparator, Comparable {

    private int id;
    private String nome;
    
    public Dados(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return "ID: " + getId() + "Nome: " + getNome();
    }

    @Override
    public int compare(Object o1, Object o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Dados d1 = (Dados) o1;
        Dados d2 = (Dados) o2;
        if (d1.getId() > d2.getId())
            return -1;
        else if(d1.getId() == d2.getId())
            return 0;
        else
            return 1;
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return compare(this, o);
    }

    
}


