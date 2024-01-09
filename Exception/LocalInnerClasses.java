package Exception;

public class LocalInnerClasses 
{
private int data=47;
void display(){
    class LocalClass{
        void msg(){
            System.out.println("This is local Class message "+data);
        }
        } 
        LocalClass local=new LocalClass();
        local.msg();
    }
    public static void main(String[] args) {
        LocalInnerClasses lic=new LocalInnerClasses();
        lic.display();
    }

   
}
