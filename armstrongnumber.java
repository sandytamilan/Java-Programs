import java.util.*;
class arstrongnumber{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t, rem, result=0;
        t= n;
        while(t!=0)
        {
            rem=t%10;
            result+=rem*rem*rem;
            t=t/10;
        }
        if(result==n)
        {
            System.out.println(n+"is a armstrong number");
        }
        else
        {
            System.out.println(n+"is not a armstrong number");

        }
    }
}
