package me.dio.dominio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import java.util.List;

@Entity(name = "tb_barber")
public class Barbeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double saldoTotal;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<RegistroDiario> registrosDiarios;

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public List<RegistroDiario> getRegistrosDiarios() {
        return registrosDiarios;
    }

    public void setRegistrosDiarios(List<RegistroDiario> registrosDiarios) {
        this.registrosDiarios = registrosDiarios;
    }
}
