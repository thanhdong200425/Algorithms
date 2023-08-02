import java.util.Scanner;

public class Exercise5c {
    void print(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 2 * num - 1; j++) {
                if (j <= num - i || j > num - i + 2 * i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Exercise5c exercise5c = new Exercise5c();
        exercise5c.print(5);
    }
}