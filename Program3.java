import java.util.Scanner;


public class Program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        oddNumbersSeries2(a);
    }
    public static void oddNumbersSeries2(int a){
        if(a<=0){
            System.out.println("0");
            return;
        }
       int odd=(a%2==0)?a-1:a;
       if(odd<=0){
           System.out.println("0");
           return;
       }
       int number=1;
       for(int i=1;i<=odd;i++){
           System.out.print(number);
            if(i<odd){
                System.out.print(", ");
            }
            number+=2;
       }
        
    }
}

/*
Sample Input and Output

Enter a number
Input a: 0
Output :0

Enter a number
Input a :4
Output :1, 3, 5

Enter a number
Input a:3
Output :1, 3, 5

*/