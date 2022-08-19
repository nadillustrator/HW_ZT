package Bank;

class BankAccount {

    int id;
    String name;
    double balance;

    void replenishment(double replenishmentAmount){
        System.out.println("Hello, " + name +". Your balance: " + balance);
        System.out.println("Replenishment amount: " + replenishmentAmount);
        balance += replenishmentAmount;
        System.out.println("Your new balance: " + balance);
        System.out.println();
    }

    void withdrawal(double withdrawalAmount){
        System.out.println("Hello, " + name +". Your balance: " + balance);
        System.out.println("Withdrawal amount: " + withdrawalAmount);
        if(balance < withdrawalAmount){
            System.out.println("Insufficient funds on the account!");
        }else{
        balance -= withdrawalAmount;
        System.out.println("Your new balance: " + balance);

        }
        System.out.println();
    }


}

