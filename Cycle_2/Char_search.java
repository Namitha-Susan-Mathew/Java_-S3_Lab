//Program to search for a particular character in a string
import java.util.*;
class Char_search 
{
    public static void main(String[] args) 
    {
        String S;
        int a,i,c=0;
        char b;
        System.out.println("Enter a string : \n");
        Scanner obj=new Scanner(System.in);
        S=obj.next();
        System.out.println("Enter the character to be searched : \n");
        b=obj.next().charAt(0);
        a=S.length();
        for(i=0;i<a;i++)
        {
            if(S.charAt(i)==b)
            {
                c=1;
                break;
            }
        }
        if(c==1)
            System.out.println("The character "+b+" is present in the string");
        else
            System.out.println("The character "+b+" isn't present in the string");
    }
}
