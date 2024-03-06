package interfaceDemo;

public interface BankLoginService {
    boolean login(String accountNumber , String password) throws InvalidOTPException;
}
