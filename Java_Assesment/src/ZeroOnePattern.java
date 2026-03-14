
public class ZeroOnePattern {

    // Helper method to print one row
    static void printRow(int i) {
        // Odd row starts with 1, Even row starts with 0
        int start = (i % 2 != 0) ? 1 : 0;

        for (int j = 1; j <= i; j++) {
            System.out.print(start + " ");
            // Alternate between 1 and 0
            start = (start == 1) ? 0 : 1;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            printRow(i);
        }
    }
}
