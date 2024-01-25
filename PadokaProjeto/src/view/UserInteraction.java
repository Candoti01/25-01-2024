package view;

import java.util.*;
import controller.*;
public class UserInteraction {
    public static void main(String[] args) {
        
    }
        public static void respostaCliente() {
        Boolean Loop = false;
        String respostas;
        Scanner scnVerCardapio = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nBem vindo a confeitaria jardim!\n\n");
        while (Loop == false) {
            try {
                System.out.println("Voce deseja ver nosso cardapio? [S] | [N]");
                respostas = scnVerCardapio.nextLine().toUpperCase();
                if (respostas.equals("S")) {
                    App.CardapioBusca();
                    Loop = true;
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Selecione uma das opçoes abaixo: ");
                    System.out.println("\n[1] - Fazer pedido.");
                    System.out.println("\n[2] - Ver Cardapio.");
                    System.out.println("\n[3] - Ir Embora.");
                    respostas = scnVerCardapio.nextLine();
                    switch (respostas) {
                        case "1":
                            App.IniciandoCad();
                            Loop = true;
                            break;

                        case "2":
                        
                            App.CardapioBusca();
                            Loop = true;
                            break;

                        case "3":
                            System.out.println("Saindo...");
                            Loop = true;
                            break;
                        default:
                            System.out.println("Saindo...");
                            Loop = true;
                            break;
                    }
                }
            } catch (Exception e) {
                System.err.println("Ocorreu um erro!" + e);
            }

        }
        scnVerCardapio.close();
    }
}