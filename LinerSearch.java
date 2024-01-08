import java.util.Scanner;

public class LinerSearch 
{
 public static int linear(int[] arr,int key){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
 }
    public static void main(String1[] args) {
       int[] arr={10,20,80,90,110};
       int key=80;
       System.out.println(key+" is found at index: "+linear(arr, key));
    }
    
}
