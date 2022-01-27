//Program to check whether the given number is prime or not
import java.util.*;
class Prime {
    public static void main(String args[]){
        int a,i,b;
        System.out.println("Enter a number : \n");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=0;
        for(i=2;i<=a/2;i++){
            if (a%i==0){
                b=1;
                break;
            }}
        if(b==1)
            System.out.println(a+" isn't a prime number");
        else
            System.out.println(a+" is a prime number");
    }
}
