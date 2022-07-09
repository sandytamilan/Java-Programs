class Adder{  
    static int add(int a,int b){return a+b;}  
    static double add(double a,double b,double c){return a+b+c;}  
    }  
    public class Overloading{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(11.5,11.6,11.9));  
    }}  