public class IfArraYisSortedOrNot {
    // DONE IN CODING NINJAS
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1 };
        int i = 1;
        if (a.length == 0 || a.length == 1) {
            System.out.println("Sorted");
        }
        for (i = 1; i < a.length; i++) {
            if (a[i - 1] <= a[i]) {
                continue;
            } else {
                System.out.println("Not Sorted");
                break;

            }
        }
        if (i == a.length) {
            System.out.println("Sorted");
        }

    }
}
