import java.lang.StringBuilder;
public class main{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");
        sb.insert(5," ,");
        sb.replace(0,5,"Hi");
        sb.delete(3,4);
        System.out.println(sb);
        

    }
}
