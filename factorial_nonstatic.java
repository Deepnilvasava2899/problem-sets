//program 2.2.1
public class factorial_nonstatic {
    public static void main(String[] args){
        int n=5;  
	fact1 f=new fact1();  
        System.out.println(f.fact(n));
    }
}
class fact1{
    public int fact(int n)
    {
        if(n<=1)
            return n;
        else
            return n*fact(n-1);
    }
}
