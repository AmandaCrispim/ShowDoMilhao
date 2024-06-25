import java.util.Scanner;

public class Jogo {
    private Pergunta[] perguntas;
    private int premio;

    public Jogo(Pergunta[] perguntas) {
        this.perguntas = perguntas;
        this.premio = 100; 
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        for (Pergunta pergunta : perguntas) {
            System.out.println("Pergunta valendo R$" + premio);
            System.out.println(pergunta.getEnunciado());
            String[] opcoes = pergunta.getOpcoes();
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i + 1) + ": " + opcoes[i]);
            }
            System.out.print("Sua resposta: ");
            int resposta = scanner.nextInt();
            if (pergunta.verificarResposta(resposta - 1)) {
                System.out.println("Correto!");
                premio *= 5; 
            } else {
                System.out.println("Que pena, você errou! Seu prêmio final foi de R$" + premio);
                return; 
            }
        }
        System.out.println("Jogo terminado! Seu prêmio final é de R$" + premio);
        scanner.close();
    }
}
