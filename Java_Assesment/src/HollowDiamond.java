public class HollowDiamond {
    public static void main(String[] args) {

        int n = 5; // Half-size of the diamond (controls overall size)

        // Upper half (including middle row)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print left star
            System.out.print("*");
            // Print inner spaces (only from 2nd row onwards)
            if (i > 1) {
                for (int k = 1; k < (2 * i - 2); k++) {
                    System.out.print(" ");
                }
                // Print right star
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half (mirror of upper, excluding middle row)
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print left star
            System.out.print("*");
            // Print inner spaces
            if (i > 1) {
                for (int k = 1; k < (2 * i - 2); k++) {
                    System.out.print(" ");
                }
                // Print right star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
