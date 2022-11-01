import java.util.Scanner;

public class calc{
    static public void main (String[] args());
    Scanner scan=new Scanner(System.in);

    Numero n1=new Numero();
    Numero n2=new Numero();
    Numero res=new Numero();
    String ops="s"

    while (opc.equals("s") || opc.equals("S")){
    System.out.printf("%nDigite o valor 1: ");
    n1.setValor(scan.netInt());
    System.out.printf("%nDigite o valor 2: ");
    n2.setValor(scan.netInt());
    res.setValor(n1.getValor() + n2.getValor());

    System.out.printf("%dA soma de %d com %d é igual a %d", n1.getValor(),n2.getValor(),res.getValor());
    System.out.printf("%dVocê deseja somar outro valor?");
    opc=scan.next();

    while (opc.equals("n") || opc.equals("N")){
        System.out.printf("%nObrigado por usar nossa calculadora!!!%n Até a proxima.");

    }

    System.out.printf("%n%n%n");

    } 
    
}

