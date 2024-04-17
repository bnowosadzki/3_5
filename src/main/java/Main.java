import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj wysokość trójkąta");
        int height = new Scanner(System.in).nextInt();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój znak: ");
        String name = scanner.next();

        for (int row = 1; row <= height; row++) {
 
            for (int col = 1; col <= row; col++) {

                if (col == 1 || row == height || col == row) {
                    System.out.print(name);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
