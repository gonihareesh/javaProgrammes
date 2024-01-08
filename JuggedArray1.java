public class JuggedArray1 
{
public static void main(String[] args) {
    int arr[][]={{12,22},{11,45,89},{78,33,56,1}};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}    
}
