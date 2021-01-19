//program 2.2.2
public class factorial_static {
    public static void main(String[] args){
        int n=5;    
        System.out.println(fact1.fact(n));//the class.the member function one
    }
}
class fact1{
    public static int fact(int n)
    {
        if(n<=1)
            return n;
        else
            return n*fact(n-1);//the static  funtion doesnot contain 
    }
}
