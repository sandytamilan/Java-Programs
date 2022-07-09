import java.util.Scanner;
public class digiSum{
     static void digsum(int n)
     {
        int a=n;
        int sum=0;
        while(a>0||sum>9)
        {
            if(a==0)
            {
                a=sum;
                sum=0;
            }
            sum+=a%10;
            a=a/10;
        }
        System.out.println(sum);
     }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       digsum(n);
    }
    
}
