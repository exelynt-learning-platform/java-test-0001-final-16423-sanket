public class ConcentricSquare {

    // Helper method to get value at position (i, j)
    static int getValue(int i, int j, int n) {
        // Distance from each edge
        int top    = i;
        int left   = j;
        int bottom = n - 1 - i;
        int right  = n - 1 - j;

        // Minimum distance from any edge determines the ring level
        int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

        // Outermost ring = n/2+1, innermost = 1
        return (n / 2 + 1) - minDist;
    }

    public static void main(String[] args) {
        int n = 7; // Grid size (must be odd)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(getValue(i, j, n) + " ");
            }
            System.out.println();
        }
    }
}
