import java.util.Scanner;

public class Input_with_arrays {
    public static void main(String[] args) {
        // String[] foods = {};
        // System.out.println("Now the length of this food array is :"+foods.length);

        Scanner S = new Scanner(System.in);

        
        String[] Fs;
        int size;
        System.out.print("Enter number of food u want! ");
        // Fs[0] = "Burger";
        // Fs[1] = "Pizza";
        // Fs[2] = "Lavash";
        size = S.nextInt();
        S.nextLine();

        Fs = new String[size];


        
        for(int i = 0; i < Fs.length; i++ ){
            System.out.print("Enter a food:");
            Fs[i] = S.next();  // < ===explain this
        }
        // for(int i = 0; i < Fs.length; i++){
        //     System.out.println(Fs[i]);

        // }
        
        // System.out.println("Now the lenth is :"+Fs.length);
        // for (String f : Fs){
        //     System.out.print(f+ " ");
            
        // }        
        
        S.close();
    }
}
