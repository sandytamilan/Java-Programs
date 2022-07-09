import java.util.Scanner;
public class perfectNumbers {
 public static void main(String args[]) {
    int a,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    a = sc.nextInt();
    for(int i=1;i<a;i++)
    {
        if(a%i==0)
        {
            sum =sum+i;
        }
    }
    if(sum==a){
    System.out.print(sum+" is a perfect number");
    }
 }   
}
