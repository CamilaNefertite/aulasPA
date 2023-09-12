import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nAntes=0, nAtual=1, i=2;
        int nDepois, posicao;
        
        System.out.println("Digite a posição desejada:");
        posicao=in.nextInt();
        
        
        while (i<=posicao){
            nDepois=nAtual+nAntes;
            nAntes=nAtual;
            nAtual=nDepois;
            
             System.out.println(nDepois);
            i++;
            }
    }
}
