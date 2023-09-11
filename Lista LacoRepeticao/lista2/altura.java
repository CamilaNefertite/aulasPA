package lacoRepeticaoLista2;
public class altura {
    public static void main(String[] args) {
        double i = 0;
        double ca1 = 134, ca2 = 145;

        while(ca1<=ca2) {

            ca1 = ca1+2.5;
            ca2 = ca2+2;
            i++;
        }
        System.out.println("Irá demorar "+i+" anos para João ficar mais alto que Pedro.");

    }
}
