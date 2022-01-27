//Program to find transpose of a matrix
import java.util.*;
class Transpose 
{
    public static void main(String[] args) 
    {
        int [][]A = new int[10][10];
        int r,c,i,j;
        int [][]B = new int[10][10];
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
        System.out.println("The transpose of the matrix is : \n");
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                B[i][j]=A[j][i];
                System.out.println(B[i][j]);
            }
        }
    }
}
