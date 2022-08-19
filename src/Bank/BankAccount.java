package Bank;

class BankAccount {

    int id;
    String name;
    double balance;

    public static double popolnenieScheta(BankAccount bankAccount, double a){
        bankAccount.balance += a;
        return bankAccount.balance;
    }

    public static double snyatieSoScheta(BankAccount bankAccount, double a){
        bankAccount.balance -= a;
        if(bankAccount.balance < a){
            System.out.println("Недостаточно средств на счете.");
            return bankAccount.balance;
        }
        return bankAccount.balance;
    }


}

