import java.util.Scanner;

class student {
    int id;
    String name;
    String major;
    String contact;

    void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type id: " );
        id = sc.nextInt();
        System.out.println("Type name:");
        name = sc.nextLine();
        System.out.println("Type major: ");
        major = sc.nextLine();
        System.out.println("Type contact: ");
        contact = sc.nextLine();
    }

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        System.out.println("Your id is :"+id  );
        name = sc.nextLine();
        System.out.println("Your name is :" +name);
        major = sc.nextLine();
        System.out.println("Your major is :" + major);
        contact = sc.nextLine();
        System.out.println("Your contact is :" + contact);
        sc.close();
    }
}
// belove i need to creat setDetails and getDetails but with DataInterface <T>==> T obj;  
class DataInterface <T>{
    
    Scanner sc = new Scanner(System.in);
    // T obj;   // 
    
    // void  getDetails(T){
        //    Scanner sc = new Scanner(System.in);
        // this.T = T;
        
        sc.close();
        
    }
    
    
// }

public class genericProgramming {
    public static void main(String[] args) {
        // student ns = new student();
        // System.out.println("The name is :" sc.name[]);
        // szztudent.getDetails();


    }
}
