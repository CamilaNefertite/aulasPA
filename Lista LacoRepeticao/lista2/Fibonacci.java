package treinos;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nAntes=0, nAtual=1, i=2;
        int nDepois, compi;
        
        System.out.println("Digite a posição desejada:");
        compi=in.nextInt();
        
        
        while (i<=compi){
            nDepois=nAtual+nAntes;
            nAntes=nAtual;
            nAtual=nDepois;
            
             System.out.println(nDepois);
            i++;
            
        }
        
    }
    
}