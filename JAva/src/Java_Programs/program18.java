package Java_Programs;
// taking input from user in java

import java.util.Scanner;

public class program18 {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the elements of number in array ");
        n = sc.nextInt();

        int [] array = new int [5];

        System.out.println(" ENter the elements in array ");
        for(int i =0; i< n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are ---- ");
        for (int i =0; i< n; i++){
            System.out.println(array[i]);
        }

    }
}
