import java.util.Arrays;

public class TMS_4_MassUp {

    public static void main(String[] args) {
        int[][] matrixSort = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixSort[i][j] = (int)(Math.random() * 100);
                System.out.print(matrixSort[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int j = 0;
        int[] stringSort = new int[2];
        for (int i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                stringSort[j] =  matrixSort[i][j];
            }
            Arrays.sort(stringSort);
            for (int k = 0; k < 2; k++) {
                matrixSort[i][k] = stringSort[k];
                System.out.print(matrixSort[i][k] + "\t");
            }
            System.out.println();
        }
    }


}
