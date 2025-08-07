public class main1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("devadharshini");
        sb.append("good girl");
        System.out.println("after append:"+sb);
        sb.insert(13, " is a ");
        System.out.println("after insert:"+sb);
        sb.replace(0,5,"Deva");
        System.out.println("after replace:"+sb);
        sb.delete(3,4);
        System.out.println("after delete:"+sb);
        sb.reverse();
        System.out.println("after reverse:"+sb);
        sb.charAt(4);
        System.out.println("character at index 4;" +sb.charAt(4));

        
        sb.setCharAt(2,'a');
        System.out.println("after setCharAt:"+sb);
        sb.deleteCharAt(3);
        System.out.println("after deletecharat:"+sb);
        
        sb.ensureCapacity(20);
        System.out.println("After ensure capacity:"+sb.capacity());
        sb.toString();
        System.out.println("StringBuilder to string:"+sb.toString());
       
}
}