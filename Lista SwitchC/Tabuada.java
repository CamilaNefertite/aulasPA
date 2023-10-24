package vetores;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[5];
		int i=0, j;
		int resul, num;
		
		for(i=0; i<5; i++) {
			System.out.println("Digite o valor " +(i+1));
			a[i] = in.nextInt();
			
			for (j=1; j<=10; j++) {
				resul=a[i]*j;
				System.out.println (""+a[i]+" x "+j+" = "+resul+"");
			}
		}
	
	}
}
