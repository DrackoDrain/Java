package Java_Programs;

// If - Else Statement

public class program9 {
    public static void main(String[] args) {

        boolean isSecular = true;

        if (isSecular)
        {
            System.out.println("India is a secular country");
        }
        else{
            System.out.println("India is not a secular country");
        }

        // Ternary Operator
        String msg = isSecular ? "India is a secular country" : "India is not a secular country ";
        System.out.println(msg);
    }
}
