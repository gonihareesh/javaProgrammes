public class String2 {
    //reverse string ...
    public static void main(String[] args) {
        String rev=" ";
        String s="laziness creates and energy of spritual death";
        System.out.println(s.toString());
        for(int i=0;i<s.length();i++){
            char reverse=s.charAt(i);
         rev=reverse+rev;
            
        }
        System.out.print(rev);
        
    }
    
}
