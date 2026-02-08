import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String[] palavras = {
                "amigo", "carta", "plano", "vento", "livro",
                "sonho", "tempo", "fundo", "pedra", "verde",
                "jogar", "lento", "barco", "porto", "trigo",
                "moral", "rival", "claro", "justo", "custo",
                "prazo", "bravo", "magro", "firme", "doido",
                "saber", "falar", "andar", "canto", "pular",
                "nobre", "leite", "papel", "linha", "ponto",
                "fruta", "calor", "nuvem", "chuva", "areia",
                "praia", "terra", "noite", "manha", "tarde",
                "sinal", "valor", "risco", "feliz", "dente"
        };
        Random random = new Random();
        String palavraAleatoria = palavras[random.nextInt(palavras.length)];
        System.out.println(palavraAleatoria);

        Scanner scanner = new Scanner(System.in);
        String palavraEscrita = "a";

        while (palavraEscrita != palavraAleatoria) {
            System.out.println("\nEscreva uma palavra de 5 letras:");
            palavraEscrita = scanner.nextLine();
            if (palavraEscrita.equals(palavraAleatoria)) break;
            for (int i = 0; i <= 4; i++) {
                if (palavraEscrita.charAt(i) == palavraAleatoria.charAt(i)) {
                    System.out.print("✓");
                } else if (palavraAleatoria.contains(String.valueOf(palavraEscrita.charAt(i)))) {
                    System.out.print("-");
                } else if (palavraEscrita.charAt(i) != palavraAleatoria.charAt(i)) {
                    System.out.print("x");
                }
            }
        }
    }
}
