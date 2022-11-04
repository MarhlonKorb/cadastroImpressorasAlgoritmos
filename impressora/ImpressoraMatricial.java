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
public class ImpressoraMatricial extends Impressora {

    private int numeroAgulhas;
    private boolean imprimeVias;

    public ImpressoraMatricial() {
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

    @Override
    public String toString() {
        return "Impressora Matricial: " +
                "\nModelo: " + getModelo() +
                "\nmarca: " + getMarca() +
                "\nnumeroAgulhas: " + numeroAgulhas +
                "\nimprimeVias: " + imprimeVias +
                "\nimprimeFrenteVerso: " + imprimeFrenteVerso + "\n";
    }

    public static void getListImpressorasMatriciais(List<ImpressoraMatricial> listaImpressoras) {
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
