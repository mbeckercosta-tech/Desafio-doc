package com.cybertron.autobot;

public class Autobot {
   private String nome;
    private double energon;
    private int nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEnergon() {
        return energon;
    }

    public void setEnergon(double energon) {
        this.energon = energon;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Autobot(String nome, double energon, int nivel) {
        this.setNome(nome);
        this.setEnergon(energon);
        this.setNivel(nivel);

        // mudando nomes das variaveis do objeto para algo intendivel/legivel.
        // e deixando private e colocando getters e setters.

    }
}

