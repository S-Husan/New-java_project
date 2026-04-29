// class Maxnumber{
//     int maxn = arr[0];
// }

public class Demo {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int i = 0;
        int sum = 0;

        while (i < array.length) {
            // Elements showing
            System.out.println("All elements are:" + array[i] + " ");
            sum =sum + array[i]; 
            i++;

        }   


        double average;
        average = sum / array.length;
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
 

        // 
        // int max = Maxnumber(array);
        // System.out.println("Max element is " + max);
    }

    // static int findMax(int[] arr)
    // {
       

    //     return 0;
    // }
}



// ///////////////////////////////////////////////////////////////////////////////////////////
