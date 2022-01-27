//Program to find the smallest element in an array
import java.util.*;
class Smallest 
{
    public static void main(String args[])
    {   
        int []A = new int[10];
        int i,a,small;
        System.out.println("Enter the number of elements to be entered into the array : \n");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("Enter the elements : \n ");
        for(i=0;i<a;i++)
        {
            A[i]=obj.nextInt();
        }
        small=A[0];
        for(i=1;i<a;i++)
        {
            if (small>A[i])
            {
                small=A[i];
            }
        }
        System.out.println("The smallest element in the array is "+small); 
    }
}
