public class ArrayDemo4 
{
public static void main(String[] args) {
    int arr[][]=new int[3][3];
    arr[0][0]=11;
    arr[0][1]=13;
    arr[0][2]=14;
    arr[1][0]=16;
    arr[1][1]=19;
    arr[1][2]=22;
    arr[2][0]=33;
    arr[2][1]=44;
    arr[2][2]=55;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

}    
}
