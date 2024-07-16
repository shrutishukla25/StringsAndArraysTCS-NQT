public class AdditionOFTWOmatrix {
    // DONE IN GFG
    public static void main(String[] args) {
        // ADDITION OF TWO MATRICES IS POSSIBLE WHEN THERE NUMBER OF ROWS AND COLIMNS
        // ARE EQUAL
        /*
         * array.length: The length property is used to find the array length.// GIVES
         * ROWS
         * 
         * array[0].length: The number of columns on row 0.
         * 
         * array[1].length: The number of columns on row 1.
         */
        int arr[][] = { { 1, 2 }, { 1, 2 }, { 1, 3 } };
        int arr1[][] = { { 1, 2 }, { 3, 4 }, { 7, 6 } };
        int arrnew[][] = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arrnew[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        for (int i = 0; i < arrnew.length; i++) {
            // for rows
            for (int j = 0; j < arrnew[0].length; j++) {
                System.out.print(arrnew[i][j] + " ");
            }
            System.out.println();

        }
        // FOR ROWS
        System.out.println(arr.length);
        // FOR COLUMNS
        System.out.println(arr[0].length);
    }
}
/*
 * import java.util.Scanner;
 * 
 * public class A {
 * public static void main(String args[]) {
 * int mat1[][] = new int[2][2];
 * int mat2[][] = new int[2][2];
 * int mat3[][] = new int[mat1.length][mat1[0].length];
 * System.out.println("ENter mat1");
 * Scanner sc = new Scanner(System.in);
 * for (int i = 0; i < mat1.length; i++) {
 * for (int j = 0; j < mat1[0].length; j++) {
 * mat1[i][j] = sc.nextInt();
 * }
 * 
 * }
 * System.out.println("Enter mat2");
 * for (int i = 0; i < mat2.length; i++) {
 * for (int j = 0; j < mat2[0].length; j++) {
 * mat2[i][j] = sc.nextInt();
 * }
 * 
 * }
 * sc.close();
 * System.out.println("Matrix Array 1");
 * for (int i = 0; i < mat1.length; i++) {
 * for (int j = 0; j < mat1[0].length; j++) {
 * System.out.print(mat1[i][j] + " ");
 * }
 * System.out.println();
 * }
 * System.out.println("Matrix array 2 ");
 * for (int i = 0; i < mat2.length; i++) {
 * for (int j = 0; j < mat2[0].length; j++) {
 * System.out.print(mat2[i][j] + " ");
 * }
 * System.out.println();
 * }
 * System.out.println("Sum of our matrix arrays");
 * for (int i = 0; i < mat3.length; i++) {
 * for (int j = 0; j < mat3[0].length; j++) {
 * mat3[i][j] = mat1[i][j] + mat2[i][j];
 * }
 * }
 * for (int i = 0; i < mat3.length; i++) {
 * for (int j = 0; j < mat3[0].length; j++) {
 * System.out.print(mat3[i][j] + " ");
 * }
 * System.out.println();
 * }
 * }
 * }
 */