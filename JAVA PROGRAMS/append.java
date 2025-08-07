import java.util.Scanner;
public class append {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first sring");
        String str = sc.nextLine();
        System.out.println("enter the second string");
        String str2 = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        
        System.out.println("resulting string:");
        sc.close();

    }
}
