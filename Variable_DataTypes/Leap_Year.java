import java.util.Scanner;

public class Leap_Year {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("This is leap year!!");
                } else {
                    System.out.println("This is not leap year!!");
                }
            } else {
                System.out.println("This is leap year!!");
            }
        } else {
            System.out.println("This is not leap year!!");
        }

        sc.close();
    }

}