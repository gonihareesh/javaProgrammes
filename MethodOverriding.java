class Bank{
 double balance;
 Bank(double balanace){
    this.balance=balanace;
 }
double calculateInterest(){
    return 0.0;
 }
}

class Saving extends Bank{
double interestRate;
Saving(double balance,double interestRate){
    super(balance);
    this.interestRate=interestRate;
}
@Override
double calculateInterest() {
    
    return balance*(interestRate / 100);
}

}
class Current extends Bank{
    int term;
    double interestRate;
    Current(double balanace,double interestRate,int term){
        super(balanace);
       this.interestRate=interestRate;
        this.term=term;
    }
    @Override
    double calculateInterest() {
        // TODO Auto-generated method stub
       return balance*(interestRate / 100)*term;
    }
}
public class MethodOverriding {
    public static void main(String1[] args) {
        
   
    Saving s=new Saving(5000, 5);
    Current c=new Current(10000, 15, 2);
    System.out.println(s.calculateInterest());
    System.out.println(c.calculateInterest());
}
 }
