package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dono extends Utilizador implements Serializable {

    private List<Recinto> recintos; 
    
    public Dono() {
        this.recintos = new ArrayList<>();
    }

    public List<Recinto> getRecintos() {
        return recintos;
    }
    
}
