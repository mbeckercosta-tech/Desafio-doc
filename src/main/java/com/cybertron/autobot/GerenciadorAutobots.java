package com.cybertron.autobot;


import java.util.*;

public class GerenciadorAutobots {
   private final int VALOR_MAXIMO_ELITE = 500;
    private final int VALOR_MAXIMO_PADRAO = 200;
    private final int VALOR_MAXIMO_RESERVA = 199;


    private List<Autobot> lista = new ArrayList<>();
    public void adicionar(Autobot a) {
        lista.add(a);
    }

    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i < lista.size(); i++) {
            // <= ERRADO || < CERTO
            // o indice i nao pode procurar mais posições do que o array tem, pois n existe posição maior do que 4.
            // é como se tu tivesse uma maquina que bota 6 pilulas repitidademente em um 5 containers, um sempre vai ficar pra fora por falta de espaço.

            total += lista.get(i).getEnergon();
        }
        return total;
    }
    public Autobot buscar(String nome) {
        for (Autobot a : lista) {
            if (Objects.equals(a.getNome(), nome)) {
                return a;
                // troquei == por equals
            } }
        return null;
    }
    public void reparar(Autobot a) {
        try {
            if (a.getEnergon() < 0) {
                throw new IllegalArgumentException("Energon negativo");
            }
            a.setEnergon(a.getEnergon() + 100);
        } catch (Exception e) {
            System.out.println("Falha ao repara autobot por causa de falta de energon" + e);
        }

        // arrumando os try e os catchs, try sem especificar o exception e o catch sem mostrar a mensagem.
    }
    public Tipo classificar(Autobot a) {
        if (a.getEnergon() > VALOR_MAXIMO_ELITE) {
            return Tipo.ELITE;
        } else if (a.getEnergon() > VALOR_MAXIMO_PADRAO) {
            return Tipo.PADRAO;
        } else {
            return Tipo.RESERVA;

            // criei enum para evitar strings e padronizar.

        }
    } }

