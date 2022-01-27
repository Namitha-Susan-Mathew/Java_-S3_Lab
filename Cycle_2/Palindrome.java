//Program to find whether a string is palindrome or not
import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        String S;
        int a,i=0,j,b=0;
        System.out.println("Enter a string : \n");
        Scanner obj=new Scanner(System.in);
        S=obj.next();
        a=S.length();
        j=a-1;
        while(i<j)
        {
            if(S.charAt(i)==S.charAt(j))
            {
                i++;
                j--;
                b=1;
            }
            else
            {
                b=0;
                break;
            }
        }
        if(b==1)
            System.out.println("The string "+S+" is a palindrome");
        else
            System.out.println("The string "+S+" isn't a palindrome");
    }
}
