import java.util.* ;

public class stack_using_queue{

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x)
    {
        q2.add(x);
        while(!q1.isEmpty())
        {
            q2.add(q1.remove());
        }

        Queue<Integer> t = q1 ;
        q1 = q2 ;
        q2 = t ;
    }

    public int pop()
    {
        if(q1.isEmpty()) 
        {
            return -1 ;
        }
        return q1.remove();
    }

    public int top()
    {
        if(q1.isEmpty())
        {
            return -1 ;
        }
        return q1.peek();
    }

    public int size()
    {
        return q1.size();
    }
    public static void main(String[] args)
    {
        stack_using_queue st = new stack_using_queue();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.q1);
        System.out.println("Top Element: " + st.top());
        System.out.println("Popped element" + st.pop());
        System.out.println("Top Element: " + st.top());
        System.out.println("Popped element" + st.pop());
        System.out.println("Top Element: " + st.top());
        System.out.println("Popped element" + st.pop());
        System.out.println("Size" + st.size());
    }
}
