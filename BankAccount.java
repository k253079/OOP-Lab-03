package accessModifiers;

public class BankAccount {
    int accountNumber;
    String accountHoldername;
    int initialBalance;
    BankAccount(int num ,String name){
         this.accountNumber = num;
        this.accountHoldername = name;
        initialBalance = 0;
    }
    
    BankAccount(int num ,String name,int balance){
        this.accountNumber = num;
        this.accountHoldername = name;
        this.initialBalance = balance;

    }
    void display(){
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Name: "+ accountHoldername);
        System.out.println("Account Balance: "+ initialBalance);
    }
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(1,"Kamran",500000);
        BankAccount account2 = new BankAccount(2,Uzair);
    }
}


