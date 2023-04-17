package Project;

public class Task3 {
    public static void main(String[] args) {
        /*
          Create a 2D array or integer type where you will store
          odd and even numbers. Develop a program which will
          identify/print the even numbers only.
         */
        int[][] numbers={{1,6,10,12},
                       {25,17,22,18},
                        {20,11,9,5}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]+" ");

                }
            }
            System.out.println();
        }
    }
}
