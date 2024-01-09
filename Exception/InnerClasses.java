package Exception;

public class InnerClasses 
{
    private int number=30;
    class Inner{
        public void msg(){
            System.out.println("number is:"+number);
        }
     }
        public static void main(String[] args) {
            InnerClasses ic=new InnerClasses();
            InnerClasses.Inner ii=ic.new Inner();
            ii.msg();
        }
}
