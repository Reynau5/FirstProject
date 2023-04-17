package Project;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program
        which will calculate the sum of even and odd numbers
        for that array.
         */
        int[][] myNumb= {{5,8,6,15,70,80,},
                {15,10,17,28,35,40}};
        int evenSum=0;
        int oddSum=0;

        for (int i = 0; i < myNumb.length; i++) {
            for (int j = 0; j < myNumb[i].length; j++) {

                if (myNumb[i][j] % 2 == 0) {
                    evenSum += myNumb[i][j];
                } else if (myNumb[i][j] % 2 != 0) {
                    oddSum += myNumb[i][j];
                }
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);

    }
}
