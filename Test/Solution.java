import java.util.*;
class Solution
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        int []a=new int[t];
        for(int z=1;z<=t;z++)
        {
            int A1=0,A2=0;
            int g1,s1,b1,g2,b2,s2;
            g1=sc.nextInt();
            s1=sc.nextInt();
            b1=sc.nextInt();
            g2=sc.nextInt();
            s2=sc.nextInt();
            b2=sc.nextInt();
            A1=g1+s1+b1;
            A2=g2+s2+b2;
            if(A1>A2)
                a[z-1]=1;
            else
                a[z-1]=2;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(a[i]);
        }
    }
}