package swiggyLite;

public class Login {

        //public boolean status;

        private String userName="Anil@123";
        private String password="Aa1234";

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

    public boolean loginStatus(LoginDetails loginDetails) throws InvalidPasswordException {
        if (userName.equals(loginDetails.userName) && password.equals(loginDetails.userPasswoard)) {
            System.out.println("login successful");
            return true;
        } else {
            System.out.println("login failed");
            throw new InvalidPasswordException(ErrorCodes.SWIGGY_INVALID_OTP_1000.getCode(),
                    ErrorCodes.SWIGGY_INVALID_OTP_1000.getMessage());

        }
    }
    }

