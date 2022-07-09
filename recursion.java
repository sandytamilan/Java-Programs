import java.util.Scanner;
public class recursion {
    static int n1=0,n2=1,n3;
    static void printfibonacci(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            printfibonacci(count-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        printfibonacci(count-2);
    }
}
