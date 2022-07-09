import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Multiplication {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      for(int i=1;i<=10;i++)
      {
          System.out.printf("%d x %d = %d%n",a,i,a*i);
      }
    }
}
