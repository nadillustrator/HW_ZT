package Bank;


class BankAccountTest{
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Nadia";
        MyAccount.balance = 631;

        YourAccount.id = 1;
        YourAccount.name = "Mikel";
        YourAccount.balance = 1260.50;

        HisAccount.id = 1;
        HisAccount.name = "Eugene";
        HisAccount.balance = 300;

        System.out.println(MyAccount.name);

        MyAccount.replenishment( 200);
        HisAccount.withdrawal( 100);
        HisAccount.withdrawal( 300);

    }
}
