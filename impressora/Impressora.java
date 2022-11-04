/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;

import java.util.List;

/**
 *
 * @author Marhlon Korb
 */
public abstract class Impressora {
    
    int id;
    private String modelo;
    private String marca;
    private double peso;
    private double capacidadeToner;
    boolean imprimeFrenteVerso;
    private boolean imprimeColorido;
    private int numeroAgulhas;
    private boolean imprimeVias;

    public Impressora() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCapacidadeToner() {
        return capacidadeToner;
    }

    public void setCapacidadeToner(double capacidadeToner) {
        this.capacidadeToner = capacidadeToner;
    }

    public boolean isImprimeFrenteVerso() {
        return imprimeFrenteVerso;
    }

    public void setImprimeFrenteVerso(boolean imprimeFrenteVerso) {
        this.imprimeFrenteVerso = imprimeFrenteVerso;
    }

    public boolean isImprimeColorido() {
        return imprimeColorido;
    }

    public void setImprimeColorido(boolean imprimeColorido) {
        this.imprimeColorido = imprimeColorido;
    }

    public int getNumeroAgulhas() {
        return numeroAgulhas;
    }

    public void setNumeroAgulhas(int numeroAgulhas) {
        this.numeroAgulhas = numeroAgulhas;
    }

    public boolean isImprimeVias() {
        return imprimeVias;
    }

    public void setImprimeVias(boolean imprimeVias) {
        this.imprimeVias = imprimeVias;
    }
    
    
    public static void getListImpressoras(List<Impressora> listaImpressoras){
        if(listaImpressoras.size() == 0){
            System.out.println("Lista está vazia.");
            return;
        }
        try{
        for (Impressora impressora : listaImpressoras) {
            System.out.println(impressora.toString());
        }
        } catch(Exception e){
            e.getCause();
        }
    }
}
