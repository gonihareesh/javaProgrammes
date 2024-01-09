package Exception;

public class NestedException    
{
public static void main(String[] args) {
    try{
        System.out.println("printing OutOfBoundException");
        int arr[]=new int[3];
        arr[4]=8;
        try{
            String name="";
            System.out.println(name);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    finally{
        System.out.println("This is nested try block");
    }
}    
}
