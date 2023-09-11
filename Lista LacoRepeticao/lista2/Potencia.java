package treinos;
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=1;
        double resultado=1;
        double expoente, base;
        
     	   System.out.println("Digite o número da base:");
     	   base = in.nextDouble();
        
     	   System.out.println("Digite o número do expoente:");
   	     expoente = in.nextDouble();
        
    	    while (i<=expoente){
        			resultado*=base;
    	        i++;
				    }
        
        System.out.println("O resultado é: "+resultado+"");
    }
    
}