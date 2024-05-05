package md.tekwillacademy.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        System.out.println("Sum of odd numbers from 0 to 10:");
        //sum of the odd numbers from 0 to 10
        int totalSumImpare = 0;
        for (int i=0; i<=10; i++){
            if (i%2 ==1) {
                totalSumImpare += i;
                // totalSum = totalSum +iterator
                System.out.println("Iterator: "+i);
                System.out.println("Total Sum: "+totalSumImpare);
            }
        }

        System.out.println("Sum of even numbers from 0 to 10:");
        //sum of even numbers from 0 to 10
        int totalSumPare = 0;
        for (int i=1; i<=10; i++){
            if (i%2 ==0){{
                totalSumPare +=i;
                System.out.println("Iterator: "+i);
                System.out.println("Total Sum: "+totalSumPare);
            }}
        }
    }
}
