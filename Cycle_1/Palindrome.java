// Program to check whether the given number is palindrome or not
import java.util.*;
class Palindrome {
    public static void main(String args[]){
        int org,a,r,rev=0;
        System.out.println("Enter a number : \n");
        Scanner obj = new Scanner(System.in);
        org=obj.nextInt();
        a=org;
        while(a>0)
        {
            r=a%10;
            rev=(rev*10)+r;
            a=a/10;
        }
        if(org==rev)
            System.out.println("The number "+org+" is a palindrome");
        else
            System.out.println("The number "+org+" isn't a palindrome");
    }
}
