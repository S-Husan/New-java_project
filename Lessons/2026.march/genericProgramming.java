// import javax.annotation.processing.Generated;

// class GenericDemo<T> {
//     T obj;
//     GenericDemo(T o) {
//         obj = o;
//     }
//     public T getObj() {
//         return obj;
//     }
// }

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

class DataInterface <T>{

    T obj;
    
    void  getDetails(){
           Scanner sc = new Scanner(System.in);
           
           


           sc.close();
    }

}

public class genericProgramming {
    public static void main(String[] args) {
        student ns = new student();
        System.out.println(ns);

        // GenericDemo <Integer> iob = new GenericDemo<>(100);
        // int x = iob.getObj();
        // System.out.println(x);
        // GenericDemo <String> sob = new GenericDemo<>("Hello");
        // String str = sob.getObj();
        // System.out.println(str);

    }
}
//
