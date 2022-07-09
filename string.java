
public class string{
public static void main(String args[])
{
String s="I am new to java";
int count = 0;
for(int i=0;i<s.length();i++)
{
    if(s.charAt(i)!=' ')
    {
        count++;
    }
}
System.out.println("The number of letters in the string is :"+count);
}
}