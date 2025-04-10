import java.util.Scanner;

class Calc{
    public double operation(double a, double b, String operator){
        switch(operator.toLowerCase()){
            case "add":
                case "+":
                return a+b;
            case "subtract":
                case "-":
                return a-b;
             case "multiply":
                 case "*":
                return a * b;
            case "divide":
                case "/":
                if(b != 0) {
                    return a / b;
                } else {
                    System.out.println("Division can not be performed");
                    return Double.NaN;
                }
            default:
            System.out.println("Invalid operation");
            return Double.NaN;
        }
    }
}
public class Program1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        double a =sc.nextDouble();
        System.out.println("Enter swecond number");
        double b=sc.nextDouble();
         sc.nextLine();
        System.out.println("Enter the operations to be performed");
        String operator=sc.nextLine();
        
        Calc cal=new Calc();
        System.out.println(cal.operation(a,b,operator));
    }
}



/*
Sample Input and Output

Input:
Enter first number
45.7
Enter swecond number
77.6
Enter the operations to be performed
divide

Output:
0.588917525773196

Input:
Enter first number
10.4
Enter swecond number
44.2
Enter the operations to be performed
+

Output:
54.6

*/