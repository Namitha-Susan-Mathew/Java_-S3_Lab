//Program to find factors of a given number
import java.util.*;
class Factor {
    public static void main(String args[]){
        int a,i,sum;
        System.out.println("Enter the number whose factors is to be found : \n");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("The factors of "+a+" are : \n");
        for(i=1;i<=a;i++){
            if(a%i==0)
            System.out.println(i);
        }
    }
}
