// import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // System.out.println("You entired: " + num);
        // sc.close();
        // ................
        // String s ="let us extarct substring";
        // String j = s.substring(7);
        // System.out.println(j);
        // String k =s.substring(7,14); 
        // System.out.println(k);
        ///////////////////////////
        String s = "Hello ";
        String d = "Hello ";

        // checks content of object
        int a = 100;
        String p = s+a;
        System.out.println(p);
        if(s.equals(d)){
            System.out.println("The contens are eqaul");
        }
        else{
            System.out.println("The contents are not eqaul");
        }
    
// checks what type of object it referce
        if(s == d){
            System.out.println("They are eqal,their type");
        }
        else{
            System.out.println("They are not equal by type");
        }
    }
}
    

