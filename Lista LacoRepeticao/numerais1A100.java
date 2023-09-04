package lacoRepeticao;
import java.util.Scanner;
public class numerais1A100 {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int i=1, n, r;
		
		System.out.println("Digite o número '0';");
		n = in.nextInt();
		
		while(i<=99){
		r = i+1;
		
		System.out.println(""+r+"");
		i++; 
		}
	}
}