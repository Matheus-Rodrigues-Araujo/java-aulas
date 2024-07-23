import java.util.Scanner;

public class Matrizes_exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Lines x Columns: ");
        int lines = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matriz = new int[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Number of choice: ");
        int number = sc.nextInt();
        System.out.println();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (matriz[i][j] == number) {
                    System.out.println("Position: " + i + ", " + j);
                    if (j - 1 > 0) {
                        System.out.println("Left: " + matriz[i][j -1]);
                    }
                    if (j + 1 < columns){
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i + 1 < lines){
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                    if (i - 1 > 0){
                        System.out.println("Up: " + matriz[i + 1][j]);
                    }

                }
            }
        }

    }
}