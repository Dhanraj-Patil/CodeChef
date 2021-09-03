import java.util.*;
class Sol3_9_2 {

    public static void sort(int []a,int N)
    {
        for(int i=0;i<N-1;i++){
            int k=i+1;
            while(a[i]>a[k]){
            int swap=a[i];
            a[i]=a[k];
            a[k]=swap;
            --k;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int [] a=new int [t];
        for(int z=0;z<t;z++) {
            int N=sc.nextInt();
            int n;
            int [] odd=new int[N];
            int [] even=new int[N];
            int c1=0,c2=0;
            for(int i=0;i<N;i++){
                n=sc.nextInt();
                if(n%2==0){
                    even[c1]=n;
                    ++c1;
                }else{
                    odd[c2]=n;
                    ++c2;
                }
            }
            int sum=0;
            sort(odd,c2);
            sort(even,c1);

            for(int i=N;i>=1;i--){
                if(i%2==0 && c2>0){
                    --c2;
                    sum=sum+((odd[c2]+i)%2);

                }else if(i%2!=0 && c1>0){
                    --c1;
                    sum=sum+((even[c1]+i)%2);

                }
            }
            a[z]=sum;
        }
        for(int z=0;z<t;z++){
            System.out.println(a[z]);
        }
    }
}