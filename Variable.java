public class Variable{
    int number=10;
    static String name="krishna";
    public static void main(String1[] args) {
        //we can not applay static for local variable
        double salary=10000;
        System.out.println(name);
        System.out.println(salary);
        Variable v=new Variable();
        System.out.println(v.number);
    }
}