package lacoRepeticao;
import java.util.Scanner;
public class idadePessoas {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int i=1, a;
			
		while (i<=10){
			System.out.println("Digite a idade da pessoa:");
		a = in.nextInt();
			
			if(a<=18){
				System.out.println("Você é menor de idade");
				
			}else {
				System.out.println("Você é maior de idade");
			}
		i++;
		}

	}

}