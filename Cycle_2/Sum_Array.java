//Program to find the sum of elements in an array
import java.util.*;
class Sum_Array
{
    public static void main(String args[])
    {   int []A = new int[10];
        int i,a,sum=0;
        System.out.println("Enter the number of elements to be entered into the array : \n");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Enter the elements : \n ");
        for(i=0;i<a;i++)
        {
            A[i]=obj.nextInt();
            sum=sum+A[i];
        } 
        System.out.println("The sum of elements in the array is "+sum);
    }
}
