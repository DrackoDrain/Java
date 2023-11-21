package Java_Programs;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {

        int score ;
        char grade = 0;
        System.out.println("enter the score of student");
        Scanner scanner = new Scanner(System.in);
            score = scanner.nextInt();
        if (score >= 90){
            grade = 'A';
        }
        else if (score >= 80){
            grade = 'B';
        }
        else if (score >= 70){
            grade = 'C';
        }
        else if (score >= 60){
            grade = 'D';
        }
        System.out.println("grade : " + grade);
        scanner.close();

        // Switch
        switch (grade) {
            case 'A':
                System.out.println("Excellent score");
                break;
            case 'B':
                System.out.println("good score");
                break;
            case 'C':
                System.out.println("average score, you can do better");
                break;
            case 'D':
                System.out.println("Work hard");
                break;
            default:
                System.out.println("Invalid Grade");
        }

    }
}
