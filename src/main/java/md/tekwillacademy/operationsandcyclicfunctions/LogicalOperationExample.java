package md.tekwillacademy.operationsandcyclicfunctions;

public class LogicalOperationExample {
    public static void main(String[] args) {
        System.out.println(((876%5)>1) && (true));
        System.out.println(!(((876%5)>1) && (true)));
        System.out.println(false || (365%5)<=0);
    }
}
