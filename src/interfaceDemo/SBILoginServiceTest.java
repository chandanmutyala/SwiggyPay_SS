package interfaceDemo;

public class SBILoginServiceTest {
    public static void main(String[] args) {
        SBIbankLoginProcess sbIbankLoginProcess = new SBIbankLoginProcess();
        try {
           boolean loginStatus =  sbIbankLoginProcess.login("1235679","554563");

            if (loginStatus){
                System.out.println("Login success");
            }else {
                System.out.println("Login failed");
            }
        } catch (InvalidRuntimeOTPException e){
            System.out.println(e.getCode()+"    "+e.getMessage());
        }

    }
}
