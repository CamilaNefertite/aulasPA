package vetores;
import java.util.Scanner;
public class Busca {
	public static void main(String[]args) {
	Scanner in = new Scanner (System.in); 	
		int a[] = new int [10];
		int busca, resp, i;
		
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o " +(i+1)+ "� valor que deseja armazenar:");
			a[i]=in.nextInt();	
		}
		
		System.out.println("Deseja buscar algum valor? Digite '1' para 'sim':");
		resp=in.nextInt();
			if(resp==1){
				System.out.println("Digite o valor que voc� deseja procurar:");
				busca=in.nextInt();
				
				for(i=0; i<1; i++) {
					if(busca==a[i]) {
						System.out.println("O valor que voc� digitou est� SIM armazenado!");
					}else {
						System.out.println("O valor que voc� digitou N�O est� armazenado!");
					}
				}
				
			}else {
				System.out.println("Obrigada!");
				
			}

	}
}