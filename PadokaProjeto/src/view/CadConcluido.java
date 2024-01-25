package view;

public class CadConcluido {
    public static void main(String[] args) {
        
    }

    public static void Cad_Concluido() {
        try{
        System.out.println("Cadastro conlcuido com sucesso!!\n\nIniciando processo de login...");
        Thread.sleep(2000);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    } catch (Exception e) {
        System.err.println("Erro!" + e);
    }
    }
}
