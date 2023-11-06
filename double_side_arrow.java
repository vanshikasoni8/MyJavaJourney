package patterns;

import java.util.Scanner;

public class double_side_arrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        int stars = 1;
        int spaces = numRows - 1;
        int totalRows = numRows;

        for (int currentRow = 1; currentRow <= totalRows; currentRow++) {

            for (int spaceCount = 1; spaceCount <= spaces; spaceCount++) {
                System.out.print("  ");
            }
            for (int starCount = stars; starCount >= 1; starCount--) {
                System.out.print(starCount + " ");
            }
            for (int spaceCount = 1; spaceCount <= totalRows - spaces - 2; spaceCount++) {
                System.out.print("  ");
            }
            for (int starCount = 1; starCount <= stars; starCount++) {
                if (currentRow != 1 && currentRow != totalRows) {
                    System.out.print(starCount + " ");
                }
            }

            System.out.println();

            // Prepare for the next row
            if (currentRow <= totalRows / 2) {
                spaces -= 2;
                stars++;
            } else {
                spaces += 2;
                stars--;
            }
        }
    }
}