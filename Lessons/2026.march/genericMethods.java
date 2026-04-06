// Generic class (but note: class-level <T> is NOT used here)
class Utility<T> {

    // Generic method (this <T> is separate from class <T>)
    // It allows this method to work with ANY type (Integer, String, Double, etc.)
    static <T> void printArray(T[] arr){

        // Enhanced for-loop (for-each)
        // Iterates through each element of the array
        for (T element : arr){

            // Print each element
            // (element + "") converts element to String implicitly
            System.out.println(element + "");
        }

        // Print empty line after each array output
        System.out.println();
    }
}

class genericMethods {
    public static void main(String[] args) {
    
        // Array of Integers
        Integer[] intArr = {1,2,3,4};

        // Array of Strings
        String[] strArr = {"A","B","C"};

        // Array of Doubles
        Double[] dblArr = {1.1,2.2,3.3};

        // Calling the same generic method with different types

        // Here T becomes Integer
        Utility.printArray(intArr);

        // Here T becomes String
        Utility.printArray(strArr);

        // Here T becomes Double
        Utility.printArray(dblArr);
    }
}