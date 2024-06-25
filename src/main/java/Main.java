import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pergunta[] perguntas = new Pergunta[]{
            new Pergunta("Qual a capital do Brasil?", new String[]{"Brasília", "Rio de Janeiro", "São Paulo", "Salvador"}, 0),
            new Pergunta("Qual é a fórmula da água?", new String[]{"H2O", "CO2", "O2", "N2"}, 0),
            new Pergunta("Qual é o maior planeta do sistema solar?", new String[]{"Terra", "Júpiter", "Saturno", "Marte"}, 1),
            new Pergunta("Quantos continentes existem na Terra?", new String[]{"5", "6", "7", "8"}, 2),
            new Pergunta("Quem escreveu 'Dom Casmurro'?", new String[]{"Machado de Assis", "José de Alencar", "Carlos Drummond de Andrade", "Clarice Lispector"}, 0),
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo(a) ao show do milhão! Podemos começar? Aperte 's' para iniciar o jogo");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            Jogo jogo = new Jogo(perguntas);
            jogo.iniciar();
        } else {
            System.out.println("Jogo não iniciado.");
        }
    }
}
