//Program to replace a particular character in a string
import java.util.*;
class Char_replace 
{
    public static void main(String[] args) 
    {
        String S;
        char a,b;
        int i;
        System.out.println("Enter a string");
        Scanner obj=new Scanner(System.in);
        S=obj.next();
        System.out.println("Enter the character to be replaced : \n");
        a=obj.next().charAt(0);
        System.out.println("Enter the character to be inserted : \n");
        b=obj.next().charAt(0);
        S=S.replace(a,b);
        System.out.println(S);
    }
}
