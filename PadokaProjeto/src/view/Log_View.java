package view;
import java.util.*;
import controller.*;

public class Log_View {
    public static void main(String[] args) {
        Tela_log();
    }

    public static void Tela_log() {
        String strLogUs, strlogsPassword;
        Scanner scnLogin = new Scanner(System.in);
        try {
            System.out.println("--==Efetuando Login==--\n\nDigite seu Usuario: ");
            strLogUs = scnLogin.nextLine();
            System.out.println("\nDigite sua senha: ");
            strlogsPassword = scnLogin.nextLine();
            InterfaceUsuariosPadoka.UsuarioLogs = strLogUs;
            InterfaceUsuariosPadoka.SenhaLogs = strlogsPassword;
        } catch (Exception e) {
            System.err.println("Erro no login!! " + e) ;
        }
        scnLogin.close();
    }
}
