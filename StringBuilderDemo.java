public class StringBuilderDemo 
{
public static void main(String[] args) {
    String name="Hari";
    StringBuilder sb=new StringBuilder("Hello ");
    sb.append("mr."+name+" ");
    System.out.println(sb);
    System.out.println(sb.reverse());
    System.out.println(sb.length());
    System.out.println(sb.capacity());
    System.out.println(sb.charAt(6));
    // char ch=sb.charAt(5);
    // System.out.println(ch);
}    
}
