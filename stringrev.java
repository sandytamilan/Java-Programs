import java.util.*;
public class stringrev {
    public static void main(String[] args) {
String original,reverse="";
Scanner sc = new Scanner(System.in);

System.out.println("Enter the string ");
original = sc.nextLine();
int length = original.length();
for(int i =length-1;i>=0;i--)
{
    reverse = reverse + original.charAt(i);
}
if(original.equals(reverse))
{
    System.out.println("It is a palindrome");
}
else
{
System.out.println("It is not a palindrome");
}
}
}