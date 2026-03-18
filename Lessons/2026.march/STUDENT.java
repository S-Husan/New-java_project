import java.util.Scanner;

class InnerSTUDENT {
    String name;
    int id;
    int[][] mark = { { 33, 45, 67 },
                     { 22, 33, 64 },
                     { 45, 84, 93 }
};

    InnerSTUDENT(String name, int id, double mark, double mark2, double mark3) {
        this.name = name;
        this.id = id;
        this.mark = mark ;

    }
}

public class STUDENT {
    public static void main(String[] args) {
        InnerSTUDENT S1 = new InnerSTUDENT("Husan", 17, 2, 3, 4);
        InnerSTUDENT S2 = new InnerSTUDENT("Ali", 13, 3, 4, 6);
        InnerSTUDENT S3 = new InnerSTUDENT("Kamron", 17, 2, 4, 3);

    }
}
