/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Thais
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Tabuleiro jogo = new Tabuleiro();
        String posicao;
        int jogador;
        int valida = 0; //enquanto estiver em 0 a jogada nao é valida e continuara no laço
        int jogadas = 0; //contador de jogadas

        while (true) { //enquanto infinito
            System.out.println("---Jogo da Velha---");
            System.out.println(jogo.mostrar());

            do {//Inicia jogador 1 (Faça)
                System.out.println("Jogador 1, qual a posição desejada?");
                posicao = sc.next();
                while (!jogo.validacao(posicao)) { //enquanto nao for valido (os dois botarem 5)
                    System.out.println("Posição inválida, informe uma nova, por favor!");
                    posicao = sc.next();
                    valida = 0; //p continuar. Se a jogada for valida ele nem entra aqui
                } //vem logo para ca ->
                jogo.jogada(posicao, "X");
                valida = 1; //jogada deu certo e quebra o while de valida==0

            } while (valida == 0); //fim do jogador 1

            jogadas++; //incrementa
            valida = 0; //inicia para o proximo jogador
            System.out.println(jogo.mostrar());

            if (!jogo.vencedor(jogadas).equals("null")) { //enquanto nao for null ele para o while infinito
                break;
            }

            do {//Inicia jogador 2 (Faça)
                System.out.println("Jogador 2, qual a posição desejada?");
                posicao = sc.next();
                while (!jogo.validacao(posicao)) { //enquanto nao for valido (os dois botarem 5)
                    System.out.println("Posição inválida, informe uma nova, por favor!");
                    posicao = sc.next();
                    valida = 0; //p continuar. Se a jogada for valida ele nem entra aqui
                } //vem logo para ca ->
                jogo.jogada(posicao, "O");
                valida = 1; //jogada deu certo e quebra o while de valida==0
            } while (valida == 0); //fim do jogador 2

            jogadas++; //incrementa
            valida = 0; //inicia para o proximo jogador
            System.out.println(jogo.mostrar());

            if (!jogo.vencedor(jogadas).equals("null")) { //enquanto nao for null ele quebra o while infinito
                break; // é diferente de null? é porque achou o vencedor ou deu impate
            }

        }

        System.out.println(jogo.vencedor(jogadas));
    }

}

