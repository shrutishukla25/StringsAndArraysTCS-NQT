import java.util.Scanner;

public class TakeMAtrixfromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[2][3];
        for (int i = 0; i < matrix.length; i++) {
            // for rows
            System.out.println("Enter Values for row " + i);
            for (int j = 0; j < matrix[0].length; j++) {
                // for Columns
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
