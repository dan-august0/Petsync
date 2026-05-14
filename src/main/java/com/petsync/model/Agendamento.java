package com.petsync.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Agendamento {

    private int id;

    private Pet pet;

    private List<Servico> servicos;

    private LocalDate data;

    private LocalTime hora;

    private String status;

    private String observacoes;

    public Agendamento() {
    }

    public Agendamento(int id, Pet pet,
                       List<Servico> servicos,
                       LocalDate data,
                       LocalTime hora,
                       String status,
                       String observacoes) {

        this.id = id;
        this.pet = pet;
        this.servicos = servicos;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.observacoes = observacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}