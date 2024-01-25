package controller;

import java.util.*;
import model.*;
import view.*;

public class App {
    public static void main(String[] args) {
        InterfacePadoka.resultadoModelDisponivel = "";
        UserInteraction.respostaCliente();
    }

    public static void CardapioBusca() {
        CardapioModel.exibirCardapio();
        CardapioExibir.ExibindoCardapio();
    }

    public static void IniciandoCad() {
        Log_CadView.CadastroUsuario();
    }

    public static void Log_User() {
        Log_View.Tela_log();
        Log_Model.TelaLogModel();
    }

    public static void Cad_User() {
        Cad_View.Tela_Cad();
        Cad_Model.Cad_userSQL();
        CadConcluido.Cad_Concluido();
        Log_User();
    }

    public static void erro_log() {
        
    }
    
    public static void ComprarBolos() {
        LogConcluido.Log_concluido();
        Comp_bolos.Tela_Compra();
    }
}
