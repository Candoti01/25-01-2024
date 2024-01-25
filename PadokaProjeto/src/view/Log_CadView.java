package view;

import controller.*;
import java.util.*;

public class Log_CadView {
    public static void main(String[] args) {
        CadastroUsuario();
    }

    public static void CadastroUsuario() {
        Scanner scnRespostas = new Scanner(System.in);
        String strRespostas;
        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("O usuario ja possui cadastro? ");
            strRespostas = scnRespostas.nextLine().toUpperCase();
            if (strRespostas.equals("S")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                App.Log_User();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Iniciando cadastro obrigatorio...");
                Thread.sleep(2000);
                App.Cad_User();
            }
        } catch (Exception e) {
            System.err.println("Erro!" + e);
        }
        scnRespostas.close();
    }
}
