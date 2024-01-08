public class StringBuffereDemo1 
{
 public static void main(String[] args) {
    StringBuffer sb=new StringBuffer("Hello");
    sb.append(" Java");
    System.out.println(sb);
    sb.insert(6, "World ");
    System.out.println(sb);
    sb.replace(12, 16, "welcome");
    System.out.println(sb);
    sb.ensureCapacity(15);
    System.out.println(sb.capacity());
 }   
}
