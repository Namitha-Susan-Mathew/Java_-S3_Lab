//Program to find the sum of first n natural numbers
import java.util.*;
class Sum_n {

    public static void main(String args[]){
        int a,i,sum;
        sum=0;
        System.out.println("Enter the number till which the sum is to be found : \n");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        for(i=1;i<=a;i++)
            sum=sum+i;
        System.out.println("Sum of first "+a+" natural numbers is "+sum);
    }
}
