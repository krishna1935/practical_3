public class FullPyramid {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            // spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
