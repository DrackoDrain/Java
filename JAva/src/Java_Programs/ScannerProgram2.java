package Java_Programs;

import java.util.Scanner;

public class ScannerProgram2 {
    public static void main(String args[]){
        String name ;
        int population ;
        double GDP ;
//        float populationdensity ;
//        char currency;
//        boolean issecular ;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of your country");
        name = scanner.nextLine();


        System.out.println("Population of Your country ");
        population = scanner.nextInt();

        System.out.println("Gdp of your country ");
        GDP = scanner.nextDouble();



        System.out.println(name);
        System.out.println(population);
        System.out.println(GDP);
    }
}
