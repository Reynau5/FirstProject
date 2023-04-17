package Project;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an array of integer values. After the array is
        created, calculate the sum of all stored elements in that array.
         */

        int[] counter={10,20,30,40,50,60};
        int sum=0;
        for (int i = 0; i < counter.length; i++) {
            sum+=counter[i];
        }
        System.out.println("The sum is "+sum);
    }
}
