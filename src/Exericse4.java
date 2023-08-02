public class Exericse4 {
    void write() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print("\n");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Exericse4 exericse4 = new Exericse4();
        exericse4.write();
    }
}
