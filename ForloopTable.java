package ForloopTable;

public class ForloopTable {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 2; j <= 10; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
