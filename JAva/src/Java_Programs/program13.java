package Java_Programs;
// Factorial of a number

public class program13 {
    public static void main(String[] args) {
        int num = 5;
        int factorial=1;
        while (num>0){
            factorial = factorial*num;
            num--;
        }
        System.out.println(factorial);

    }
}
