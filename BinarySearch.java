import java.util.Arrays;

public class BinarySearch {
    public static void main(String1[] args) {
        int arr[] ={10,30,40,50,60,70};
        int search=40;
        int result=Arrays.binarySearch(arr, search);
        if(result<0){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is found at index: "+result);
        }
    }
    
}
