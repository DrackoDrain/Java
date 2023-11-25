package Java_Programs;
// Check the number is prime or not
import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        int num ;
        int flag =0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();


        for(int i = 1; i<=num ; i++){
            if((num%i == 0)) {
                flag++;
            }
        }
        if(flag == 2 ){
            System.out.println("PRime number ");
        }
        else {
            System.out.println("Not a Prime Number ");
        }
        scanner.close();
    }
}
