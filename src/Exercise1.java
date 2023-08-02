public class Exercise1 {
    void printMultipleTable() {
        for (int i = 2; i < 10; i++) {
            System.out.println("Table " + i);
            System.out.println("-------------------------------");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        exercise1.printMultipleTable();
    }
}