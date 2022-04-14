public class Matrix
{
    public static void switchRows(int[][] anArray) {
        for (int i = 0; i < anArray.length / 2; i++) {
            for (int j = 0; j < anArray[i].length; j++) {
                int temp = anArray[i][j];
                anArray[i][j] = anArray[anArray.length - i - 1][j];
                anArray[anArray.length - i - 1][j] = temp;
            }
        }
    }


    public static void switchColumns(char[][] anArray) {
        for(int row = 0; row < anArray.length; row++){
            for(int col = 0; col < anArray[row].length / 2; col++) {
                char temp = anArray[row][col];
                anArray[row][col] = anArray[row][anArray[row].length - col - 1];
                anArray[row][anArray[row].length - col - 1] = temp;
            }
        }
    }

}
