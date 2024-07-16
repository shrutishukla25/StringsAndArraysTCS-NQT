import java.util.Scanner;

//THIS IS HOW WE WRITE CODES IN EXAMS
public class ReverseAnarray {
    // Time Complexity=O(n)

    // Single pass Involved
    // space Comp=O(1)

    public static int[] revarray(int rev[], int n) {
        int start = 0, end = n - 1;
        while (start <= end) {
            // ALWAYS Rigth start<=end
            int temp = rev[start];
            rev[start] = rev[end];
            rev[end] = temp;
            start++;
            end--;
        }
        return rev;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev[] = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = sc.nextInt();
        }
        revarray(rev, n);// WE can make a method for reversing our array or we could just write the code
                         // here as well
        // ARRAy IS JUST reversed if we dont print it then there wont be any output
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
        sc.close();
    }
}

// Using recursion in revarray method
/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * public static void revarray(int rev[], int start, int end) {
 * if (start < end) {
 * // condition can work like this also using {< operator using <=}
 * // if condition because we are having new value of start and end every time
 * int temp = rev[start];
 * rev[start] = rev[end];
 * rev[end] = temp;
 * revarray(rev, start + 1, end - 1);
 * }
 * }
 */
