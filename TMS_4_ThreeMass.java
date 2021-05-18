import java.util.Scanner;

public class TMS_4_ThreeMass {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);

        int[][][] myArray = {{{2, 1, 7}}, {{9, 6, 1}}};
        for (int[][] item1 : myArray) {
            for (int[] item2 : item1) {
                for (int item3 : item2) {
                    for (int i = 0; i < myArray.length; i++) {
                        for (int j = 0; j < myArray[i].length; j++) {


                            System.out.print(item3 + "\t");

                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
