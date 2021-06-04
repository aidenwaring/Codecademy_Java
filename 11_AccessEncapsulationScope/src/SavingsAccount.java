package src;

public class SavingsAccount{
    // instance variables
    public String owner;
    public int balanceDollar;
    public double balanceEuro;

    public SavingsAccount(String owner, int balanceDollar){
        // owner instance variable is equal to the value passed in by local variable owner
        this.owner = owner;
        this.balanceDollar = balanceDollar;
        this.balanceEuro = balanceDollar * 0.85;
    }

    public void addMoney(int balanceDollar){
        System.out.println("Adding " + balanceDollar + " dollars to the account.");
        this.balanceDollar += balanceDollar;
        // this.balance = this.balance + balanceDollar
        // instance variable balance is equal to itself plus value provided by local variable balanceDollar
        System.out.println("The new balance is " + this.balanceDollar + " dollars.");
    }

    public static void main(String[] args){
        SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
        zeusSavingsAccount.addMoney(2000);
    }
}