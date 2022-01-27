import java.util.*;
class Student
{
    public static void main(String args[])
    {
        Student obj=new Student();
        obj.Read();
    }
    
    void Read()
    {  
        String N;
        int i,r;
        int A[]=new int[5];
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the Name of the student : \n");
        N=obj1.next();
        System.out.println("Enter the RollNo of the student : \n");
        r=obj1.nextInt();
        System.out.println("Enter the Marks of the student : \n");
        for(i=0;i<5;i++)
        {
            System.out.println("Subject "+(i+1)+" : ");
            A[i]=obj1.nextInt();
        }
        Student obj=new Student();
        obj.Display(N,r,A);
    }
    void Display(String N,int r,int A[])
    {  
        int i;
        System.out.println("Name : "+N+"\nRoll No: "+r);
        System.out.println("Marks of "+N+" are as follows : \n");
        for(i=0;i<5;i++)
        System.out.println("Subject "+(i+1)+" : "+A[i]);
    }
}
