package Java_Programs;

import java.util.Scanner;

public class ScannerProgram2 {
    public static void main(String args[]){
        String name ;
        float population ;
        double GDP ;
//        float populationDensity ;
//        char currency;
//        boolean isSecular ;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of your country");
        name = scanner.nextLine();


        System.out.println("Population of Your country ");
        population = scanner.nextFloat();

        System.out.println("Gdp of your country ");
        GDP = scanner.nextDouble();



        System.out.println("Your country name is " + name);
        System.out.println("Your country have a population of " + population + "Billion");
        System.out.println("Your country have a GDP of " + GDP);

        scanner.close();
    }
}