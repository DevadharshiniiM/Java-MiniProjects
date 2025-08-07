public class palindrome {
public static void main(String[] args) {
    String str = "dog";
    String rev = "";
    for(int i= str.length()-1;i>=0;i--)
    {
        rev+= str.charAt(i);
    }
    if(str.equals(rev))
    {
        System.out.println("The String is a Palindrome");
    }
    else{
        System.out.println("The String is not a palindrome");
    }
}
}
