package Project;

public class Task5 {
    public static void main(String[] args) {
        /*
         Write a program to swap 2 numbers without a
         temporary variable?
         */
        int a= 80;
        int b= 90;
        a=a+b; //80+90=170
        b=a-b; //170-90=80
        a=a-b; //170-80=90
        System.out.println("The new value of a is "+a+" and b is "+b);
    }
}
