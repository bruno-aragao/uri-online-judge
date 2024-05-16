import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int M = scanner.nextInt();
            Integer[] grades = new Integer[M];
            for (int j = 0; j < M; j++) {
                grades[j] = scanner.nextInt();
            }

            Integer[] sortedGrades = grades.clone();
            Arrays.sort(sortedGrades, Collections.reverseOrder());

            int count = 0;
            for (int j = 0; j < M; j++) {
                if (grades[j].equals(sortedGrades[j])) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}