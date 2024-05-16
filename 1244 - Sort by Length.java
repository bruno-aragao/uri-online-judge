import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  // consume newline

        for (int i = 0; i < N; i++) {
            String frase = scanner.nextLine();
            String[] palavras = frase.split(" ");

            Arrays.sort(palavras, (a, b) -> {
                return Integer.compare(b.length(), a.length());
            });

            System.out.print(palavras[0]);
            for (int j = 1; j < palavras.length; j++) {
                System.out.print(" " + palavras[j]);
            }
            System.out.println();
        }
    }
}