package interfaceDemo;

public class HDFCloginService implements BankLoginService{
    String accountNumberDB="9866210";
    String passwordDB = "1419";
    @Override
    public boolean login(String accountNumber, String password) {
        if (accountNumber.equals(accountNumberDB) &&password.equals(passwordDB)){
            return true;
        }
        return false;
    }
}
