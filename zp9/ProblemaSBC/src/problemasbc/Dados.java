package problemasbc;
import java.util.Comparator;

public class Dados implements Comparator, Comparable {

    private int M;
    private String L;
    
    
    public Dados(int M, String L){
        this.M = M;
        this.L = L;
    }

    
    @Override
    public String toString(){
        return "M: " + getM() + "L: " + getL();
    }

    @Override
    public int compare(Object o1, Object o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Dados d1 = (Dados) o1;
        Dados d2 = (Dados) o2;
        if (d1.getM() > d2.getM())
            return -1;
        else if(d1.getM() == d2.getM())
            return 0;
        else
            return 1;
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return compare(this, o);
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public String getL() {
        return L;
    }

    public void setL(String L) {
        this.L = L;
    }
    

}


