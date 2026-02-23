// public class decision_control {
//     public static void main(String[] args) {
//         System.out.println(Integer.toBinaryString(-23));
//         int a;
//         a = -23;
//         if ((~a+1) < a) // Boolean 
//         {
//             System.out.println("a is positive");
//         }
//         else{
//             System.err.println("a is negative");
//         }
//     }
// }
public class decision_control {
    public static void main(String[] args) {

        int Number = 5;
        // positive
        if (Number > 0){
            System.out.println("this number is positive");
        }
        else if(Number < 0){
            System.out.println("This is negative number ");
        }
        else{
            System.out.println("this number is zero");
        }

        // odd or even
        if(Number % 2 == 0){
            System.out.println("this is even");
        }
        else{
            System.out.println("this is odd");
        }

        // divisible by 5 
        if (Number % 5 ==0 ){
            System.out.println("this can be devided by 5");
        }
        else{
            System.out.println("this is can't be devided by 5");
        }


        // 3 digit number
        if (Number >= 99 && Number <= 999){
            System.out.println("This is 3 digit number");
        }
        else{
            System.out.println("this is not 3 digit");
        }
        // char grade = 'D';

        // if (grade == 'A') {
        //     System.out.println("You got A grade");
        // } else if (grade == 'B') {
        //     System.out.println("You got B grade");
        // } else if (grade == 'C') {
        //     System.out.println("You got C grade");
        // } else if (grade == 'D') {
        //     System.out.println("You got D grade");
        // } else {
        //     System.out.println("Invalid grade");
        // }
        // /////////////////////////////
        // int count = 5; // Initialization

        // while (count > 0) {
            // Condition
            // System.out.println("Countdwon" + count);
            // count--; // Update (Decrement)

            // System.out.println("Blast off!");
        // }
        ///////////////////////////////////////////
        // fOR LOOP
        // for (int i = 5; i > 0; i--) {
        //     System.out.println("Countdown " + i);
        // }

        // for (int i =1; i < 10 ; i++){
        //     System.out.println("Number + i");
        // }

        int i = 10;
        while (i > 0){
            System.out.println(i);
            i--;
        }
        // System.out.println("Blast off");

//////////
/// 
        // int number = 25;
        // if (number % 5 == 0) {
        //     System.out.println("Number is divisible by 5");
        // }else if () {
        //     System.out.println("Number is NOT divisible by 5");
        // }
        // else{
        //     System.err.println("is 0");

        // }


        //////////////////////////////
        /// positive or negative
        // int number = 1; 
        // if (number > 0) {
        //     System.out.println("Number is Positive");
        // }
        // else if (number < 0) {
        //     System.out.println("Number is Negative");
        // }
        // else {
        //     System.out.println("Number is Zero");
        // }
        // // odd or even
        //  int num = 1; 
        // if (num % 2 == 0) {
        //     System.out.println("Number is Even");
        // } else {
        //     System.out.println("Number is Odd");
        // }

        // /// 5 devisione
        //   int n = 1; 
        // if( n % 5 == 0 ){
        //     System.out.println("Number devides by 5");
        // }
        // else if( number % 5 != 0 ){
        //     System.out.println("Number is not devided by 5");
        // }

        // // 3 didgits
        //  int N = 200; 
        // if (N >= 99 && N<= 999){
        //     System.out.println("this number 3 digit");
        // }
        // else{
        //     System.out.println("This is not 3 digit number");
        // }
    }
}

