public class NumberPyramid {

    // Helper method to print one row
    static void printRow(int i, int n) {
        // Leading spaces
        for (int j = i; j < n; j++) {
            System.out.print("  ");
        }
        // Ascending numbers: 1 to i
        for (int k = 1; k <= i; k++) {
            System.out.print(k + " ");
        }
        // Descending numbers: i-1 to 1
        for (int k = i - 1; k >= 1; k--) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            printRow(i, n);
        }
    }
}