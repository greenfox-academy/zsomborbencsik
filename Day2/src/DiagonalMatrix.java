public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] numberArray = new int [4][4];

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                if (j == i) {
                    numberArray[i][j] = 1;
                }
                else {
                    numberArray[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println();
        }



    }



}

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output