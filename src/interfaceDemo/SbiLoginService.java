package interfaceDemo;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class SbiLoginService implements BankOtpValidationService {
    String accountNumberDb = "1235679";
    String passwordDb ="554563";
    String otp;
    Date otpExpireTime;
    public SbiLoginService(){

    }

    @Override
    public boolean login(String accountNumber, String password) {
        if (accountNumber.equals(accountNumberDb)&&password.equals(passwordDb)){
    return true;
    }
    return false;
}

    @Override
    public String generateOTP(String accountNumber) {
        if (accountNumber.equals(accountNumberDb)){
            otp =UUID.randomUUID().toString();
            Calendar otpExpiryCalender = Calendar.getInstance();
            otpExpiryCalender.add(Calendar.SECOND,60);
            System.out.println("otpExpiryCalender"+otpExpiryCalender.getTime());
            otpExpireTime = otpExpiryCalender.getTime();
            return otp ;
        }
        return null;
    }

    @Override
    public boolean validationOTP(String otp) throws InvalidOTPException {
        if (this.otp.equals(otp)){
            return true;
        }else {
            throw new InvalidOTPException(ErrorCode.NEOTERIC_INVALID_OTP_1000.getCode(),
                    ErrorCode.NEOTERIC_INVALID_OTP_1000.getMessage());
        }
        //return false;
    }
}
