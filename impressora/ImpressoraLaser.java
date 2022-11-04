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
public class ImpressoraLaser extends Impressora {

    private String modelo;
    private String marca;
    private double peso;
    private double capacidadeToner;

    public ImpressoraLaser() {
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

    @Override
    public String toString() {
        return "Impressora Laser: " +
                "modelo: " + modelo + '\'' +
                "\nmarca: " + marca + '\'' +
                "\npeso: " + peso +
                "\ncapacidadeToner: " + capacidadeToner +
                "\nimprimeFrenteVerso: " + imprimeFrenteVerso;
    }

    public static void getListImpressorasLaser(List<ImpressoraLaser> listaImpressoras) {
        if(listaImpressoras.size() == 0){
            System.out.println("Lista está vazia.");
            return;
        }
        try {
            for (Impressora impressora : listaImpressoras) {
                System.out.println(impressora.toString());
            }
        } catch (Exception e) {
            e.getCause();
        }

    }
}
