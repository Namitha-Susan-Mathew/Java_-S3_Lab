//Program to find the frequency of a given character in a string
import java.util.*;
class Frequency 
{
    public static void main(String[] args)
    {
        String S;
        int a,i,c=0;
        char b;
        System.out.println("Enter a string : \n");
        Scanner obj=new Scanner(System.in);
        S=obj.next();
        a=S.length();
        System.out.println("Enter the character whose frequency in the string is to be found : \n");
        b=obj.next().charAt(0);
        for(i=0;i<a;i++)
        {
           if(S.charAt(i)==b)
               c++;
        }
        System.out.println("The frequency of the character "+b+" in the string "+S+" is "+c);
    }
}
