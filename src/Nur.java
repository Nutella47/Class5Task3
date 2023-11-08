public class Nur {
    public static void main(String[] args) {
        int[][] numList = new int[10][10];
        int column;
        int counter = 0;
        int diagonalSum = 0;
        for (int row = 0; row < 10; row++) {
            for (column = 0; column < 10; column++) {
                if (row == column) {
                    numList[row][column] = counter++;
                    diagonalSum += counter;
                }
                System.out.print(numList[row][column] + "\t");
            }
            System.out.println("");
        }
        System.out.println(diagonalSum);
    }
}
