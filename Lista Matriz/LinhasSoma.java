import java.util.Scanner;
public class LinhasSoma{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[3][4];
        int i, j, soma=0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Digite os números:");
                matriz[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }matriz[i][3] = soma;
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
