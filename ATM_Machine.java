import java.util.Scanner;

class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public double CheckBalance(){
        return balance;
    }
    public void Deposit(double amount){
        balance+=amount;
    }
    public boolean Withdraw(double amount){
        if(amount > balance || amount <= 0 )
          return false;
        else{
            balance-= amount;
            return true;
        }
    }
}

public class ATMmachine {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(50000.0);

        while(true){
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.println("Enter your choice");
        int ch = sc.nextInt();

        switch(ch){
            case 1:
            double balance = acc.CheckBalance();
            System.out.printf("Your account balance is %f \n",balance);
            break;

            case 2:
            System.out.println("Enter deposit amount");
            double money = sc.nextDouble();
            acc.Deposit(money);
            System.out.println("DEPOSIT SUCCESSFUL");
            break;

            case 3:
            System.out.println("Enter withdrawl amount");
            double Money = sc.nextDouble();
            if(acc.Withdraw(Money))
            System.out.println("WITHDRAWL SUCCESSFUL");
            else
            System.out.println("WITHDRAWL UNSUCCESSFUL");
            break;

            case 4:
            System.out.println("Thank you , GOODBYE!");
            System.exit(0);
            break;

            default:
            System.out.println("INVALID OPTION");
            System.out.println("Select a valid option");
        }
    }
}
}
