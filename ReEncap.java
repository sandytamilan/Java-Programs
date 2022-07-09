// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Encap
{
    private String fname;
    private String lname;
    private int age;
    
    public int getAge()
    {
        return age;
    }
    public String getFname()
    {
        return fname;
    }
    public String getLname()
    {
        return lname;
    }
    public void setAge(int newAge)
    {
        this.age=newAge;
    }
    public void setFname(String newFname)
    {
        this.fname=newFname;
    }
    public void setLname(String newLname)
    {
        this.lname=newLname;
    }
}

public class ReEncap
{
    public static void main(String Args[])
    {
        Encap en = new Encap();
        en.setAge(10);
        en.setFname("Jay");
        en.setLname("Suriya");
        System.out.println("Fname : "+en.getFname());
        System.out.println("Lname : "+en.getLname());
        System.out.println("Age : "+en.getAge());
    }
}