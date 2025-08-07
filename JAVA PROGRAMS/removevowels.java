public class removevowels{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Devadharshini");

        String str = sb.toString().replaceAll("[aeiouAEIOU]", "");
        sb = new StringBuilder(str);

        System.out.println("Without vowels: " + sb.toString());
    }
}
