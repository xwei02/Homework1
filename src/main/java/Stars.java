public class Stars {
    public static void printStars(int space, int stars) {
        String outStr = "";
        for (int i = 0; i < space; i++) {
            outStr += " ";
        }
        for (int i = 0; i < stars; i++) {
            outStr += "*";
        }
        System.out.println(outStr);
    }public static void printPyramid(int n) {
        int stars =(n*2)-1;
        int space = 0;
        while (stars >= 1) {
            printStars(space, stars);
            space++;     //空格每次加一
            stars -= 2;  //star每次減少兩個
        }
    }
    public static void main(String[] args) {
        printPyramid(2);
        System.out.println("==============");
        printPyramid(3);
        System.out.println("==============");
        printPyramid(4);
        System.out.println("==============");
    }
}