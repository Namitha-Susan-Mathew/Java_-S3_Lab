//Program to check whether the given number is Armstrong or not
import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        int org,a,i,r,b=0,sum=0;
        System.out.println("Enter a number : \n");
        Scanner obj = new Scanner(System.in);
        org=obj.nextInt();
        a=org;
        while(a>0)
        {
            a=a/10;
            b++;
        }
        a=org;
        while(a>0)
        {
            int c=1;
            r=a%10;
            for(i=0;i<b;i++)
            {
                c=c*r;
            }
            sum=sum+c;
            a=a/10;
        }
        if(org==sum)
            System.out.println("The number "+org+" is an armstrong number");
        else
        System.out.println("The number "+org+" isn't an armstrong number");
    }
}
    

