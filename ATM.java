import java.util.*;
public class ATM {
    private float balance; //encapsulation
    private int pin =12345;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void checking() {
        System.out.print("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid pin:");
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance:");
        System.out.println("2. Withdraw Money:");
        System.out.println("3. Deposit Money:");
        System.out.println("4. Exit:");
        Scanner sc = new Scanner((System.in));
        int opt = sc.nextInt();
        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.print("Enter a valid choice :");
        }
    }
    public void checkBalance(){
        System.out.println("\nBalance: "+balance);
        menu();
    }
    public void  withdrawMoney(){
        System.out.print("Enter Amount to Withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>balance){
            System.out.println("\nInsufficient Balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Money Withdraw Successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.print("Enter the Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("Money Deposited Successful");
        menu();
    }
}
class SavingsAccount extends ATM { //Inheritance
    @Override
    public void depositMoney() {    // Polymorphism:Override the depositMoney method
        System.out.print("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        setBalance(getBalance() + amount + 10); // Added a bonus for a savings account
        System.out.println("Money Deposited Successful (including a bonus)");
        menu();
    } 
}
class ATMMachine {
    public static void main(String[] args) {

        SavingsAccount obj = new SavingsAccount();
        ATM obj1 = new ATM();
        obj1.checking();
    }
}