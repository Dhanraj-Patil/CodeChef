import java.util.*;

class Solution2
{
    public static void sort(int[] b,int p, int n)
    {
//        int c=0;
        for(int i=0;i<n-1;i++)
        {
            int j=i+1;
            while(b[j-1]>b[j] && j-1>=0)
            {
                int swap=b[j-1];
                b[j-1]=b[j];
                b[j]=swap;
//                int s=c[j-1];
//                c[j-1]=c[j];
//                c[j]=s;
                --j;

            }
        }
//        return c;
    }



    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int [] a=new int[t];
        for(int z=1;z<=t;z++)
        {
           int N=sc.nextInt();
           int p=sc.nextInt();
           int K=sc.nextInt();
//           int[] c=new int[N];
           int[] b=new int[N];

           for(int i=0;i<N;i++)
           {
               b[i]=i%K;
//               c[i]=i;
           }

           int e=b[p];
           int count=0;
           for(int i=0;i<p;i++)
           {
               if(b[i]==e)
                   ++count;
           }

//           int d=sort(b,p,N);

            sort(b,p,N);

           for(int i=0;i<N;i++)
           {
               if(b[i]==e)
               {
                   a[z-1]=count+i+1;
                   break;
               }
           }
//           for(int i=0;i<N;i++)
//           {
//               if(c[i]==p)
//               {
//                   a[z-1]=i+1;
//                   break;
//               }
//           }
//            a[z-1]=d;
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(a[i]);
        }
    }
}