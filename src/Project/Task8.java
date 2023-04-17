package Project;

public class Task8 {
    public static void main(String[] args) {
        /*
         Maximum and minimum number in the array?
         */

        int[] counter={23,5,18,32,2,44};
        int max=counter[0];
        int min=counter[0];

        for (int i = 0; i < counter.length; i++) {
            if(counter[i]>max) {
                max = counter[i];
            }else if
                (counter[i]<min) {
                min = counter[i];
            }
            }
        System.out.println(min);
        System.out.println(max);
        }



    }



