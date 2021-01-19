class Stack{
    
    private int stack_array[] = new int[10];
    private int top = -1;
    
    void push(int value)
    {
        top++;
        if(top<10)
        {
            stack_array[top] = value;
        }
        else
        {
            top--;
            System.out.println("Stack Overflow");
        }
    }
    
    int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Unterflow");
            return 0;
        }
        else
            return stack_array[top--];
    }
}

public class javaap {
    
    public static void main(String[] args) {
        
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
		
		/*
		
		System.out.println("the length is:"+args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.println("the arguement "+args[i]+"and their length"+args[i].length());
		}
		*/
    }
}