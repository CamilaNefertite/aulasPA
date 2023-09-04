package lacoRepeticao;
import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int i=1, n, r;
				
		System.out.println("Digite um número para calcular a tabuada:");
		n = in.nextInt();
				
		while (i<=10){
		r= n*i;
		System.out.println (""+n+" x "+i+" = "+r+"");
		i++;
					
		}
	}
}