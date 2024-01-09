package Exception;

public class ExceptionDemo3 
{
public static void main(String[] args) {
    try {
        int arr[]=new int[3];
        arr[4]=10;
        int number=30/0;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    finally{

    System.out.println("this is multiple catch methods");
    }
}    
}
