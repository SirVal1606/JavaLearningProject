package md.tekwillacademy.operationsandcyclicfunctions;

import java.sql.SQLOutput;

public class GradeSystemService {
    public static void main(String[] args) {
        int grade = 75;
        if (grade >= 90){
            System.out.println("Grade is: A");
        }else if (grade >= 80) {
            System.out.println("Grade is: B");
        }else if (grade >=70){
            System.out.println("Grade is: C");
        }else if (grade >=60){
            System.out.println("Grade is: D");
        }else {
            System.out.println("Grade is: E");
        }
    }
}
