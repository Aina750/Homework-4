public class TMS_4_Chess {
    public static void main(String[] args) {
        String[][] Chess;
        Chess = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Chess[i][j] = (i + j) % 2 == 0 ? "B" : "W";
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(Chess[i][j] + " ");
            }
            System.out.println();
        }

    }
}
