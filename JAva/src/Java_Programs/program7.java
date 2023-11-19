package Java_Programs;
// Increment and Decrement Operator

public class program7 {
    public static void main(String args[]){

        // Prefix -> First increment/decrement the value then use
        // Postfix -> First use the value then increment/decrement.

        int age = 10;
        int newage = age++;
        // int newage = 10;
        // age = age+ 1; => age = 11;

        System.out.println(age);
        System.out.println(newage);

        int oldage  = 20;
//        System.out.println(oldage++);
//        System.out.println(++oldage);
        System.out.println(oldage++ + ++oldage); // oldage++ -> 20 then oldage = oldage+1-> 21 so ++oldage -> 22 so final ans = 20+22;
    }
}
