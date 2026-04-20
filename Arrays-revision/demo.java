// anray = a collection of values of the same data type
// * think of it as a variable that can store more than 1 value *

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Lanana", "Cherry" };
        // fruits[0] = "Coconut";
        // int numF= fruits.length;
        // System.out.println(numF);

        // Normal loop
        // for (int i = 0; i < fruits.length; i++){
        // System.out.print(fruits[i] + " ");
        // }
        int[] numbers = {14,211,62,52,4};
        Arrays.sort(numbers);
        for(int  i  =0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
      

        // Sort method , == > HELPS TO SORT ARRY values ARFOBATICALLY
        Arrays.sort(fruits);
        System.out.println();

        // Fill method ==> replaces the values of an array
        // Arrays.fill(fruits,"Jouce");


        // Inhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);

            // }


        }
    }
}
