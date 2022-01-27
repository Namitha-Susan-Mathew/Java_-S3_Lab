import java.util.*;
class Frequency_Rev 
{
    public static void main(String[] args)
    {
        Functions obj=new Functions();
        obj.Frequency();
    }
}
class Functions
{
    void Frequency()
    {
        String S;
        int a,i,c=0;
        char b;
        System.out.println("Enter a string : \n");
        Scanner obj1=new Scanner(System.in);
        S=obj1.next();
        a=S.length();
        System.out.println("Enter the character whose frequency is to be found : \n");
        b=obj1.next().charAt(0);
        for(i=0;i<a;i++)
        {
            if(S.charAt(i)==b)
                c++;
        }
        System.out.println("The frequency of the character "+b+" in the string is "+c);
        Functions obj2=new Functions();
        obj2.Rev(S);
    }
    void Rev(String S)
    {
        int a=S.length();
        String rev="";
        for(int i=0;i<a;i++)
        {
            rev+=S.charAt(a-1-i);
        }
  
        System.out.println("Reversed string is:"+rev);
    }
 }

