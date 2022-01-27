//Program to find the largest element in an N*N matrix
import java.util.*;
class Largest 
{
    public static void main(String[] args) 
    {
        int [][]A = new int[10][10];
        int r,c,i,j,large;
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
        large=A[0][0];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(large<A[i][j])
                    large=A[i][j];
            }
        }
        System.out.println("The largest element in the matrix is "+large);
    }
}
