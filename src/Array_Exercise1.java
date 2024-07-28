import java.util.Scanner;

public class Array_Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Número linhas x colunas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("-------------------------");

        System.out.println("MATRIZ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        System.out.println("MAIN DIAGONAL:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
        sc.close();

        System.out.println("-------------------------");

        System.out.println("NEGATIVE NUMBERS:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0 ) {
                    System.out.print(matriz[i][j] + " ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Total = " + count);

    }
}