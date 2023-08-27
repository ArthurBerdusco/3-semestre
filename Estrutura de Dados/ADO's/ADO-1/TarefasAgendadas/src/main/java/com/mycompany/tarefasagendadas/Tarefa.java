package com.mycompany.tarefasagendadas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tarefa {

    private int id = 0;
    private String titulo;
    private String data;
    private String horaInicio;
    private String horaFim;
    private String descricao;
    private Status status;

    public void atualizarStatus() {
        Calendar agora = Calendar.getInstance();
        Date dataHoraAtual = agora.getTime();

        // Formata a data e hora atual para comparação
        SimpleDateFormat formatoDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataHoraAtualStr = formatoDataHora.format(dataHoraAtual);

        // Verifica o status com base nas comparações
        
        if(status == Status.CONCLUIDO){
            return;
        }
        
        if (dataHoraAtualStr.compareTo(data + " " + horaFim) > 0) {
            status = Status.ATRASADA;
        } else if (dataHoraAtualStr.compareTo(data + " " + horaInicio) >= 0
                && dataHoraAtualStr.compareTo(data + " " + horaFim) <= 0) {
            status = Status.EM_ANDAMENTO;
        } else {
            status = Status.PENDENTE;  // Talvez você queira adicionar um status "pendente" para tarefas futuras
        }
    }
    
    public void concluirStatus(){
        status = Status.CONCLUIDO;
    }

    public Status getStatus() {
        return status;
    }

    public Tarefa() {

    }

    public Tarefa(int id, String titulo, String data, String horaInicio, String horaFim, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", titulo=" + titulo + ", data=" + data + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", descricao=" + descricao + '}';
    }

    public enum Status {
        EM_ANDAMENTO,
        CONCLUIDO,
        ATRASADA,
        PENDENTE
    }
}
