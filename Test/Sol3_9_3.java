import java.util.Scanner;

class Sol3_9_3 {

    public static int sort(int []a,int N,int D)
    {
        int max=0;
        for(int i=0;i<N;i++){
            if(a[i]<=D && a[i]>max){
                max=a[i];
                int swap=a[0];
                a[0]=a[i];
                a[i]=swap;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int [] a=new int [t];
        for(int z=0;z<t;z++) {
            int [] bags=new int[3];
            int D,E;
            for(int i=0;i<3;i++) {
                bags[i] = sc.nextInt();
            }
            D=sc.nextInt();
            E=sc.nextInt();
            int max=sort(bags,3,E);
            if(bags[1]+bags[2]<=D && max!=0){
                a[z]=1;
            }else
                a[z]=0;
        }
        for(int z=0;z<t;z++){
            if(a[z]==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}