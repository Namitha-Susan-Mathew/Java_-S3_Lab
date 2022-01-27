//Program to check whether the given number is odd or even
import java.util.*;
import javax.lang.model.util.ElementScanner14;
class Odd {
    public static void main (String args[]){
        int a;
        System.out.println("Enter a number : \n");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        if (a%2==0)
            System.out.println(a+" is even");
        else
            System.out.println(a+" is odd");
        }
    }
