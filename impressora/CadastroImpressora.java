/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marhlon Korb
 */
public class CadastroImpressora {

    public Impressora cadastrarImpressora(int status) {
        Scanner leitor = new Scanner(System.in);
        Impressora impressora = null;
        switch (status) {
            case 1:
                impressora = new ImpressoraMatricial();
                break;
            case 2:
                impressora = new ImpressoraLaser();
                break;
        }

        try {
            System.out.println("Digite o modelo da impressora");
            String modelo = leitor.next();
            impressora.setModelo(modelo);
            System.out.println("Digite a marca");
            String marca = leitor.next();
            impressora.setMarca(marca);
            System.out.println("Digite o peso");
            double peso = leitor.nextDouble();
            impressora.setPeso(peso);
            if (impressora instanceof ImpressoraLaser) {
                System.out.println("Digite a capacidade do toner");
                double pesoToner = leitor.nextDouble();
                impressora.setCapacidadeToner(pesoToner);
            }
            if (impressora instanceof ImpressoraMatricial) {
                System.out.println("Digite a capacidade do toner");
                int numeroAgulhas = leitor.nextInt();
                impressora.setNumeroAgulhas(numeroAgulhas);
                System.out.println("Imprime duas vias?");
                String resposta = leitor.next();
                if (resposta.equals("sim")) {
                    impressora.setImprimeVias(true);
                } else {
                    impressora.setImprimeVias(false);
                }
                System.out.println("Imprime colorido?");
                String resposta2 = leitor.next();
                if (resposta2.equals("sim")) {
                    impressora.setImprimeColorido(true);
                } else {
                    impressora.setImprimeVias(false);
                }
            }

            return impressora;
        } catch (Exception e) {
            e.getMessage();
        }
        return impressora;
    }
}
