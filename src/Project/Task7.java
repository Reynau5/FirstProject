package Project;

public class Task7 {
    public static void main(String[] args) {
        /*
         Write a Java Program to print the first 10 numbers of
         Fibonacci series.
         */

        int x=2, y=4, z=0;
        System.out.print(x+","+y);
        for (int i = 2; i < 10; i++) {
            z=x+y;
            System.out.print(",");
            System.out.print(z);
            x=y;
            y=z;

        }

    }
}
