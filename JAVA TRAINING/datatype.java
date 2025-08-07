import java.util.Scanner; 
public class datatype {
    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Integer");
        int a = sc.nextInt();
        System.out.println("Enter Float");
        float b = sc.nextFloat();
        System.out.println("Enter Double");
        double c = sc.nextDouble();
        System.out.println("Enter Long");
        long d = sc.nextLong();
        System.out.println("Enter Character");
        char e = sc.next().charAt(0);
        System.out.println("Enter Short");
        short f = sc.nextShort();
        System.out.println("Enter Byte");
        byte g = sc.nextByte();
        System.out.println("Enter Boolean");
        boolean h = sc.nextBoolean();
        
        
    }
}
