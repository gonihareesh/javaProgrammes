public class ArrayDemo2 
{
public static void main(String[] args) {
    int arr[][]={{23,45,78},{24,46,79},{25,47,80}};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}    
}
