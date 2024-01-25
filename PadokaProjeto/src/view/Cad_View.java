package view;

import java.util.*;
import controller.*;

public class Cad_View {
    public static void main(String[] args) {
        Tela_Cad();
    }

    public static void Tela_Cad() {
        String strUsuario, strSenha, strConfSenha;
        Scanner scnCadastro = new Scanner(System.in);
            try {
                System.out.println("--==Cadastro iniciado==--\n\n");
                System.out.println("Digite seu nome: ");
                strUsuario = scnCadastro.nextLine();
                System.out.println("\nDigite sua senha: ");
                strSenha = scnCadastro.nextLine();
                System.out.println("\nConfirme sua senha: ");
                strConfSenha = scnCadastro.nextLine();
                if (strSenha.equals(strConfSenha)) {
                    System.out.println("Cadastro concluido com sucesso...");
                    InterfaceUsuariosPadoka.UsuarioRegs = strUsuario;
                    InterfaceUsuariosPadoka.SenhaRegs = strSenha;
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Redirecionando...");
                    Thread.sleep(2000);
                }else{
                    System.out.println("As senhas nao batem! Tente novamente.");
                    Tela_Cad();
                }

            } catch (Exception e) {
                System.err.println("Erro no cadastro!" + e);
            }
            scnCadastro.close();
    }
}
