package homeworks.exerciseBank;

public class BankAccount {

    private Customer accountOwner;
    private TypeOfBankAccounts typeOfAccount;
    private String stateOfAccount;

    public BankAccount(Customer accountOwner, TypeOfBankAccounts typeOfAccount, String stateOfAccount) {
        this.accountOwner = accountOwner;
        this.typeOfAccount = typeOfAccount;
        this.stateOfAccount = stateOfAccount;
    }

    public Customer getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(Customer accountOwner) {
        this.accountOwner = accountOwner;
    }

    public TypeOfBankAccounts getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(TypeOfBankAccounts typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public String getStateOfAccount() {
        return stateOfAccount;
    }

    public void setStateOfAccount(String stateOfAccount) {
        this.stateOfAccount = stateOfAccount;
    }

    @Override
    public String toString() {
        return "Włąściciel konta: " + accountOwner + ',' + " typ konta : " + typeOfAccount
                + ',' + " stan konta : " + stateOfAccount;
    }

}
