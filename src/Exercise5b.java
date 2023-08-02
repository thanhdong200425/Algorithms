public class Exercise5b {
    void print(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("$");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Exercise5b exercise5b = new Exercise5b();
        exercise5b.print(7);
    }
}
