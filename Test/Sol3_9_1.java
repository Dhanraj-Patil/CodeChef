import java.util.*;
class Sol3_9_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int [] a=new int [t];
        for(int z=0;z<t;z++)
        {
            int N,A,B;
            N= sc.nextInt();
            A= sc.nextInt();
            B= sc.nextInt();
            String S=sc.next();
            int [] count=new int [2];
            for(int i=0;i<N;i++){
                if(S.charAt(i)=='0')
                    count[0]++;
                else
                    count[1]++;
            }
            A=A*count[0];
            B=B*count[1];
            a[z]=A+B;
        }
        for(int z=0;z<t;z++){
            System.out.println(a[z]);
        }
    }
}