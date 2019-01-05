package Classes;

import java.io.Serializable;
//teste
public class Cliente extends Utilizador implements Serializable {
    
    private int numPontos;
    private int numVale;

    public Cliente() {
        this.numPontos = 0;
        this.numVale = 0;
    }

    public int getNumPontos() {
        return numPontos;
    }

    public void setNumPontos(int numPontos) {
        this.numPontos = numPontos;
    }

    public int getNumVale() {
        return numVale;
    }

    public void setNumVale(int numVale) {
        this.numVale = numVale;
    }

    
    
    
    
}
