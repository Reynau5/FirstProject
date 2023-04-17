package Project;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
      /*
        Create a program that uses an array to store a list of
        temperatures for a week, and then uses a loop to find
        the highest and lowest temperature for the week.
       */

        float[] temperatures=new float[] {69.7F,86.5F,100.1F,78.3F,89.9F,102.2F,70.6F};
        float highest=temperatures[0];
        float lowest=temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            } else if (temperatures[i] < lowest) {
                lowest=temperatures[i];
            }
        }
            System.out.println("The highest temperature is "+highest);
        System.out.println("The lowest temperature is "+lowest);


    }
}
