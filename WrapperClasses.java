import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=12;

        Integer value=13;//Autoboxing
        System.out.println(value);
        Integer values=Integer.valueOf(num);//boxing
        int unboxing=values;//Auto-unboxing
        System.out.println(unboxing);
        String age="14";
        int typecasting=Integer.parseInt(age);
        System.out.println(typecasting);

        ArrayList<Integer> al=new ArrayList<>();
        al.add(11);//Auto-boxing..
        al.add(78);//Auto-boxing..
        al.add(Integer.valueOf(num));
        System.out.println(al);
    }
    
}
