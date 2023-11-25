package Java_Programs;
// Array - One Dimensional

public class program16 {
    public static void main(String[] args) {
        int [] myFirstAray = { 45, 88, 34, 10 ,50};

        System.out.println(myFirstAray[1]);
        myFirstAray[2] = 40;   // Update the array
        System.out.println(myFirstAray[2]);
        System.out.println(" Length of array is " + myFirstAray.length);
        int sumOfFirstArray = 0;

        for(int i = 0; i < myFirstAray.length; i++ ){
            sumOfFirstArray += myFirstAray[i];
            System.out.println(myFirstAray[i]);
        }
        System.out.println(" Sum of First Array if " + sumOfFirstArray);

        System.out.println(" _______________ new array _____________");

        float [] mySecondArray = new float[3];
        mySecondArray[0] = 20.6f;
        mySecondArray[1] = 40.78f;
        mySecondArray[2] = 60.1112332f;

        float sumOfSecondArray = 0;

        for (float num : mySecondArray) {
            sumOfSecondArray += num;
            System.out.println(num);
        }
        System.out.println(" Sum of Second Array is " + sumOfSecondArray);
    }
}
