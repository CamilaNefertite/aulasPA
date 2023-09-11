package lacoRepeticaoLista2;
import java.util.Scanner;
	public class fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=1, multi=1, numero;

        System.out.println("Digite o número que você quer saber.");
        numero = in.nextInt();

        while(i<=numero){
            multi*=i;
            i++;
            }
            System.out.println("O fatorial do número "+numero+" é: "+multi+"");
    }
}