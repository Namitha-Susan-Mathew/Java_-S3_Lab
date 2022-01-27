/* Program to add two numbers*/
import java.util.*;
class Add {
     public static void main(String args[]){
         int a,b,sum;
         System.out.println("Enter two numbers : ");
         Scanner obj=new Scanner(System.in);
         a=obj.nextInt();
         b=obj.nextInt();
         sum=a+b;
         System.out.println("Sum of the two numbers is "+sum);
        }
    }
