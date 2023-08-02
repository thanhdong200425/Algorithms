public class Exercise5a {
    void print(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
             System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Exercise5a exercise5A = new Exercise5a();
        exercise5A.print(7);
    }
}
