//Program to print Fibonacci series upto n
import java.util.*;
class Fibonacci {
    public static void main(String args[]){
        int i,a,f=0,s=1,sum=0;
        System.out.println("Enter the number of elements to be printed in Fibonacci series : \n");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("The required Fibonacci series is : \n");
        System.out.println(f+"\n"+s);
        for(i=3;i<=a;i++){
            sum=f+s;
            System.out.println(sum);
            f=s;
            s=sum;
        }
    }
}
