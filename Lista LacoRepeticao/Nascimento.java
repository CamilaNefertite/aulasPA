import java.util.Scanner;
public class Nascimento {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int i=1, anoAtual, anoNasc, idade;
		
		do{
			System.out.println("Digite seu ano de nascimento");
			anoNasc= in.nextInt();
			
			System.out.println("Digite o ano atual");
			anoAtual=in.nextInt();
			
			idade = anoAtual-anoNasc;
			
			System.out.println("Você tem "+idade+" anos");
			
				if(idade<18){
					System.out.println("Você é menor de idade");
				}else {
					System.out.println("Você é maior de idade");
				}
			System.out.println("Deseja continuar a execução?");
	}
}


