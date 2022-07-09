import java.util.*;
public class Sorting {
 public static void main(String args[])
    {
        int i,n,temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt(); 
        int a[]=new int[n];
        System.out.println("Enter all the elements:");
        for( i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        
        for( i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                   if(a[j]>a[j+1])
                   {
                       temp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=temp;
                   }
            }
        }
        System.out.println("Ascending Order:"+Arrays.toString(a));
       /* for (int i = 0; i < n-1 ; i++) 
        {
            System.out.print(a[i] + ",");
        }System.out.print(a[n - 1]); */
    }
    
}
