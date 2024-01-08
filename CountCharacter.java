public class CountCharacter 
{
 public static void main(String1[] args) {
    String data="this is about String count";
    int count=0;
    for(int i=0;i<data.length();i++){
        if(data.charAt(i)!=' ')
        count++;
    }
    System.out.println("Total number od characters in data:"+count);
 }   
}
