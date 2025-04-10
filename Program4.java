import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Program4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size");
      int n=sc.nextInt();
        System.out.println("Enter the array Elemnts");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(totalCount(arr));
    }
    public static HashMap<Integer,Integer> totalCount(int[] arr){
        int[] dic={1,2,3,4,5,6,7,8,9};
	Arrays.sort(arr);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<dic.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]%dic[i]==0){
                    count++;
                }
            }
            hm.put(dic[i],count);
        }
        return hm;
    }
}

/*

Input:
Enter the size
5
Enter the array Elemnts
12 4 9 7 11

Output:
{1=5, 2=2, 3=2, 4=2, 5=0, 6=1, 7=1, 8=0, 9=1}

Input:
Enter the size
11
Enter the array Elemnts
1 2 8 9 12 46 76 82 15 20 30

Output:
{1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}

*/