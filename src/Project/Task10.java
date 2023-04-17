package Project;

public class Task10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from
        an Array of Strings?
         */

        String[] names = {"Edwin", "Ellie", "Adrian", "Reyna", "Ellie","Reyna"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] == names[j]) {
                    //printing duplicate elements
                    System.out.println(names[j]);
                }

            }

        }
    }
}
