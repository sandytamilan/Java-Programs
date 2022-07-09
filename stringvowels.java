public class stringvowels {
    public static void main(String args[])
    {
    String s="sanjaykumar";
    int vowelscount=0;
    int consonantscount=0;
    s = s.toLowerCase();
    for(int i=0;i<s.length();i++)
    {
        
        
        if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')) 
        {
            vowelscount++;
        }
        else if((s.charAt(i)>='a')&&(s.charAt(i)<='z')){
            consonantscount++;
        }
    
    }
    System.out.println("The number of letters in the string is :"+vowelscount);
    System.out.println("The number of letters in the string is :"+consonantscount);
    }
    }