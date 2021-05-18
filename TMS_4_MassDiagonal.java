public class TMS_4_MassDiagonal {

    public static void main(String[] args) {
        int n = 5;
        int [][] two = new int[n][n];
        int i, j = 0;

        for (i = 0; i < n; i++)

                two [i][j] = 1;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(two [i][j] + "  ");
            System.out.println();
        }
    }
}
