package view;

public class LogConcluido {
    public static void main(String[] args) {
        Log_concluido();
    }
    public static void Log_concluido() {
        try {
            System.out.println("O login foi concluido!\n\n");
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Redirecionando...");
            Thread.sleep(2000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {
            System.err.println("Erro!" + e);
        }
    }
}
