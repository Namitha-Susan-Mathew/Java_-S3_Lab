//Program to find the factorial of a given number
import java.util.*;
class Factorial{
    public static void main(String args[]){
        int a,i,b;
        b=1;
        System.out.println("Enter a number : \n");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        for(i=a;i>=1;i--)
            b=b*i;
        System.out.println("The factorial of "+a+" is "+b);
    }
}
        
