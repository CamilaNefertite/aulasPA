package vetores;
import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n, i = 2;
        
        do {
            System.out.println("Digite um número: ");
            n = in.nextInt();
            
            if(n%2== 0) {
                System.out.println(n + ": Primo!");
            } else {
            	System.out.println(n + ": Não é primo!");
            }
            
            i++;
            
        } while (i < 2);
        
        in.close();
        System.exit(0);
    }
}