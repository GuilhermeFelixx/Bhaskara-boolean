
import classes.Baskara;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Baskara b1 = new Baskara();
        System.out.println("Informe Valor De A:");
        b1.setValorDeA(ler.nextFloat());
        System.out.println("Informe Valor De B:");
        b1.setValorDeB(ler.nextFloat());
        System.out.println("Informe Valor De C:");
        b1.setValorDeC(ler.nextFloat());

        boolean eValida = b1.validarBaskara();
        if (eValida) {
            double x1 = b1.calcularResultadoParaX1();
            double x2 = b1.calcularResultadoDeX2();
            System.out.println("x1=" + x1 + "x2=" + x2);
        } else {
            System.out.println("Não é possível calcular com esses valores");
        }

    }
}
