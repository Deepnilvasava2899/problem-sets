class modifier 

{ 

    int i; 

    private int j; 

    public int k; 

     

    modifier() 

    { 

        i = 10; 

        j = 20; 

        k = 30; 

    } 

    modifier(int i,int j,int k) 

    { 

        this.i = i; 

        this.j = j; 

        this.k = k; 

    } 

    public void display() 

    { 

        System.out.println("i = "+i); 

        System.out.println("j = "+j); 

        System.out.println("k = "+k); 

    } 

    public int get_j() 

    { 

        return j; 

    } 

     

    public void set(int i,int j,int k) 

    { 

        this.i = i; 

        this.j = j; 

        this.k = k; 

    } 

} 

class modifier_check 

{ 

    public static void main(String a[]) 

    { 

        modifier m1 = new modifier(); 

        System.out.println("initialize via default constructor"); 

        m1.display(); 

         

        System.out.println("explicitely assign values"); 

        m1.i = 9; 

        m1.k= 99; 

        //m1.j = 999; private data members access within only member methods 

        m1.display(); 

         

        System.out.println("print values without member method"); 

        System.out.println("i = "+m1.i); 

        //System.out.println("i = "+m1.j); can't access 

        System.out.println("i = "+m1.get_j()); 

        System.out.println("i = "+m1.k); 

         

        System.out.println("initialize via parameters constructor"); 

        m1 = new modifier(1,2,3); 

        m1.display(); 

         

        System.out.println("re-initialize data member via member method"); 

        m1.set(8,88,888); 

        m1.display(); 

    } 

} 