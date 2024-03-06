package interfaceDemo;

public interface BankOtpValidationService extends BankLoginService {
    String generateOTP(String accountNumber);
    boolean validationOTP(String otp) throws Exception;
}
