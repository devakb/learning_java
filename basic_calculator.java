import java.util.*;
import java.lang.*;

public class DayOne {

    public static void main(String[] $args){

        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Please enter number 1");
   
        Double number_1 =  scanner.nextDouble();
   
        System.out.println("Please enter number 2");
   
        Double number_2 =  scanner.nextDouble();
   
        System.out.println("Please enter operation type");
   
        scanner.nextLine();
        String oparationType = scanner.next();
        scanner.close();
   
        doOperation(oparationType, number_1, number_2);
   
    }

    public static void doOperation(String oparationType, Double number_1, Double number_2){

        Double output = Double.valueOf("0");

        switch (oparationType){
            case "+":
                output = number_1 + number_2;
                break;
            case "-":
                output = number_1 - number_2;
                break;
            case "*":
                output = number_1 * number_2;
                break;
            default:
                output = number_1 / number_2;
                break;
        }


        System.out.println("Operation is " + oparationType);
        System.out.println("Operation Completed and Output is " + output);

        return;

    }


}