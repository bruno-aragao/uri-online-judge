import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] numeros = new Integer[N];
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros, (a, b) -> {
            if (a % 2 == 0) {
                if (b % 2 == 0) {
                    return a.compareTo(b);
                } else {
                    return -1;
                }
            } else if (b % 2 == 0) {
                return 1;
            } else {
                return b.compareTo(a);
            }
        });

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}