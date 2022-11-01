import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入年分:");
        int n = scanner.nextInt();
        if (n%4 ==0 && n%4 !=100){
            System.out.println("閏年");
        }else if(n%400==0 && n%100==0){
            System.out.println("閏年");
        }else {
            System.out.println("不是閏年");
        }
    }
}
