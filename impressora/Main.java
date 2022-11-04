/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marhlon Korb
 */
public class Main {

    public static void main(String[] args) {
        CadastroImpressora cadastroImpressora = new CadastroImpressora();
        List<ImpressoraMatricial> impressorasMatriciais = new ArrayList<>();
        List<ImpressoraLaser> impressorasLaser = new ArrayList<>();
        List<Impressora> todasImpressoras = new ArrayList<>();
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);

        do {
            Menu.opcoes();
            System.out.println("Digite uma opção");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    impressorasMatriciais.add((ImpressoraMatricial) cadastroImpressora.cadastrarImpressora(1));
                    break;
                case 2:
                    impressorasLaser.add((ImpressoraLaser) cadastroImpressora.cadastrarImpressora(2));
                    break;
                case 3:
                    ImpressoraMatricial.getListImpressorasMatriciais(impressorasMatriciais);
                    break;
                case 4:
                    ImpressoraLaser.getListImpressorasLaser(impressorasLaser);
                    break;
                case 5:
                    Impressora.getListImpressoras(todasImpressoras);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 6);
        System.out.println("Programa finalizado.");
    }
}
