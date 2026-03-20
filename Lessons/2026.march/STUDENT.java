// This class is a blueprint for creating Student objects
class InnerSTUDENT {

    // =======================
    // FIELDS (DATA / STATE)
    // =======================
    // These variables store the state (data) of each student object

    String name;   // student's name
    int id;        // student's ID
    double mark;   // mark for subject 1
    double mark2;  // mark for subject 2
    double mark3;  // mark for subject 3


    // =======================
    // CONSTRUCTOR
    // =======================
    /*
     * A constructor is a special method that:
     * 1. Has the SAME name as the class
     * 2. Has NO return type (not even void)
     * 3. Runs automatically when an object is created
     *
     * PURPOSE:
     * → Initialize (give values to) the object when it's created
     *
     * Think of it like:
     * "When I create a student, what data must I provide?"
     */
    InnerSTUDENT(String name, int id, double mark, double mark2, double mark3) {

        /*
         * "this" keyword refers to the current object
         *
         * Example:
         * this.name → the variable inside the object
         * name → the parameter passed to constructor
         *
         * So:
         * this.name = name;
         * means:
         * "store the given name into this object's name field"
         */
        this.name = name;
        this.id = id;
        this.mark = mark;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }


    // =======================
    // METHODS (BEHAVIOR)
    // =======================

    /*
     * METHOD: getAverage
     *
     * A method is a function that belongs to a class.
     * It defines behavior of the object.
     *
     * This method:
     * → takes NO input
     * → returns a value (double)
     *
     * PURPOSE:
     * → calculate average marks of the student
     *
     * WHY return?
     * → so we can reuse the result anywhere (print, compare, etc.)
     */
    double getAverage() {
        return ((mark + mark2 + mark3) / 3);
    }


    /*
     * METHOD: getTotal
     *
     * PURPOSE:
     * → calculate total marks
     *
     * Notice:
     * → no parameters needed
     * → uses object's own data (mark, mark2, mark3)
     */
    double getTotal() {
        return (mark + mark2 + mark3);
    }


    /*
     * METHOD: details
     *
     * This method prints student information.
     *
     * IMPORTANT DESIGN NOTE:
     * → This method does NOT return anything (void)
     * → It directly prints output
     *
     * Difference:
     * getAverage() → returns value
     * details() → performs action (side effect: printing)
     *
     * In real systems:
     * → returning data is usually better than printing
     */
    void details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Mark 1: " + mark);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
    }
}


// =======================
// MAIN CLASS (ENTRY POINT)
// =======================
public class STUDENT {

    public static void main(String[] args) {

        /*
         * OBJECT CREATION
         *
         * Syntax:
         * ClassName objectName = new ClassName(...);
         *
         * What happens here internally:
         * 1. Memory is allocated for object
         * 2. Constructor is called
         * 3. Values are assigned
         */

        InnerSTUDENT S1 = new InnerSTUDENT("Husan", 17, 2, 3, 4);
        InnerSTUDENT S2 = new InnerSTUDENT("Ali", 13, 3, 4, 6);
        InnerSTUDENT S3 = new InnerSTUDENT("Kamron", 17, 2, 4, 3);

        System.out.println("=========================");

        // =======================
        // USING METHODS
        // =======================

        /*
         * Calling a method:
         * objectName.methodName()
         *
         * Example:
         * S1.getAverage()
         */

        System.out.println("Average of marks");
        System.out.println("Student 1: " + S1.name + " got " + S1.getAverage());
        System.out.println("Student 2: " + S2.name + " got " + S2.getAverage());
        System.out.println("Student 3: " + S3.name + " got " + S3.getAverage());

        System.out.println("=========================");

        System.out.println("Total Marks");
        System.out.println("Student: " + S1.name + " total = " + S1.getTotal());
        System.out.println("Student: " + S2.name + " total = " + S2.getTotal());
        System.out.println("Student: " + S3.name + " total = " + S3.getTotal());

        System.out.println("=========================");

        // =======================
        // CALLING VOID METHODS
        // =======================

        /*
         * These methods do NOT return anything
         * They just execute actions (printing)
         */

        System.out.print("Details of Student");
        System.out.println(" ==>");
        S1.details();
        System.out.println("=======");

        S2.details();
        System.out.println("=======");

        S3.details();
   }}