import java.util.Scanner;


public class Program2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        oddNumbers(a);
    }
    public static void oddNumbers(int a){
        if(a<=0) {
            System.out.println("0");
            return;
        }
        int number=1;
        for(int i=1;i<=a;i++){
            System.out.print(number);
            if(i<a){
                System.out.print(", ");
            }
            number+=2;
        }
        
        
    }
}

/*
Sample Input and Output

Enter a number
Input a: -7
Output :0

Enter a number
Input a :9
Output :1, 3, 5, 7, 9, 11, 13, 15, 17

*/