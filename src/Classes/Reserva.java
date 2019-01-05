package Classes;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva implements Serializable {
    
    private EstadoReserva estado;
    private String cliente;
    private Date data;
    private List<Horario> horario;
    private List<Desporto> desporto;

    public Reserva() {
        this.estado = EstadoReserva.Pendente;
        this.horario = new ArrayList<>();
        this.desporto = new ArrayList<>();
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Horario> getHorario() {
        return horario;
    }

    public void setHorario(List<Horario> horario) {
        this.horario = horario;
    }

    public List<Desporto> getDesporto() {
        return desporto;
    }

    public void setDesporto(List<Desporto> desporto) {
        this.desporto = desporto;
    }
    
    public String dataToString(Date data) {
        String dateString;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MMM/yyyy");
        return formato.format(data);
    }
    
    public String horaToString(int hora, int mins) {
        String s;
        if (mins < 10) {
            s = (hora + " : 0" + mins);
        } else if (hora < 10) {
            s = ("0" + hora + " : ");
        } else {
            s = (hora + " : " + mins);
        }
        return s;
    }
    
    
    
}
