public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("this is Stringbuffer data");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.toString());
    }

}
