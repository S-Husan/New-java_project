class Parent{
    Parent(int j){
        System.out.println("Parent cons");
    }
}

class Child extends Parent{
    Child(int i){
        super(i);
        System.out.println("Child cons");
    }

    // to execute parent's constructor
    // super access parent's fields and methods
}

class example {
    public static void main(String[] args) {
        Parent ch1 = new Child(1);
    }
}
