package md.tekwillacademy.operationsandcyclicfunctions;

public class ArithmeticOperationExample {
    public static void main(String[] args) {
        int a = 48;
        int b = 10;

        int result = a+b;
        System.out.println("Adunarea: " + result);

        result = a-b;
        System.out.println("Scaderea: " + result);

        int result1 = a*b;
        System.out.println("Inmultirea: " + result1);

        double result2 = (double) b/a;
        System.out.println("Impartirea: "+result2);

        int result3 = a % b;
        System.out.println("Restul impartirii: "+result3);
    }
}
