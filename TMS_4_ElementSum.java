public class TMS_4_ElementSum {
    public static void main(String[] args) {

        int[][] myArray = new int[3][2];
        int sum = 0;

        myArray[0][0] = 3;
        myArray[0][1] = 7;

        myArray[1][0] = 3;
        myArray[1][1] = 30;

        myArray[2][0] = 9;
        myArray[2][1] = 41;

        for(int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
            }
        }
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    sum += myArray[i][j];
                }
            }
            System.out.println("Сумма массивов="+ sum);
        }

    }

