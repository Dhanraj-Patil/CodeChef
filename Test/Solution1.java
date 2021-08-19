import java.util.*;
class Solution1
{
    public static int pair(int []A,int maximum)
    {
        int count=0;
        for(int i=0;i<4;i++)
        {
            for(int j=i;j<4;j++)
            {
                if(A[i]!=A[j] && A[i]!=-1 && A[j]!=-1)
                {
                    ++count;
                    A[i]=-1;
                    A[j]=-1;
                }
            }
        }
        if(maximum<=count)
            return maximum=count;
        else
            return maximum;

    }

    public static void copy(int []A,int []b)
    {
        for(int i=0;i<4;i++)
        {
            b[i]=A[i];
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        int []a=new int[t];
        for(int z=1;z<=t;z++)
        {
            int []A=new int[4];
            int []b=new int[4];
            int max=0;
            int m;
            for(int i=0;i<4;i++)
            {
                A[i]=sc.nextInt();
            }
            copy(A,b);
            m=pair(b,max);
            if(m>max)
                max=m;
            copy(A,b);
            int j=0;
            for(int i=1;i<4;i++)
            {

                int swap=A[j];
                A[j]=A[i];
                A[i]=swap;
                ++j;
                m=pair(b,max);
                if(m>max)
                    max=m;
                copy(A,b);
            }
            a[z-1]=max;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(a[i]);
        }
    }
}