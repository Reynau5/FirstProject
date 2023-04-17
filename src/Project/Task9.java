package Project;

public class Task9 {
    public static void main(String[] args) {
        /*
        Write a java program to find the second-largest
        number in the array?
         */

        int counter[]={11,22,6,18,88,2,53,48};
        int largest = counter[0];
        int secLargest= counter[0];
        for (int i = 0; i < counter.length; i++) {

            if (counter[i]>largest){
                largest=counter[i];

            } else if (counter[i] > secLargest && counter[i] <largest) {
                secLargest =counter[i];
            }
        }
        System.out.println(secLargest);
    }
}
