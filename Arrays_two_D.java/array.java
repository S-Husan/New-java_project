// package Arrays_two_D.java;

// 2D array = An array where each element is an array
// Useful for storing a matrix of data

public class array {
    public static void main(String[] args) {
        // String[] fruits = { "apple", "orange", "banana" };
        // String[] vegetables = { "potato", "onion", "carrot" };
        // String[] meats = { "chicken", "pork", "beef", "fish" };

        String[][] groceries = { { "apple", "orange", "banana" },
                { "potato", "onion", "carrot" },
                { "chicken", "pork", "beef", "fish" } };
        groceries[0][0]= "Baklajan";



        // String[][] groceries = { fruits, vegetables, meats };
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");

            }

            System.out.println();
        }

    }
}
