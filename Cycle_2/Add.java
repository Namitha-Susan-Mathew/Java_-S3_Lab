//Program to add two matrices
import java.util.*;
class Add 
{
    public static void main(String[] args) 
    {
        int [][]A=new int[10][10];
        int [][]B=new int[10][10];
        int [][]C=new int[10][10];
        int i,j,r,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix A : \n");
        r=obj.nextInt();
        System.out.println("Enter the number of columns in the matrix A : \n");
        c=obj.nextInt();
        System.out.println("Enter the elements into the matrix A : \n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                A[i][j]=obj.nextInt();
            }
        }
        System.out.println("Enter the number of rows in the matrix B : \n");
        r=obj.nextInt();
        System.out.println("Enter the number of columns in the matrix B : \n");
        c=obj.nextInt();
        System.out.println("Enter the elements into the matrix B : \n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                B[i][j
        System.out.println("The matrix formed by addition of the two given matrices is \n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
                System.out.println(C[i][j]);
            }
        }
    }
}
