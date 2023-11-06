package patterns;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row < 2 * n  ; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 1; col < c+1; col++) {
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
}