import java.util.*;
class Factorial_Sum 
{
    public static void main(String[] args) 
    {
        Factorial_Sum obj=new Factorial_Sum();
        obj.Factorial();
    }
    void Factorial ()
    {
        int a,i,b=1;
        System.out.println("Enter a number : \n");
        Scanner obj1=new Scanner(System.in);
        a=obj1.nextInt();
        for(i=a;i>=1;i--)
            b=b*i;
        System.out.println("The factorial of the number "+a+" is "+b);
        Factorial_Sum obj2=new Factorial_Sum();
        obj2.Sum(a);
    }
    void Sum(int a)
    {
        int r,sum=0,b;
        b=a;
        while (a>0)
        {
            r=a%10;
            sum=sum+r;
            a=a/10;
        }
        System.out.println("The sum of digits of the number "+b+" is "+sum);
    }
}
