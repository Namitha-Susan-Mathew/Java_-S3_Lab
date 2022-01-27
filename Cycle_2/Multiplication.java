//Program to multiply two matrices
import java.util.*;
class Multiplication 
{
    public static void main(String[] args)
    {
        int [][]A=new int[10][10];
        int [][]B=new int [10][10];
        int [][]C=new int [10][10];
        int i,j,r1,r2,c1,c2,k;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix A : \n");
        r1=obj.nextInt();
        System.out.println("Enter the number of columns in the matrix A : \n");
        c1=obj.nextInt();
        System.out.println("Enter the elements into the matrix A : \n");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                A[i][j]=obj.nextInt();
            }
        }
        System.out.println("Enter the number of rows in the matrix B : \n");
        r2=obj.nextInt();
        System.out.println("Enter the number of columns in the matrix B : \n");
        c2=obj.nextInt();
        System.out.println("Enter the elements into the matrix B : \n");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                B[i][j]=obj.nextInt();
            }
        }
        if(c1==r2)
        {
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    C[i][j]=0;
                    for(k=0;k<c2;k++)
                    {
                        C[i][j]=C[i][j]+(A[i][k]*B[k][j]);
                    }

                }
            }
        }
        System.out.println("The matrix formed by the multiplication of the two given matrices is \n");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.println(+C[i][j]);
            }
        }
    }
}
