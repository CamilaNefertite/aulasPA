//questao1
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[20];
        int b[] = new int[20];
        int j = 0, i;

        for(i=0; i<20;i++) {
        	System.out.println("Digite o " +(i+1)+ "º valor:");
			a[i] = in.nextInt();
        }
        
        for (i = 0; i<20; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            }
        }

        for (i = 0; i<20; i++) {
            if (a[i] % 2 != 0) {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println("Aqui estam os elementos separados em par e ímpar. \n(Os primeiros elementos são os pares)");
        for (i = 0; i <20; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
