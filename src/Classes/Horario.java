package Classes;

import java.io.Serializable;

public class Horario implements Serializable {

    private float preco;
    private int horarioIni;
    private int horarioFim;
    private String nome;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getHorarioIni() {
        return horarioIni;
    }

    public void setHorarioIni(int horarioIni) {
        this.horarioIni = horarioIni;
    }

    public int getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(int horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
