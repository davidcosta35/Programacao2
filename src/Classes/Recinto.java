package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Recinto implements Serializable {

   private List<Desporto> desportos;
   private List<Servicos> servicos;
   private List<Horario> horarios;
   private String nome;
   private String morada;
   private String localidade;
   private TipoRecinto tipoRecinto;
   private List<Reserva> reservas;
   private boolean ativo;

   public Recinto() {
      this.desportos = new ArrayList<>();
      this.servicos = new ArrayList<>();
      this.horarios = new ArrayList<>();
      this.reservas = new ArrayList<>();
   }

   public List<Desporto> getDesportos() {
      return desportos;
   }

   public void setDesportos(List<Desporto> desportos) {
      this.desportos = desportos;
   }

   public List<Servicos> getServicos() {
      return servicos;
   }

   public void setServicos(List<Servicos> servicos) {
      this.servicos = servicos;
   }

   public List<Horario> getHorarios() {
      return horarios;
   }

   public void setHorario(List<Horario> horarios) {
      this.horarios = horarios;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getMorada() {
      return morada;
   }

   public void setMorada(String morada) {
      this.morada = morada;
   }

   public String getLocalidade() {
      return localidade;
   }

   public void setLocalidade(String localidade) {
      this.localidade = localidade;
   }

   public TipoRecinto getTipoRecinto() {
      return tipoRecinto;
   }

   public void setTipoRecinto(TipoRecinto tipoRecinto) {
      this.tipoRecinto = tipoRecinto;
   }

   public List<Reserva> getReservas() {
      return reservas;
   }

   public void setReservas(List<Reserva> reservas) {
      this.reservas = reservas;
   }

   public boolean isAtivo() {
      return ativo;
   }

   public void setAtivo(boolean ativo) {
      this.ativo = ativo;
   }

}
