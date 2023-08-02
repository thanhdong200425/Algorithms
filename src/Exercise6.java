public class Exercise6 {
    void print(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= 2 * h - 1; j++) {
                int number = 1;
                if (j <= h - i || j > h - i + 2 * i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Exercise6 exercise6 = new Exercise6();
        exercise6.print(5);
    }
}
