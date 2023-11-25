package Java_Programs;
// Two Dimensional Array and addition

public class program17 {
    public static void main(String[] args) {

        long [][] myFirst2DArray = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        {2,3,4,5},{7,8,2,10},{100,200,300,400},{20,20,20,20}
        long sum =0 ;
        long newsum = 0;
        long finalSum =0;
        for( int row =0 ; row < myFirst2DArray.length; row++){
            sum =0;
            for ( int coloumn = 0 ; coloumn < myFirst2DArray[row].length; coloumn++){
//                System.out.print(myFirst2DArray[row][coloumn] + " ");
                sum += myFirst2DArray[row][coloumn];
            }
            newsum = sum;
            finalSum += newsum;
        }
        System.out.println(finalSum);
    }
}
