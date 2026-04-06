class Utility<T> {
static <T> void printArray(T[] arr){
    for (T element :arr){
        System.out.println(element + "");
    }
    System.out.println();
}
}

class genericMethods {
    public static void main(String[] args) {
    
        Integer[] intArr = {1,2,3,4};
        String[] strArr = {"A","B","C"};
        Double[] dblArr = {1.1,2.2,3.3};


        Utility.printArray(intArr);
        Utility.printArray(strArr);
        Utility.printArray(dblArr);

    }
}