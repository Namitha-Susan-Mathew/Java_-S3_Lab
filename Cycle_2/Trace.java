//Program to find trace of a matrix
import java.util.*;
class Trace 
{
        public static void main(String[] args) 
    {
        int [][]A = new int[10][10];
        int r,c,i,j,trace=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix : \n");
        r=obj.nextInt();
        System.out.println("Enter the number of columns in the matrix : \n");
        c=obj.nextInt();
        System.out.println("Enter the elements into the matrix : \n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(i==j)
                    trace=trace+A[i][j];
            }
        }
        System.out.println("The trace of the matrix is : "+trace);
    }
}
