package Java_Programs;

// Strings

public class program19 {
    public static void main(String[] args) {
        char [] myArray = {'A','B', 'C', 'D', 'E'};
        String firstString = "Ayush";
        System.out.println(myArray.length);
        System.out.println(firstString.length());

        System.out.println(firstString.charAt(2));

        System.out.println(firstString.toUpperCase());
        System.out.println(firstString.toLowerCase());

        System.out.println(firstString.contains("come")); // true;

        System.out.println(firstString + " Aryan ");

        System.out.println(firstString.concat("Aryan"));
    }
}
