//import java.util.Scanner;

class InnerSTUDENT {
    String name;
    int id;
    double mark;
    double mark2;
    double mark3;

    InnerSTUDENT(String name, int id, double mark, double mark2, double mark3) {
        this.name = name;
        this.id = id;
        this.mark = mark;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    double getAverage() {
        return ((mark + mark2 + mark3) / 3);
    }
    double getTotal(){
        return(mark+mark2+mark3);
    }
    // String getDetails(){
    //     for(int i , i < InnerSTUDENT.length, i ++)
    //         System.out.println(i);
    }
public class STUDENT {
    public static void main(String[] args) {
        InnerSTUDENT S1 = new InnerSTUDENT("Husan", 17, 2, 3, 4);
        InnerSTUDENT S2 = new InnerSTUDENT("Ali", 13, 3, 4, 6);
        InnerSTUDENT S3 = new InnerSTUDENT("Kamron", 17, 2, 4, 3);

        // Getting Average
        System.out.println("Average of marks");
        System.out.println("Student 1: " + S1.name + " got " + S1.getAverage());
        System.out.println("Student 2: " + S2.name + " got " + S2.getAverage());
        System.out.println("Student 3: " + S3.name + " got " + S3.getAverage());

        // Getting total
        System.out.println("Total Marks");
        System.out.println("Student:"+ S1.name + " is " + S1.getTotal());
        System.out.println("Student:"+ S2.name + " is " + S2.getTotal());
        System.out.println("Student:"+ S3.name + " is " + S3.getTotal());

        // DisplayDitails
        System.out.println("Details of Student");
        
    }
}
