//Program to replace a particular element in an array
import java.util.*;
class Replace 
{
    public static void main(String args[])
    {   
        int []A = new int[10];
        int i,a,b,d;
        System.out.println("Enter the number of elements to be entered into the array : \n");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Enter the elements : \n ");
        for(i=0;i<a;i++)
        {
            A[i]=obj.nextInt();
        }
        System.out.println("Enter the element to be replaced : \n");
        b=obj.nextInt();
        System.out.println("Enter the element to be inserted : \n");
        d=obj.nextInt();
        for(i=0;i<a;i++)
        {
            if (A[i]==b)
            {
                A[i]=d;
                break;
            }
        }
        System.out.println("The required array is :\n ");
        for(i=0;i<a;i++)
            System.out.println(A[i]);
    }
}
