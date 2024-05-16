import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] N = new double[12][12];
        char p;
        double soma = 0.0;

        p = sc.next().charAt(0);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                N[i][j] = sc.nextDouble();
                if (j > i && (j + i) < 11) {
                    soma += N[i][j];
                }
            }
        }

        if (p == 'S')
            System.out.printf("%.1f\n", soma);
        else
            System.out.printf("%.1f\n", soma / 30.0);
    }
}