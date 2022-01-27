//Program to find the second largest element in an array 
import java.util.*;
class Seclargest 
{
    public static void main(String args[])
    {   
        int []A = new int[10];
        int i,a,c=0,large,seclarge;
        System.out.println("Enter the number of elements to be entered into the array : \n");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Enter the elements : \n ");
        for(i=0;i<a;i++)
        {
            A[i]=obj.nextInt();
        }
        large=A[0];
        for(i=1;i<a;i++)
        {
            if (large<A[i])
                large=A[i];
                c=i;
        }
        seclarge=A[0];
        for(i=1;i<a;i++)
        {
            if(i!=c)
            {
                if (seclarge<A[i] && seclarge<large)
                    seclarge=A[i];
            }
        }
        System.out.println("The second largest element is "+seclarge);
    }
}
