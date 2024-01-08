public class StringDemo1 {
    int studentId;
    String name;
    String address;
    String number;

    public StringDemo1(int studentId, String name, String address, String number) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    @Override
    public String toString() {
        return "studentId=" + studentId + ", name=" + name + ", address=" + address + ", number=" + number;
    }

    public static void main(String[] args) {
        StringDemo1 sd = new StringDemo1(125, "Krishna", "Hyderabad", "789456869");
        StringDemo1 sd1 = new StringDemo1(126, "Balaram", "Hyderabad", "789789456");
        System.out.println(sd);
        System.out.println(sd1);
    }

}
