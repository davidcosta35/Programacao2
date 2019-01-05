package Classes;

import java.io.Serializable;
import java.util.*;

public class Repositorio implements Serializable {
    
    private Map<String, Recinto> recintoLocalidade;
    private Map<String, Recinto> recintoDesporto;
    private Map<String, Dono> donos;
    private Map<String, Cliente> clientes;
    private Map<String, String> admins;
    private Map<String, Reserva> reservas;

    public Repositorio() {
        this.recintoLocalidade = new HashMap<>();
        this.recintoDesporto = new HashMap<>();
        this.donos = new HashMap<>();
        this.clientes = new HashMap<>();
        this.admins = new HashMap<>();
        this.reservas = new HashMap<>();
    }

    public Map<String, Recinto> getRecintoLocalidade() {
        return recintoLocalidade;
    }

    public Map<String, Recinto> getRecintoDesporto() {
        return recintoDesporto;
    }

    public Map<String, Dono> getDonos() {
        return donos;
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public Map<String, String> getAdmins() {
        return admins;
    }

    public Map<String, Reserva> getReservas() {
        return reservas;
    }
    
    
    
}
