package interfaceDemo;

import java.util.UUID;

public class SBIbankLoginProcess implements BankLoginService{
    SbiLoginService sbiLoginService;
   public SBIbankLoginProcess(){
        this.sbiLoginService = new SbiLoginService();
    }

    @Override
    public boolean login(String accountNumber, String password)  {
       if (sbiLoginService.login(accountNumber,password)){
           String otp = sbiLoginService.generateOTP(accountNumber);
           System.out.println(otp);
           boolean validateOTP = false;
           try {
               validateOTP = sbiLoginService.validationOTP(UUID.randomUUID().toString());
           } catch (InvalidOTPException e) {
               System.out.println("Error Occured" +e);
               throw new InvalidRuntimeOTPException(e.getCode(),e.getMessage());
           }catch (Exception e){

           }
           if (validateOTP){
               System.out.println("Valid otp &Login is Successfull");
           }else {
               System.out.println("Invalid otp &Login Failed");
           }
           return validateOTP;
       }
       else {
           System.out.println("Invalid Crdentails");
           return false;
       }

    }



}
