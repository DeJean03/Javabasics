import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int j, k;
        j = 10;
        j = 5;
        k = j;
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        k = j = 10;
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
        AssignmentOperatorsDemo asOD = new AssignmentOperatorsDemo();
        asOD.ArithmeticDemo();
        asOD.logicalOperatorDemo();
        asOD.bitwiseOperatorDemo();
        asOD.ternaryOperatorDemo();
        asOD.unaryOperatorDemo();
    }
}


